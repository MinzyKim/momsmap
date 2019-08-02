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
import lab.spring.model.PracticeVO;

	public class JsonParsing {

	public static void main(String[] args) throws org.json.simple.parser.ParseException {
		JSONParser parser = new JSONParser();
		DataDAO dao = new DataDAO();

		int DBresult = 0;

		String[] practiceAttribute = { "key", "officeedu", "subofficeedu", "kindername", "establish",
				"snge_agmt_ntrt_thcnt","cprt_agmt_ntrt_thcnt","ckcnt","cmcnt"};
		
		// String[] result = new String[practiceAttribute.length];
		
		
		//BuildingVO vo = new BuildingVO();
		PracticeVO vo = new PracticeVO();

		try {

			JSONObject obj = (JSONObject) parser.parse(new FileReader("C:/Project_Umji/momsmap/meal.json"));

			// JSONObject dataBody = (JSONObject) parser.parse(obj.get("kinderInfo"));
			// Object�� �ҷ��� ��
			JSONArray bodyArray = (JSONArray) obj.get("kinderInfo"); // JsonArray�� �ҷ� �� ��
			System.out.println(bodyArray.size());
			for (int i = 0; i < bodyArray.size(); i++) {

				for (int j = 0; j < practiceAttribute.length; j++) {

					JSONObject row = (JSONObject) bodyArray.get(i);
					vo.setKey((String) row.get(practiceAttribute[0]));
					vo.setOfficeedu((String) row.get(practiceAttribute[1]));
					vo.setSubofficeedu((String) row.get(practiceAttribute[2]));
					vo.setKindername((String) row.get(practiceAttribute[3]));
					vo.setEstablish((String) row.get(practiceAttribute[4]));
					vo.setSnge_agmt_ntrt_thcnt((String) row.get(practiceAttribute[5]));
					vo.setCprt_agmt_ntrt_thcnt((String) row.get(practiceAttribute[6]));
					vo.setCkcnt((String) row.get(practiceAttribute[7]));
					vo.setCmcnt((String) row.get(practiceAttribute[8]));
				}

				//DBresult = dao.insertPractice(vo);
			}
			if (DBresult == 1) {
				System.out.println("����");
			} else {
				System.out.println("����");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
