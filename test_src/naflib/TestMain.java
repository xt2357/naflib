package naflib;

import java.io.IOException;

public class TestMain {
	
	private static String filename = "test_file/NAF like document lower case.json";
	
	public static void main(String[] args) throws IOException {
		// test read write file
		String content = ReadWriteManager.readFromFile(filename, "UTF-8");
		System.out.println(content);
		ReadWriteManager.writeToFile(content, "test_file/copy.json", "UTF-8");
		// test read load NafLikeDocument by file
		NafLikeDocument document = ReadWriteManager.loadFromFile(filename);
		ReadWriteManager.saveToFile(document, "test_file/dump.json");
		// test save update by mongo
		String id = ReadWriteManager.saveNewToMongo(document);
		System.out.println(id);
		document.setTitle("new title");
		ReadWriteManager.updateToMongoById(document, id);
		// retrieve modified document and display
		NafLikeDocument retrievedDocument = ReadWriteManager.loadFromMongoById(id);
		System.out.println(ReadWriteManager.saveToString(retrievedDocument));
		// test serialize empty doc, null pointer should be convert to null value in json
		NafLikeDocument emptydoc = new NafLikeDocument();
		System.out.println(ReadWriteManager.saveToString(emptydoc));
	}
}
