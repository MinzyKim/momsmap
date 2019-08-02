package lab.spring.mom.parsing;


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

	public class BuildingParsing {
		
		static int num = 1;
		static String code;
		
		public static String count() {		
			String suffix = String.format("%03d", num); 
			num++;
			System.out.println(num);
			return suffix;
		}


	public static void main(String[] args) throws org.json.simple.parser.ParseException {
		JSONParser parser = new JSONParser();
		DataDAO dao = new DataDAO();

		int DBresult = 0;

		String[] practiceAttribute = { "key", "archyy", "floorcnt", "bldgprusarea", "grottar"};
		

		
		// String[] result = new String[practiceAttribute.length];
		
		
		BuildingVO vo = new BuildingVO();
		//PracticeVO vo = new PracticeVO();

		try {

			JSONObject obj = (JSONObject) parser.parse(new FileReader("C:/Project_Umji/momsmap/JSON/ê±´ë¬¼/DMê±´ë¬¼.json"));

			// JSONObject dataBody = (JSONObject) parser.parse(obj.get("kinderInfo"));
			// Objectë¡? ë¶ˆëŸ¬?˜¬ ?•Œ
			JSONArray bodyArray = (JSONArray) obj.get("kinderInfo"); // JsonArrayë¡? ë¶ˆëŸ¬ ?˜¬ ?•Œ
			System.out.println(bodyArray.size());
			for (int i = 0; i < bodyArray.size(); i++) {
				code = count();
				for (int j = 0; j < practiceAttribute.length; j++) {

					
					
					vo.setBUILDINGID("DM" + code);
					// ?—¬ê¸°ì„œ ? 
					
					JSONObject row = (JSONObject) bodyArray.get(i);
					vo.setKey((String) row.get(practiceAttribute[0]));
					vo.setArchyy((String) row.get(practiceAttribute[1]));
					vo.setFloorcnt((String) row.get(practiceAttribute[2]));
					vo.setBldgprusarea((String) row.get(practiceAttribute[3]));
					vo.setGrottar((String) row.get(practiceAttribute[4]));
					
					
				
				}

				DBresult = dao.insertBuilding(vo);
			}
			if (DBresult == 1) {
				System.out.println("?„±ê³?");
			} else {
				System.out.println("?‹¤?Œ¨");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
