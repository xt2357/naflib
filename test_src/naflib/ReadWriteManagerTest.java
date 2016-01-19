package naflib;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.mongodb.util.JSON;

public class ReadWriteManagerTest {

	@Test
	public void testReadFromFile() throws IOException {
		String content = ReadWriteManager.readFromFile("test_file/NAF like document lower case.json", "UTF-8");
		ReadWriteManager.writeToFile(content, "test_file/copy.json", "UTF-8");
		String content1 = ReadWriteManager.readFromFile("test_file/NAF like document lower case.json", "UTF-8");
		assertEquals(content, content1);
	}

	@Test
	public void testWriteToFile() throws IOException {
		String content = ReadWriteManager.readFromFile("test_file/NAF like document lower case.json", "UTF-8");
		ReadWriteManager.writeToFile(content, "test_file/copy.json", "UTF-8");
		String content1 = ReadWriteManager.readFromFile("test_file/NAF like document lower case.json", "UTF-8");
		assertEquals(content, content1);
	}

	@Test
	public void testSaveToString() throws IOException {
		String content = ReadWriteManager.readFromFile("test_file/NAF like document lower case.json", "UTF-8");
		NafLikeDocument document = ReadWriteManager.loadFromString(content);
		String content1 = ReadWriteManager.saveToString(document);
		assertEquals(JSON.parse(content).toString(), JSON.parse(content1).toString());
	}

	@Test
	public void testSaveToFile() throws IOException {
		String content = ReadWriteManager.readFromFile("test_file/NAF like document lower case.json", "UTF-8");
		NafLikeDocument document = ReadWriteManager.loadFromString(content);
		ReadWriteManager.saveToFile(document, "test_file/dump.json");
		String content1 = ReadWriteManager.saveToString(ReadWriteManager.loadFromFile("test_file/dump.json"));
		assertEquals(JSON.parse(content).toString(), JSON.parse(content1).toString());
	}

	@Test
	public void testSaveNewToMongo() throws JsonParseException, JsonMappingException, IOException {
		NafLikeDocument document = ReadWriteManager.loadFromFile("test_file/NAF like document lower case.json");
		String id = ReadWriteManager.saveNewToMongo(document);
		NafLikeDocument document2 = ReadWriteManager.loadFromMongoById(id);
		assertEquals(ReadWriteManager.saveToString(document), ReadWriteManager.saveToString(document2));
		ReadWriteManager.deleteFromMongoById(id);
	}

	@Test
	public void testUpdateToMongoById() throws JsonParseException, JsonMappingException, IOException {
		NafLikeDocument document = ReadWriteManager.loadFromFile("test_file/NAF like document lower case.json");
		String id = ReadWriteManager.saveNewToMongo(document);
		NafLikeDocument document2 = ReadWriteManager.loadFromFile("test_file/NAF like document lower case.json");
		document2.setTitle("new title");
		ReadWriteManager.updateToMongoById(document2, id);
		assertEquals(ReadWriteManager.saveToString(document2), ReadWriteManager.saveToString(ReadWriteManager.loadFromMongoById(id)));
		ReadWriteManager.deleteFromMongoById(id);
	}

	@Test
	public void testLoadFromString() throws IOException {
		String content = ReadWriteManager.readFromFile("test_file/NAF like document lower case.json", "UTF-8");
		NafLikeDocument document = ReadWriteManager.loadFromString(content);
		String content1 = ReadWriteManager.saveToString(document);
		assertEquals(JSON.parse(content).toString(), JSON.parse(content1).toString());
	}

	@Test
	public void testLoadFromFile() throws IOException {
		String content = ReadWriteManager.readFromFile("test_file/NAF like document lower case.json", "UTF-8");
		NafLikeDocument document = ReadWriteManager.loadFromString(content);
		ReadWriteManager.saveToFile(document, "test_file/dump.json");
		String content1 = ReadWriteManager.saveToString(ReadWriteManager.loadFromFile("test_file/dump.json"));
		assertEquals(JSON.parse(content).toString(), JSON.parse(content1).toString());
	}

	@Test
	public void testLoadFromMongoById() throws JsonParseException, JsonMappingException, IOException {
		NafLikeDocument document = ReadWriteManager.loadFromFile("test_file/NAF like document lower case.json");
		String id = ReadWriteManager.saveNewToMongo(document);
		NafLikeDocument document2 = ReadWriteManager.loadFromMongoById(id);
		assertEquals(ReadWriteManager.saveToString(document), ReadWriteManager.saveToString(document2));
		ReadWriteManager.deleteFromMongoById(id);
	}
	
	@Test
	public void testDeleteFromMongoById() throws JsonParseException, JsonMappingException, IOException {
		NafLikeDocument document = ReadWriteManager.loadFromFile("test_file/NAF like document lower case.json");
		String id = ReadWriteManager.saveNewToMongo(document);
		ReadWriteManager.deleteFromMongoById(id);
		assertEquals(null, ReadWriteManager.loadFromMongoById(id));
	}

}
