package firstweb.todo;

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

import com.mysql.cj.Session;

@WebServlet("/list")
public class TodoListController extends HttpServlet {
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		request.setAttribute("main_title", "Todo List");
		
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String date = request.getParameter("date");
		
//		// 리스폰스 한글처리
//		response.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = response.getWriter();
//		
//		out.println(name);
//		out.println(" ");
//		out.println(date);
//		out.close();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/list.jsp");
		
		dispatcher.forward(request, response);
		
	}

}
