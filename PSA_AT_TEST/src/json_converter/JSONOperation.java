package json_converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class JSONOperation extends JsonDestroyer {

	public void JSONCreater() {

		try {

			Scanner JSONHeaderCountInput = new Scanner(System.in);

			BufferedReader JSONHeaderKey = new BufferedReader(new InputStreamReader(System.in));

			BufferedReader JSONHeaderValue = new BufferedReader(new InputStreamReader(System.in));

//			BufferedReader JSONHeaderCountInput = new BufferedReader(new InputStreamReader(System.in));

			HashMap<String, String> HeaderFields = new HashMap<String, String>();

			int headerCount = 0;

			Scanner JSONBodyCountInput = new Scanner(System.in);

			BufferedReader JSONBodyKey = new BufferedReader(new InputStreamReader(System.in));

			BufferedReader JSONBodyValue = new BufferedReader(new InputStreamReader(System.in));

//			BufferedReader JSONBodyCountInput = new BufferedReader(new InputStreamReader(System.in));

			HashMap<String, String> BodyFields = new HashMap<String, String>();

			int bodyCount = 0;

			System.out.println("Enter the no. of fields in header : - ");

			headerCount = JSONHeaderCountInput.nextInt();

			for (int i = 0; i < headerCount; i++) {

				System.out.println("Enter the Header Key  : - ");

				String jsonheaderkey = JSONHeaderKey.readLine();

				System.out.println("Enter the Header Value  : - ");

				String jsonheadervalue = JSONHeaderValue.readLine();

				HeaderFields.put(jsonheaderkey, jsonheadervalue);

			}

			System.out.println("Enter the no. of fields in body : - ");

			bodyCount = JSONBodyCountInput.nextInt();

			for (int i = 0; i < bodyCount; i++) {

				System.out.println("Enter the Body Key  : - ");

				String jsonbodykey = JSONBodyKey.readLine();

				System.out.println("Enter the Body Value  : - ");

				String jsonbodyvalue = JSONBodyValue.readLine();

				BodyFields.put(jsonbodykey, jsonbodyvalue);

			}

			JSONHeaderKey.close();

			JSONHeaderValue.close();

			JSONBodyKey.close();

			JSONBodyValue.close();

//			System.out.println(" Header Fields : - ");
//
//			for (String fields : HeaderFields.keySet()) {
//
//				System.out.println(fields + " " + HeaderFields.get(fields) + " ");
//
//			}
//
//			System.out.println(" Body Fields : - ");
//
//			for (String fields : BodyFields.keySet()) {
//
//				System.out.println(fields + " " + BodyFields.get(fields) + " ");
//
//			}

			fileCreater(HeaderFields, BodyFields);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void JSONReader() {

		try {

			BufferedReader fileReader = fileReader();

			String jsonfields;

			while ((jsonfields = fileReader.readLine()) != null)
				System.out.println(jsonfields);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void JSONDestroyer() {

		fileDestroyer();

	}

	public void JSONValidator() {

		fileValidator();
	}

}
