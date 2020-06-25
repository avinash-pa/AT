package at_preparer;

import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AT_Excel {

	
	XSSFWorkbook ATScript;
	XSSFSheet ATScriptSheet;
	
	private AT_Excel(){
		ATScript = null;
		ATScriptSheet = null;
	}
	
	public void preparer() throws IOException{
		
		 ATScript = new XSSFWorkbook();
		 
		 //ATScript.createSheet("")
		 
		 File[] files = new File("D:\\AT_GENERATOR_ENVIRNOMENT\\AT Script").listFiles((dir, name) -> name.endsWith(".xlsx"));
		 for(File file: files) {
			 int length = file.getName().length();
			 for (int i=length-5;i>length-8;i--) {
				System.out.println(file.toString().charAt(i));
			} 
			System.out.println("\n");
		 }
		 

	}

	public static void main(String[] args) {
		 try {
			 new AT_Excel().preparer();
		 }
		 catch(Exception e) {
			 e.getMessage();
		 }
		
		
	}
}
