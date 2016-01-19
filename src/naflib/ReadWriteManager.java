package naflib;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;
import com.mongodb.client.result.UpdateResult;
import com.mongodb.util.JSON;


public class ReadWriteManager {
	
	private static final String ENCODING = "UTF-8";
	private static final String CONNECT_STRING = "mongodb://udms:123456@10.13.93.251:27017/";
	private static final String DATABASE = "CDC";
	private static final String COLLECTION = "NafLikeDocument";
	
	public static String readFromFile(String filename, String encoding) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), Charset.forName(encoding)));
		String ans = "";
		boolean isfirstline = true;
		String line = "";
		while ((line = br.readLine()) != null) {
			if (!isfirstline) {
				ans += "\r\n";
			}
			ans += line;
			isfirstline = false;
		}
		br.close();
		return ans;
	}
	
	public static void writeToFile(String document, String filename, String encoding) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename), Charset.forName(encoding)));
		bw.write(document);
		bw.flush();
		bw.close();
	}
	
	public static String saveToString(NafLikeDocument document) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(document);
	}
	
	public static void saveToFile(NafLikeDocument document, String filename) throws JsonProcessingException, IOException {
		writeToFile(saveToString(document), filename, ENCODING);
	}
	
	public static String saveNewToMongo(NafLikeDocument document) throws JsonProcessingException {
		MongoClient client = new MongoClient(new MongoClientURI(CONNECT_STRING));
		@SuppressWarnings("deprecation")
		DB db = client.getDB(DATABASE);
		DBCollection collection = db.getCollection(COLLECTION);
		DBObject object = (DBObject) JSON.parse(saveToString(document));
		collection.insert(object);
		client.close();
		return object.get("_id").toString();
	}
	
	public static void updateToMongoById(NafLikeDocument document, String id) throws JsonProcessingException {
		MongoClient client = new MongoClient(new MongoClientURI(CONNECT_STRING));
		MongoDatabase database = client.getDatabase(DATABASE);
		MongoCollection<BasicDBObject> collection = database.getCollection(COLLECTION, BasicDBObject.class);
		BasicDBObject object = (BasicDBObject) JSON.parse(saveToString(document));
		UpdateResult updateResult = collection.replaceOne(Filters.eq("_id", new ObjectId(id)), object);
		client.close();
		if (updateResult.getMatchedCount() == 0) {
			throw new IdNotExistException("Id to be updated does not exist.");
		}
	}
	
	public static NafLikeDocument loadFromString(String document) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		return mapper.readValue(document, NafLikeDocument.class);
	}
	
	public static NafLikeDocument loadFromFile(String filename) throws JsonParseException, JsonMappingException, IOException {
		return loadFromString(readFromFile(filename, ENCODING));
	}
	
	public static NafLikeDocument loadFromMongoById(String id) throws JsonParseException, JsonMappingException, IOException {
		MongoClient client = new MongoClient(new MongoClientURI(CONNECT_STRING));
		MongoDatabase database = client.getDatabase(DATABASE);
		MongoCollection<Document> collection = database.getCollection(COLLECTION);
		Document ans = collection.find(Filters.eq("_id", new ObjectId(id))).projection(Projections.excludeId()).first();
		client.close();
		if (ans == null) {
//			throw new IdNotExistException("Id to be load does not exist.");
			return null;
		}
		return loadFromString(ans.toJson());
	}
	
	public static void deleteFromMongoById(String id) {
		MongoClient client = new MongoClient(new MongoClientURI(CONNECT_STRING));
		MongoDatabase database = client.getDatabase(DATABASE);
		MongoCollection<Document> collection = database.getCollection(COLLECTION);
		collection.deleteOne(Filters.eq("_id", new ObjectId(id)));
		client.close();
	}
}
