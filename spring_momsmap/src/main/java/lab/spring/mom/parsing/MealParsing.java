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

import lab.java.data.MealVO;
import lab.java.data.DataDAO;


   public class MealParsing {
      
         static int num = 1;
         static String code;
         
         public static String count() {      
            String suffix = String.format("%03d", num); 
            num++;
            System.out.println(num);
            return suffix;
         }

   

   public static void main(String[] args) throws org.json.simple.parser.ParseException {
      
      String[] gu = {"강남구","강동구","강북구","강서구","관악구","광진구","구로구","금천구","노원구","도봉구","동대문구","동작구",
               "마포구","서대문구","서초구","성동구","성북구","송파구","양천구","영등포구","용산구","은평구","종로구","중구","중랑구"};

      String[] CCode = {"KN","KD","KB","KS","KW","KJ","KR","KC","NW","DB","DM","DJ",
               "MP","SM","SC","SD","SB","SP","YC","YD","YS","YP","CR","JG","JR"};
      
      JSONParser parser = new JSONParser();
      DataDAO dao = new DataDAO();

      int DBresult = 0;

      String[] MealAttribute = {  
               
               "key",
                 "officeedu",
                 "subofficeedu",
                  "kinderinfoId",
                  "kindername",
                  "establish",
                  "mlsr_oprn_way_tp_cd",
                  "cons_ents_nm",
                  "al_kpcnt",
                  "mlsr_kpcnt",
                  "ntrt_tchr_agmt_yn",
                  "snge_agmt_ntrt_thcnt",
                  "cprt_agmt_ntrt_thcnt",
                  "ckcnt",
                  "cmcnt",
                  "mas_mspl_dclr_yn"};

      // String[] result = new String[practiceAttribute.length];
      MealVO vo = new MealVO();
      
      for(int k=0; k<gu.length;k++) {
    	  //for(int k=0; k<3;k++) {
      try {

         JSONObject obj = (JSONObject) parser.parse(new FileReader("C:/Project_Umji/momsmap/JSON/meal_json/meal_json/"+gu[k]+".json"));
         														
         //지역별로 json을 나눠 놓았기 때문에 여러번 해야함
         // JSONObject dataBody = (JSONObject) parser.parse(obj.get("kinderInfo"));
         // Object로 불러올 때
         
          JSONArray bodyArray = (JSONArray) obj.get("kinderInfo"); // JsonArray로 불러 올 때
         
         for (int i = 0; i < bodyArray.size(); i++) {
            code = count();
            for (int j = 0; j < MealAttribute.length; j++) {
               
               vo.setClassid(CCode[k] + code);
               
               JSONObject row = (JSONObject) bodyArray.get(i);
               
               vo.setKey((String) row.get(MealAttribute[0]));
               vo.setMlsr_oprn_way_tp_cd((String) row.get(MealAttribute[6]));
               System.out.println((String) row.get(MealAttribute[6]));
               vo.setCons_ents_nm((String) row.get(MealAttribute[7]));
               vo.setAl_kpcnt((String) row.get(MealAttribute[8]));
               vo.setMlsr_kpcnt((String) row.get(MealAttribute[9]));
               vo.setNtrt_tchr_agmt_yn((String) row.get(MealAttribute[10]));
               vo.setSnge_agmt_ntrt_thcnt((String) row.get(MealAttribute[11]));
               vo.setCprt_agmt_ntrt_thcnt((String) row.get(MealAttribute[12]));
               vo.setCkcnt((String) row.get(MealAttribute[13]));
               vo.setCmcnt((String) row.get(MealAttribute[14]));
               vo.setMas_mspl_dclr_yn((String) row.get(MealAttribute[15]));
               vo.setKindername((String) row.get(MealAttribute[4]));
               
            }

            DBresult = dao.insertMeal(vo);
         }
         if (DBresult == 1) {
            System.out.println("성공");
         } else {
            System.out.println("실패");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
      num=1;
      }
   }
   }
   