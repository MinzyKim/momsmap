package lab.spring.controller;



import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger; 
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes; 



import lab.spring.model.UserVO;

import lab.spring.service.UserService; 

@Controller 
 

public class UserController { 
	private static final Logger logger = LoggerFactory.getLogger(UserController.class); 

	@Autowired
	private UserService userService; 
	
	
	@RequestMapping(value = "/page-register", method=RequestMethod.GET) 
	public String page_register() throws Exception{
		
		return "page-register";
	
	}
	
	@RequestMapping(value = "/page-register1",method=RequestMethod.GET) 
	
	public ModelAndView user_register(HttpServletRequest request) throws Exception {
		 
		
		System.out.println("들어감");
		   String id = request.getParameter("userid");
		   String pw = request.getParameter("userpwd");
		   String name = request.getParameter("username");
		   String email = request.getParameter("email");
		   String location = request.getParameter("location");
		 System.out.println("dd");
		   ModelAndView view = new ModelAndView();
		   UserVO vo = new UserVO();
		   
		   vo.setUserid(id);
		   vo.setUserpwd(pw);
		   vo.setUsername(name);
		   vo.setEmail(email);
		   vo.setLocation(location);
		   System.out.println(vo.toString());
		   
		   userService.insertUser(vo);
		   
		   
		   System.out.println("dd");
		   return view;
	}
}

//	@RequestMapping(value = "/getUserList") 
//	public ModelAndView getUserList() throws Exception{
//		
//		ModelAndView mav= new ModelAndView();
//		
//		List<UserVO> list =userService.getUserList();
//
//		return mav;
		
		
//		logger.info("getUserList()"); 
		
		 
		
	

	
//	@RequestMapping(value = "/page-register", method = RequestMethod.POST) 
//	
//	public String insertUser(
//			
//			@ModelAttribute("userVO")
//			
//			UserVO userVO , RedirectAttributes rttr) throws Exception { 
//		
//		userService.insertUser(userVO); return "page-register"; }
//	}

