package lab.spring.controller;


import java.util.HashMap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lab.spring.model.CommentVO;
import lab.spring.model.KinderInfoVO;
import lab.spring.model.SafetyVO;
import lab.spring.service.MapService;



@RestController
public class MapAction {
	
	@Autowired
	MapService service;
	
	@RequestMapping(value="/index.do", method = RequestMethod.GET)
	public ModelAndView sayHello() {
		ModelAndView mav = new ModelAndView();
		List<CommentVO> CommentList = null;
		List<KinderInfoVO> KinderList = null;
		KinderList = service.findKinderList();
		CommentList = service.findCommentList();
		mav.addObject("kinders",KinderList);
		mav.addObject("comments",CommentList);
		mav.setViewName("index");
	
		return mav;
			
	}
	

	@RequestMapping(value="/search.do", method = RequestMethod.POST)
	@ResponseBody
	public List<SafetyVO>  findCategory(@RequestBody HashMap<String, String> safetyArr){
	    // ModelAndView mav = new ModelAndView();	  
		 	 
		    List<SafetyVO> s_list = null;

		   s_list = service.getSafetyList(safetyArr);
//		   for(SafetyVO vo : s_list){
//			   System.out.println(vo.getPOINT_X()+","+vo.getPOINT_Y());
//		   }
	

	
				//mav.addObject("kinders",s_list);
			//	mav.setViewName("index");
		
			return s_list;
		  
	}
}
