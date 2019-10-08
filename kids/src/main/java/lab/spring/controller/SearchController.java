package lab.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lab.spring.model.BuildingVO;
import lab.spring.model.SafetyVO;
import lab.spring.model.SanitaryVO;
import lab.spring.model.SchoolBusVO;
import lab.spring.model.TeacherVO;
import lab.spring.service.MapService;

@Controller
//@RequestMapping(value="/search.do", method = RequestMethod.POST)
public class SearchController {

	@Autowired
	MapService service;
	
	//@RequestMapping(value="/search.do", method = RequestMethod.POST)
	@ResponseBody //json 데이터 사용할 때, json->문자열로 자동변환 시켜주는 어노테이션
	public List<SafetyVO> safetySort(@RequestBody HashMap<String, String> safetyArr){
	    // ModelAndView mav = new ModelAndView();	  
		 	 
		    List<SafetyVO> s_list = null;

		   s_list = service.getSafetyList(safetyArr);
//		   for(SafetyVO vo : s_list){
//			   System.out.println(vo.getPOINT_X()+","+vo.getPOINT_Y());
//		   }
	
		   System.out.println("데이터 수:"+s_list.size());
	
				//mav.addObject("kinders",s_list);
			//	mav.setViewName("index");
		
			return s_list;
		  
	}
	@RequestMapping(value="/search.do", method = RequestMethod.POST)
	@ResponseBody
	public List<SanitaryVO>  sanitarySort(@RequestBody HashMap<String, String> sanitaryArr){	  

		List<SanitaryVO> sanL = null;
		
		sanL = service.getSanitaryList(sanitaryArr);
		System.out.println(sanL.size());
		return sanL;
	}
}
