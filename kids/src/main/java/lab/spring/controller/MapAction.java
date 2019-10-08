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
		
		List<KinderInfoVO> KinderList = null;
		KinderList = service.findKinderList();
		
		mav.addObject("kinders",KinderList);		
		mav.setViewName("index");
	
		return mav;
			
	}
	

}
