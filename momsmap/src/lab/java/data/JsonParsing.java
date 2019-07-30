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

		int DBresult = 0;

		String[] practiceAttribute = { "key", "officeedu", "subofficeedu", "kindername", "establish",
				"archyy","floorcnt","bldgprusarea","grottar"};

		// String[] result = new String[practiceAttribute.length];
		BuildingVO vo = new BuildingVO();

		try {

			JSONObject obj = (JSONObject) parser.parse(new FileReader("C:/Users/김민지/momsmap/momsmap/meal.json"));

			// JSONObject dataBody = (JSONObject) parser.parse(obj.get("kinderInfo"));
			// Object로 불러올 때
			JSONArray bodyArray = (JSONArray) obj.get("kinderInfo"); // JsonArray로 불러 올 때
			System.out.println(bodyArray.size());
			for (int i = 0; i < bodyArray.size(); i++) {

				for (int j = 0; j < practiceAttribute.length; j++) {

					JSONObject row = (JSONObject) bodyArray.get(i);
					vo.setKey((String) row.get(practiceAttribute[0]));
					vo.setOfficeedu((String) row.get(practiceAttribute[1]));
					vo.setSubofficeedu((String) row.get(practiceAttribute[2]));
					vo.setKindername((String) row.get(practiceAttribute[3]));
					vo.setEstablish((String) row.get(practiceAttribute[4]));
					vo.setArchyy((String) row.get(practiceAttribute[5]));
					vo.setFloorcnt((String) row.get(practiceAttribute[6]));
					vo.setBldgprusarea((String) row.get(practiceAttribute[7]));
					vo.setGrottar((String) row.get(practiceAttribute[8]));

			
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
