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

public class jsonparsing2 {

	static int num = 1;
	static String code;

	public static String count() {
		String suffix = String.format("%03d", num);
		num++;
		System.out.println(num);
		return suffix;
	}

	public static void main(String[] args) throws org.json.simple.parser.ParseException {
		String[] gu = { "JG", "YD", "JR", "YP", "KC", "DJ", "KN", "CR", "YS", "KJ", "YC", "KW", "SM", "MP", "SD", "KB",
				"SC", "SP", "KD", "SB", "DB", "NW", "KS", "KR", "DM" };

		JSONParser parser = new JSONParser();
		DataDAO dao = new DataDAO();

		int DBresult = 0;

		String[] practiceAttribute = { "key", "drcnt", "adcnt", "hdst_thcnt", "asps_thcnt", "gnrl_thcnt", "spcn_thcnt",
				"ntcnt", "ntrt_thcnt", "shcnt_thcnt", "incnt", "owcnt", "hdst_tchr_qacnt", "rgth_gd1_qacnt",
				"rgth_gd2_qacnt", "asth_qacnt", "kindername" };

		// String[] result = new String[practiceAttribute.length];

		TeacherVO vo = new TeacherVO();
		// PracticeVO vo = new PracticeVO();

		for (int k = 0; k < gu.length; k++) { // gu start

			try {

				JSONObject obj = (JSONObject) parser
						.parse(new FileReader("C:/Users/김민지/momsmap/momsmap/teacherJson/" + gu[k] + "Teacher.json"));
				// JSONObject obj = (JSONObject) parser.parse(new
				// FileReader("C:/Project_Umji/momsmap/JSON/援먯떎硫댁쟻/JG援먮㈃.json"));

				// JSONObject dataBody = (JSONObject) parser.parse(obj.get("kinderInfo"));
				// Object濡� 遺덈윭�삱 �븣
				JSONArray bodyArray = (JSONArray) obj.get("kinderInfo"); // JsonArray濡� 遺덈윭 �삱 �븣
				System.out.println(bodyArray.size());
				for (int i = 0; i < bodyArray.size(); i++) {
					code = count();
					for (int j = 0; j < practiceAttribute.length; j++) {

						vo.setTeacherId(gu[k] + code);
						// vo.setClassId("JG" + code);
						// �뿬湲곗꽌 ?

						JSONObject row = (JSONObject) bodyArray.get(i);
						vo.setKey((String) row.get(practiceAttribute[0]));
						vo.setDrcnt((String) row.get(practiceAttribute[1]));
						vo.setAdcnt((String) row.get(practiceAttribute[2]));
						vo.setHdst_thcnt((String) row.get(practiceAttribute[3]));
						vo.setAsps_thcnt((String) row.get(practiceAttribute[4]));
						vo.setGnrl_thcnt((String) row.get(practiceAttribute[5]));
						vo.setSpcn_thcnt((String) row.get(practiceAttribute[6]));
						vo.setNtcnt((String) row.get(practiceAttribute[7]));
						vo.setNtrt_thcnt((String) row.get(practiceAttribute[8]));
						vo.setShcnt_thcnt((String) row.get(practiceAttribute[9]));
						vo.setIncnt((String) row.get(practiceAttribute[10]));
						vo.setOwcnt((String) row.get(practiceAttribute[11]));
						vo.setHdst_tchr_qacnt((String) row.get(practiceAttribute[12]));
						vo.setRgth_gd1_qacnt((String) row.get(practiceAttribute[13]));
						vo.setRgth_gd2_qacnt((String) row.get(practiceAttribute[14]));
						vo.setAsth_qacnt((String) row.get(practiceAttribute[15]));
						vo.setKindername((String) row.get(practiceAttribute[16]));
					}

					DBresult = dao.insertTeacher(vo);
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
		}
	}
}
