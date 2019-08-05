package lab.spring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lab.spring.model.UserVO;
import lab.spring.service.MapService;


@Controller("login.do")
public class LoginAction {
	
	@Autowired
	MapService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public String form() {
		return "page-login";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("userid")String uid,
								@RequestParam("userpwd")String upwd,
								HttpSession session) {
		ModelAndView mav = new ModelAndView();
		UserVO vo = null;
		vo = service.login(uid, upwd);
		session.setAttribute("autoInfo", vo);
		mav.addObject("user", vo);
		if(vo!=null) {
			mav.setViewName("index");
		}else {
			mav.setViewName("page-register");
		}
		return mav;
	}
	
//	@RequestMapping(value="/logout.do")
//	   public String logout(HttpSession session) {
//	      session.invalidate();
//	      return "redirect:/login.do";
//	   }
	
	
}
