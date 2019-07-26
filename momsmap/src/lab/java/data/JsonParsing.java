package lab.java.data;


	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.io.Reader;
	import java.text.ParseException;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Set;

	import javax.swing.text.html.HTMLEditorKit.Parser;

	import org.json.simple.JSONArray;
	import org.json.simple.JSONObject;
	import org.json.simple.parser.JSONParser;

	public class JsonParsing {

		public static void main(String[] args) throws org.json.simple.parser.ParseException {
			JSONParser parser = new JSONParser();
			DataDAO dao = new DataDAO();
			
			int DBresult=0;
			
			String[] safetyAttribute = {
					"kindername",
					"fire_avd_yn",
					"gas_ck_yn",
					"fire_safe_yn",
					"elect_ck_yn",
					"plyg_ck_dt",
					"cctv_ist_yn",
					"cctv_ist_total",
					"cctv_ist_in",
					"cctv_ist_out"
					};
			
			String[] result = new String[safetyAttribute.length];
			
			
			try {
			
				JSONObject obj = (JSONObject)parser.parse(new FileReader("C:/Users/김민지/eclipse-workspace/momsmap/safety.json"));
				//System.out.println(obj.toString());
				//JSONObject result = (JSONObject)obj.get("kinderInfo");
	
				//JSONObject dataBody = (JSONObject) parser.parse(obj.get("kinderInfo")); Object로 불러올 때
				JSONArray bodyArray = (JSONArray)obj.get("kinderInfo"); //JsonArray로 불러 올 때
				
				for(int i =0;i < bodyArray.size();i++) {
					JSONObject row = (JSONObject)bodyArray.get(i);
//					String kindername = (String)row.get("kindername").toString();
//					System.out.println(kindername);
					result[i]=row.get(safetyAttribute[i]).toString();
					System.out.println(result[i]);
				}
				
				DBresult = dao.insertSafety(result);
				
				if(DBresult==1) {
					System.out.println("성공");
				}
				else {
					System.out.println("실패");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
