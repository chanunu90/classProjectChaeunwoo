package firstweb.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;

@WebServlet("/input")
public class InputController extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("InputController.......");
		
		request.setAttribute("title", "계산기");

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/input.jsp");
		
		/*
		 * RequestDispatcher dispatcher = request.getRequestDispatcher("test/date.jsp");
		 */
		
		dispatcher.forward(request, response);
		
		System.out.println("겟으로받음");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 리퀘스트 사용자 요청의 한글 처리
		request.setCharacterEncoding("utf-8");
		
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		// 리스폰스 한글처리
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println(num1);
		out.println(" ");
		out.println(num2);
		out.close();
		
	}

}
