package lab.spring.parsing;


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

import lab.spring.dao.DataDAO;
import lab.spring.model.BuildingVO;

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

			JSONObject obj = (JSONObject) parser.parse(new FileReader("C:/Project_Umji/momsmap/JSON/건물/DM건물.json"));

			// JSONObject dataBody = (JSONObject) parser.parse(obj.get("kinderInfo"));
			// Object로 불러올 때
			JSONArray bodyArray = (JSONArray) obj.get("kinderInfo"); // JsonArray로 불러 올 때
			System.out.println(bodyArray.size());
			for (int i = 0; i < bodyArray.size(); i++) {
				code = count();
				for (int j = 0; j < practiceAttribute.length; j++) {

					
					
					vo.setBUILDINGID("DM" + code);
					// 여기서 ? 
					
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
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
