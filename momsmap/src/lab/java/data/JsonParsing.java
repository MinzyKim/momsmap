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
			
			String[] practiceAttribute = {
					"officeedu",
					"subofficeedu",
					"kindername",
					"establish",
					"edate",
					"odate",
					"addr",
					"telno",
					"hpaddr",
					"opertime",
					"clcnt3",
					"clcnt4",
					"clcnt5",
					"mixclcnt",
					"shclcnt",
					"ppcnt3",
					"ppcnt4",
					"ppcnt5",
					"mixppcnt",
					"clcnt3",
					"clcnt4",
					"clcnt5",
					"mixclcnt",
					"shppcnt"	
					};
			
			//String[] result = new String[practiceAttribute.length];
			KinderInfoVO vo = new KinderInfoVO();
			
			try {
			
				JSONObject obj = (JSONObject)parser.parse(new FileReader("C:/Users/김민지/momsmap/momsmap/kinderinfo_gn.json"));
				
				//JSONObject dataBody = (JSONObject) parser.parse(obj.get("kinderInfo")); Object媛앹껜 �뙆�떛
				JSONArray bodyArray = (JSONArray)obj.get("kinderInfo"); //JsonArray�뙆�떛
				System.out.println(bodyArray.size());
				for(int i =0;i < bodyArray.size();i++) {
					JSONObject row = (JSONObject)bodyArray.get(i);

					for(int j =0;j < practiceAttribute.length;j++) {
				
					     vo.setOfficeedu((String)row.get(practiceAttribute[0]));
					     vo.setSubofficeedu((String)row.get(practiceAttribute[1]));
					     vo.setKindername((String)row.get(practiceAttribute[2]));
					     vo.setEstablish((String)row.get(practiceAttribute[3]));
					     vo.setEdate((String)row.get(practiceAttribute[4]));
					     vo.setOdate((String)row.get(practiceAttribute[5]));
					     vo.setAddr((String)row.get(practiceAttribute[6]));
					    vo.setTelno((String)row.get(practiceAttribute[7]));
					    vo.setHpaddr((String)row.get(practiceAttribute[8]));
					    vo.setOpertime((String)row.get(practiceAttribute[9]));
					    vo.setClcnt3((String)row.get(practiceAttribute[10]));
					    vo.setClcnt4((String)row.get(practiceAttribute[11]));
					    vo.setClcnt5((String)row.get(practiceAttribute[12]));
					    vo.setMixclcnt((String)row.get(practiceAttribute[13]));
					    vo.setShclcnt((String)row.get(practiceAttribute[14]));
					    vo.setPpcnt3((String)row.get(practiceAttribute[15]));
					    vo.setPpcnt4((String)row.get(practiceAttribute[16]));
					    vo.setPpcnt5((String)row.get(practiceAttribute[17]));
					    vo.setMixppcnt((String)row.get(practiceAttribute[18]));
					    vo.setShppcnt((String)row.get(practiceAttribute[19]));
					    
				}
				
				DBresult = dao.insertKinderInfo(vo);
				}
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
