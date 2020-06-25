package json_converter;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//import java.util.HashMap;
import java.io.BufferedReader;

public abstract class JsonReader implements json_module_interface {

	@Override
	public BufferedReader fileReader() throws IOException {

		File file = new File(filelocation);

		FileReader filereader = new FileReader(file);

		BufferedReader bufferreader = new BufferedReader(filereader);

//		String jsonField;
//		while ((jsonField = bufferreader.readLine()) != null)
//			System.out.println(jsonField);

		return bufferreader;

	}

	/*
	 * This is code to test file code work fine or not
	 * 
	 * @Override public File file_creater() { return null; }
	 * 
	 * @Override public void file_validator(FileReader filereader) {
	 * 
	 * }
	 * 
	 * @Override public void file_destroyer() {
	 * 
	 * }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * try {
	 * 
	 * File file = new
	 * File("D:\\\\AT_GENERATOR_ENVIRNOMENT\\\\JSON\\\\jsonformat.txt");
	 * 
	 * new JsonReader().file_reader(new FileReader(file));
	 * 
	 * throw new Exception();
	 * 
	 * } catch(Exception e) {
	 * 
	 * e.getMessage();
	 * 
	 * } }
	 *
	 * @Override public File fileCreater(HashMap<String, String>
	 * payloadHeaderFields, HashMap<String, String> payloadBodyFields) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public void fileValidator() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void fileDestroyer() {
	 * 
	 * 
	 * 
	 * 
	 * public static void main(String[] args) {
	 * 
	 * try {
	 * 
	 * new JsonReader().fileReader();
	 * 
	 * throw new Exception();
	 * 
	 * } catch(Exception e) {
	 * 
	 * e.getMessage();
	 * 
	 * } } }
	 * 
	 */

}
