package lab.spring.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lab.spring.model.CommentVO;
import lab.spring.model.KinderInfoVO;
import lab.spring.model.UserVO;
import lab.spring.service.MapService;
import lab.spring.service.SignupService;

@Controller
@RequestMapping("/signup/*")
public class SingupController {
    
    @Inject
    private SignupService signupService;
    
    //SignUp GET
    @RequestMapping(value="/signup.do", method=RequestMethod.GET)
    public void signupGET() {
        
    }
    
    //SignUp PSOT
        @RequestMapping(value="/signup.do", method=RequestMethod.POST)
        public String signupPOST(UserVO VO) {
            
            signupService.insertMember(VO);
            
            return "main";
        }
    
    
    
}

