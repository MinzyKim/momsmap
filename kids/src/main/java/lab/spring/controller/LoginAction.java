package lab.spring.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lab.spring.model.CommentVO;
import lab.spring.model.KinderInfoVO;
import lab.spring.model.UserVO;
import lab.spring.service.MapService;


@Controller
public class LoginAction {
	
	@Autowired
	MapService service;
	
	/*
	@RequestMapping(value = "/login.do",method=RequestMethod.GET)
	public String form() {
		System.out.println("�α��� GET���");
		return "page-login";
	}
	*/
	
	@RequestMapping(value = "/login.do",method=RequestMethod.POST)
	public ModelAndView login(@RequestParam(value ="userid",required=false)String uid,
								@RequestParam(value = "userpwd", required=false)String upwd,
								HttpSession session


					            ) throws IOException {
		
		

		
		ModelAndView mav = new ModelAndView();
		UserVO vo = null;
		vo = service.login(uid, upwd);
		session.setAttribute("authInfo", vo); //session authInfo�� ����.
		
		if(vo!=null) {
			List<KinderInfoVO> KinderList = null;
			List<CommentVO> CommentList = null;
				KinderList = service.findKinderList();
				mav.addObject("kinders",KinderList);
				mav.addObject("user", vo);
				
			mav.setViewName("index");
		}else {
		
			mav.setViewName("page-register");
		}
		return mav;
	}
	
	@RequestMapping(value="/logout.do")
		public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/index.do";
	}
	
	@RequestMapping(value = "/signupForm", method = RequestMethod.GET) 
	
	public String signupForm(Model model) throws Exception { 
		
		model.addAttribute("userVO", new UserVO()); 
		
		return "login/signupForm"; }


}
