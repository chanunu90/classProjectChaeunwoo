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
		
@WebServlet("/list")
public class EmpListController extends HttpServlet {
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("겟방식으로 리스트 페이지로 들어옴");
		
		EmpListService els = new EmpListService();
		
		try {
			request.setAttribute("empList", els.getlist());
			System.out.println(els.getlist());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String viewPath = "/WEB-INF/view/list.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
		
	}	
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}	
		
}		
