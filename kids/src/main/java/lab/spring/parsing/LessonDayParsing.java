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
import lab.spring.model.LessonDayVO;

	public class LessonDayParsing {
		
		static int num = 1;
		static String code;
		
		public static String count() {		
			String suffix = String.format("%03d", num); 
			num++;
			System.out.println(num);
			return suffix;
		}


	public static void main(String[] args) throws org.json.simple.parser.ParseException {
		String[] gu = {"JG","YD","JR","YP","KC","DJ","KN","CR","YS","KJ","YC","KW",
				"SM","MP","SD","KB","SC","SP","KD","SB","DB","NW","KS","KR","DM"};

		JSONParser parser = new JSONParser();
		DataDAO dao = new DataDAO();

		int DBresult = 0;

		String[] practiceAttribute = { "key", "ag3_lsn_dcnt", "ag4_lsn_dcnt", "ag5_lsn_dcnt",
				"mix_age_lsn_dcnt", "spcl_lsn_dcnt","afsc_pros_lsn_dcnt", "ldnum_blw_yn", "fdtn_kndr_yn"};
			
	
		// String[] result = new String[practiceAttribute.length];
		
		
		LessonDayVO vo = new LessonDayVO();
		//PracticeVO vo = new PracticeVO();

		for(int k=0; k<gu.length;k++) {	//gu start
		//for(int k=0; k<2;k++) {
			
		try {

			JSONObject obj = (JSONObject) parser.parse(new FileReader("C:/Project_Umji/momsmap/JSON/수업일수/"+gu[k]+"수업.json"));

			// JSONObject dataBody = (JSONObject) parser.parse(obj.get("kinderInfo"));
			// Object로 불러올 때
			JSONArray bodyArray = (JSONArray) obj.get("kinderInfo"); // JsonArray로 불러 올 때
			System.out.println(bodyArray.size());
			for (int i = 0; i < bodyArray.size(); i++) {
				code = count();
				for (int j = 0; j < practiceAttribute.length; j++) {

					
					
					vo.setLessonId(gu[k] + code);
					// 여기서 ? 
					
					JSONObject row = (JSONObject) bodyArray.get(i);
					vo.setKey((String) row.get(practiceAttribute[0]));
					vo.setAg3_lsn_dcnt((String) row.get(practiceAttribute[1]));
					vo.setAg4_lsn_dcnt((String) row.get(practiceAttribute[2]));
					vo.setAg5_lsn_dcnt((String) row.get(practiceAttribute[3]));
					vo.setMix_age_lsn_dcnt((String) row.get(practiceAttribute[4]));
					vo.setSpcl_lsn_dcnt((String) row.get(practiceAttribute[5]));
					vo.setAfsc_pros_lsn_dcnt((String) row.get(practiceAttribute[6]));
					vo.setLdnum_blw_yn((String) row.get(practiceAttribute[7]));
					vo.setFdtn_kndr_yn((String) row.get(practiceAttribute[8]));
					
			
					
				}

				//DBresult = dao.insertLessonDay(vo);
			}
			if (DBresult == 1) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		num = 1;
		}//gu end
	}
	}
