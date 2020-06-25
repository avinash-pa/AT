package json_converter;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTester {

	public static void main(String[] args) {

		StringBuffer stringBuffer = new StringBuffer();
		Date now = new Date();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS");
		simpleDateFormat.format(now, stringBuffer, new FieldPosition(0));
		
		
		System.out.println(stringBuffer.toString());
	}
	
}
