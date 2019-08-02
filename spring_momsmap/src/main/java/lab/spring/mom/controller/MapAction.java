package lab.spring.mom.controller;

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
import org.springframework.web.servlet.ModelAndView;

import lab.spring.model.KinderInfoVO;
import lab.spring.service.MapService;



@Controller
public class MapAction {
	
	@Autowired
	MapService service;
	
	@RequestMapping(value="/index.do", method = RequestMethod.GET)
	public ModelAndView Map() {
		ModelAndView mav = new ModelAndView();
		List<KinderInfoVO> KinderList = null;
			KinderList = service.findKinderList();
			mav.addObject("kinders",KinderList);
			mav.setViewName("index");
	
		return mav;
				
	}
	
}