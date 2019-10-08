package lab.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import lab.spring.dao.DataDAO;
import lab.spring.model.CommentVO;
import lab.spring.model.KinderInfoVO;
import lab.spring.model.UserVO;
import lab.spring.service.MapService;


@Controller
public class CommentAction {
	
	
	@Autowired
	MapService service;
	
	@RequestMapping(value="/commentList.do")
	@ResponseBody
	public String getCommentList(String kdid){
		
		StringBuffer result=new StringBuffer("");
		
		List<CommentVO> commentList = service.findCommentList(kdid);
		
		result.append("{\"result\":[");
		for(int i = 0;i<commentList.size();i++) {
			result.append("[{\"Contents\":\""+commentList.get(i).getContents()+"\"},");
			result.append("{\"Writer\":\""+commentList.get(i).getWriter()+"\"},");
			result.append("{\"Score\":\""+commentList.get(i).getScore()+"\"}]");
			
			if(i!=commentList.size()-1) {
				result.append(",");
			}
		}
		result.append("]}");
		return result.toString();
	}
	
	@RequestMapping(value="/addCommnet.do")
	@ResponseBody
	public void addComment(
			HttpServletRequest request,
			String contents,
			String kdid
			) {
		HttpSession session = request.getSession();
		UserVO vo = (UserVO)session.getAttribute("authInfo");
		
		CommentVO comment = new CommentVO();
		comment.setKdid(kdid);
		comment.setScore("3.0");
		comment.setWriter(vo.getUserid());
		comment.setContents(contents);
		
		service.addComment(comment);
	}


}