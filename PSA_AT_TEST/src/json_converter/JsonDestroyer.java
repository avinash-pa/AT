package json_converter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class JsonDestroyer extends JsonValidator {

	@Override
	public void fileDestroyer() {

		File file = new File(filelocation);

		if(file.exists()==true) {

			System.out.println("File exist !!!");
			
			try {
				
				FileWriter fileWriter = new FileWriter(file);

				fileWriter.write("");

				fileWriter.close();
			
				file.deleteOnExit();

			}

			catch (IOException e) {

				e.printStackTrace();
				
				e.getCause();

			}
			
		}
		else {
			
			System.out.println("File not exist !!!!!");
		
		}		

	}

	
//	public static void main(String[] args) {
//		
//		JsonDestroyer destroy = new JsonDestroyer();
//		
//		destroy.fileDestroyer();
//		
//	}

}
