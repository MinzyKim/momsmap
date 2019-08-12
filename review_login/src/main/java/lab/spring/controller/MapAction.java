package lab.spring.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lab.spring.model.CommentVO;
import lab.spring.model.KinderInfoVO;
import lab.spring.model.SafetyVO;
import lab.spring.service.MapService;



@Controller
public class MapAction {
	
	@Autowired
	MapService service;
	
	@RequestMapping(value="/index.do", method = RequestMethod.GET)
	public ModelAndView sayHello() {
		ModelAndView mav = new ModelAndView();
		List<KinderInfoVO> KinderList = null;
		List<CommentVO> CommentList = null;
			KinderList = service.findKinderList();
			CommentList = service.findCommentList();
			mav.addObject("kinders",KinderList);
			mav.addObject("comments",CommentList);
			mav.setViewName("index");
	
		return mav;
				
	}
	
	@RequestMapping(value="/search.do", method = RequestMethod.POST)
	public List<SafetyVO> findCategory(@RequestParam(value="safety[]", required=false) List<String> safety_arr){
	//ModelAndView mav = new ModelAndView();
		
		 List<SafetyVO> s_list = null;

	      s_list = service.findSafety(safety_arr);
	      return s_list;

	}
}
