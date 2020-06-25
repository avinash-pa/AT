package json_converter;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public interface json_module_interface {

	String filelocation = "D:\\AT_GENERATOR_ENVIRNOMENT\\JSON\\jsonformat.txt";
	
	public BufferedReader fileReader() throws IOException;
	
	public File fileCreater(HashMap<String ,String> payloadHeaderFields, HashMap<String ,String> payloadBodyFields);
	
	public void fileValidator();
	
	public void fileDestroyer();
	
	
}
