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
import org.springframework.web.servlet.ModelAndView;

import lab.spring.dao.DataDAO;
import lab.spring.model.CommentVO;
import lab.spring.model.KinderInfoVO;
import lab.spring.model.UserVO;
import lab.spring.service.MapService;


@Controller("./comment.do")
public class CommentAction extends HttpServlet  {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		response.sendRedirect("index");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		DataDAO dao = new DataDAO();
		CommentVO form = null;
//		String page = null;
//		page = request.getParameter("page");
		form = new CommentVO();
		String kdid = (request.getParameter("kdid"));
		
		form.setKdid(kdid);
		form.setContents(request.getParameter("contents"));
		form.setWriter(request.getParameter("writer"));
		form.setScore(request.getParameter("score"));
		
		System.out.println(request.getParameter("kdid"));
		System.out.println(request.getParameter("contents"));
		System.out.println(request.getParameter("writer"));
		System.out.println(request.getParameter("score"));
		System.out.println("¿Ö ¾ÈÂïÇô");
		
		if (dao.insertComment(form) > 0) {
			response.sendRedirect("login.do");
		}
		
		else {
			response.sendRedirect("index.do");
		}
	}

}