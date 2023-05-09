package emp.controller;
		
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dao.EmpMemberDAO;
import emp.service.EmpListService;
		
@WebServlet("/read")
public class EmpReadController extends HttpServlet {
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("겟방식으로 읽기페이지 들어옴");
//		System.out.println(request.getAttribute(getServletName()));
		System.out.println(request.getAttribute("ename"));
		System.out.println(request.getAttribute("empno"));
		
//		request.getAttribute("empno");
//		request.getAttribute("ename");
		
		String viewPath = "/WEB-INF/view/read.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
		
		
	}	
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("포스트방식으로 읽기페이지 들어옴");
		
//		request.getAttribute("empno");
//		request.getAttribute("ename");
		
		String viewPath = "/WEB-INF/view/read.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
	}	
		
}		
