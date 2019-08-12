package lab.spring.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lab.spring.model.CommentVO;
import lab.spring.model.KinderInfoVO;
import lab.spring.model.UserVO;
import lab.spring.service.MapService;


@Controller("login.do")
public class LoginAction {
	
	@Autowired
	MapService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public String form() {
		System.out.println("로그인 GET방식");
		return "page-login";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView login(@RequestParam(value ="userid",required=false)String uid,
								@RequestParam(value = "userpwd", required=false)String upwd,
								HttpSession session) {
		ModelAndView mav = new ModelAndView();
		UserVO vo = null;
		vo = service.login(uid, upwd);
		session.setAttribute("authInfo", vo); //session authInfo에 저장.
		
		if(vo!=null) {
			System.out.println(uid+"로그인 성공!");
			List<KinderInfoVO> KinderList = null;
			List<CommentVO> CommentList = null;
				KinderList = service.findKinderList();
				CommentList = service.findCommentList();
				mav.addObject("kinders",KinderList);
				mav.addObject("comments",CommentList);
				
				mav.addObject("user", vo);
				
			mav.setViewName("index2");
		}else {
			System.out.println("로그인 실패");
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
