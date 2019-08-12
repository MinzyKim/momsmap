package lab.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import lab.spring.model.CommentVO;
import lab.spring.service.MapService;

@Controller("/add.do")
public class CommentController {

	@Autowired
	MapService service;
	
	@RequestMapping(value = "/add.do", method=RequestMethod.GET)
	public String form() {
		return "index";
	}
	
	@RequestMapping(value = "/add.do", method=RequestMethod.POST)
	public ModelAndView addComment (@ModelAttribute("comment") CommentVO vo,
						BindingResult rs) {		
		//BindingResult는 에러메세지를 담는 객체
	ModelAndView mav = new ModelAndView();
	mav.setViewName("index2");
	

	return mav;
	}
}