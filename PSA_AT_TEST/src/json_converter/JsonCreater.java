package json_converter;

import java.io.*;
import java.util.HashMap;

import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public abstract class JsonCreater extends JsonReader {

	@Override
	public File fileCreater(HashMap<String, String> payloadHeaderFields, HashMap<String, String> payloadBodyFields) {

		JSONObject header = new JSONObject();

		JSONObject body = new JSONObject();

		JSONObject template_json_1 = new JSONObject();

		JSONObject template_json_2 = new JSONObject();

		FileWriter filewriter = null;

		File file = new File(filelocation);

		try {

			for (HashMap.Entry headerFields : payloadHeaderFields.entrySet()) {

				template_json_1.put(headerFields.getKey(), headerFields.getValue());

			}

			header.put("gtosplus_ops_header", template_json_1);

			for (HashMap.Entry bodyFields : payloadBodyFields.entrySet()) {

				template_json_2.put(bodyFields.getKey(), bodyFields.getValue());

			}

			body.put("gtosplus_ops_body", template_json_2);

			body.putAll(header);

			filewriter = new FileWriter(file);

			filewriter.write(toPrettyFormat(body.toString()));

			filewriter.close();

		} catch (IOException e) {

			e.getMessage();

		}

		return file;

		/*
		 * this is hard coded sample example please consider that way....
		 * 
		 * JSONObject header = new JSONObject();
		 * 
		 * JSONObject body = new JSONObject();
		 * 
		 * JSONObject template_json_1 = new JSONObject();
		 * 
		 * JSONObject template_json_2 = new JSONObject();
		 * 
		 * JSONArray payload = new JSONArray();
		 * 
		 * 
		 * template_json_1.put("source_m", "TCCS"); template_json_1.put("event_dt",
		 * "2020-02-13T16:21:25.347919"); template_json_1.put("event_id",
		 * "HTGO_TEST_161_002"); template_json_1.put("trans_id", "HTGO");
		 * header.put("gtosplus_ops_header",template_json_1);
		 * 
		 * 
		 * template_json_2.put("ht_m", "TPM1612"); template_json_2.put("ht_type_c",
		 * "PM"); template_json_2.put("locn_type_c", "EB");
		 * template_json_2.put("locn_x", "EX,1612"); template_json_2.put("eqmt_id",
		 * "1612"); template_json_2.put("eqmt_m", "EX001612");
		 * body.put("gtosplus_ops_body",template_json_2);
		 * 
		 * 
		 * 
		 * payload.add(header); payload.add(body);
		 * 
		 * System.out.println(header.toString()); System.out.println(body.toString());
		 * System.out.println(payload.toString());
		 * 
		 * 
		 * body.putAll(header);
		 * 
		 * 
		 * File file = new
		 * File("D:\\\\AT_GENERATOR_ENVIRNOMENT\\\\JSON\\\\jsonformat.txt");
		 * 
		 * FileWriter filewriter = new FileWriter(file);
		 * 
		 * filewriter.write(toPrettyFormat(body.toString()));
		 * 
		 * filewriter.close();
		 * 
		 * File file = new
		 * File("D:\\\\AT_GENERATOR_ENVIRNOMENT\\\\JSON\\\\jsonformat.txt");
		 * 
		 * FileWriter filewriter = new FileWriter(file);
		 * 
		 * filewriter.write(toPrettyFormat(body.toString()));
		 * 
		 * filewriter.close();
		 * 
		 * throw new Exception();
		 * 
		 * } catch(Exception e) { e.getMessage(); } return file;
		 * 
		 */
	}

	public static String toPrettyFormat(String jsonString) {

		JsonParser parser = new JsonParser();

		JsonObject json = parser.parse(jsonString).getAsJsonObject();

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String prettyJson = gson.toJson(json);

		return prettyJson;
	}

	
//	  public static void main(String[] args) {
//	  
//	  HashMap<String, String> headerFieldValues = new HashMap<String, String>();
//	  
//	  HashMap<String, String> bodyFieldValues = new HashMap<String, String>();
//	  
//	  headerFieldValues.put("source_m", "TCCS"); headerFieldValues.put("trans_id",
//	  "HTGO"); headerFieldValues.put("event_dt", "2020-02-13T16:21:25.347919");
//	  headerFieldValues.put("event_id", "HTGO_TEST_161_002");
//	  
//	  bodyFieldValues.put("ht_m", "TPM1612"); bodyFieldValues.put("eqmt_id",
//	  "1612"); bodyFieldValues.put("eqmt_m", "EX001612");
//	  bodyFieldValues.put("locn_type_c", "EB"); bodyFieldValues.put("ht_type_c",
//	  "PM"); bodyFieldValues.put("locn_x", "EX,1612");
//	  
//	  new JsonCreater().fileCreater(headerFieldValues, bodyFieldValues);
//	  
//	  }
//
//	@Override
//	public void fileValidator() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void fileDestroyer() {
//		// TODO Auto-generated method stub
//		
//	}
//	  
	 

}
