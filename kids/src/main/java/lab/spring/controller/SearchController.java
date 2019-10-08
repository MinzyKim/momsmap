package lab.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lab.spring.model.BuildingVO;
import lab.spring.model.SafetyVO;
import lab.spring.model.SanitaryVO;
import lab.spring.model.SchoolBusVO;
import lab.spring.model.SearchVO;
import lab.spring.model.TeacherVO;
import lab.spring.service.MapService;

@Controller
//@RequestMapping(value="/search.do", method = RequestMethod.POST)
public class SearchController {

	@Autowired
	MapService service;
	
	
	@ResponseBody
	@RequestMapping(value="/search.do", method = RequestMethod.POST)
	public List<SafetyVO> safetySort(@RequestBody HashMap<String, String> safetyArr/*,
													HashMap<String, String> envArr, HashMap<String, String> teacherArr*/){	  
//
		List<SafetyVO> safL = null;
//		//List<SearchVO> sanL = null;
//		//List<SchoolBusVO> busL=nSull;
//		//List<BuildingVO> buildL=null;
//		//List<TeacherVO> teacherL=null;
//		
//
//		//safL = service.getSafetyList(safetyArr);
//		//sanL = service.getSanitaryList(sanitaryArr);
//		//safL = service.getSafetyList(safetyArr);
//		//safL = service.getSafetyList(safetyArr);
//		//safL = service.getSafetyList(safetyArr);
//		
		safL = service.getSafetyList(safetyArr);
		System.out.println(safL.size());
	      return safL;
//	
	}
	
	
	//@RequestMapping(value="/search.do", method = RequestMethod.POST)
	@ResponseBody
	public List<SanitaryVO>  sanitarySort(@RequestBody HashMap<String, String> sanitaryArr){	  

		List<SanitaryVO> sanL = null;
		
		sanL = service.getSanitaryList(sanitaryArr);
		System.out.println(sanL.size());
		return sanL;
	}
}
