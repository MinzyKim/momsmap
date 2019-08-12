package lab.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lab.spring.dao.DataDAO;
import lab.spring.model.CommentVO;

@WebServlet("/write.do")
public class WriteAction extends HttpServlet{
		private static final long serialVersionUID = 1L;
		String UPLOAD_DIRECTORY ="c:/uploadtest";
		public WriteAction() {
			super();

		}

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
					
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			HttpSession session = request.getSession();
			
				response.sendRedirect("./index2.jsp");
	
			
		}
		

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			DataDAO dao = new DataDAO();
			
			CommentVO form = null;
			String cmid = null;
			String kdid = null;
			String writer = null;
			String idate = null;
			String contents = null;
			String score = null;
			
			
			form = new CommentVO();

			
			form.setWriter(request.getParameter("writer"));
			form.setKdid(request.getParameter("kdid"));
			form.setScore(request.getParameter("score"));
			form.setContents(request.getParameter("contents"));
			

			if (dao.insertComment(form) > 0) {
				response.sendRedirect("./index.do");
			}
			
		}


	}