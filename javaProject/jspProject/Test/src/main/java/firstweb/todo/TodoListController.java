package firstweb.todo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;

import com.mysql.cj.Session;

import todo.Todo;

@WebServlet("/list")
public class TodoListController extends HttpServlet {
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		request.setAttribute("main_title", "Todo List");
		
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String date = request.getParameter("date");
		
		// 리스폰스 한글처리
//		response.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = response.getWriter();
//		
//		out.println(" ");
//		out.println(date);
//		out.close();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/list.jsp");
	    List<Todo> lists = new ArrayList();
	    int num=1;
//	    for(Todo list : lists){
//	    	 lists.add(new Todo(num,name,date));
//	    	 num++;
//	    }
	    lists.add(new Todo(num,name,date));
	    lists.add(new Todo(2,"차차차","1990-12-06"));
	    lists.add(new Todo(3,"조조조","1991-10-20"));
		
		request.setAttribute("lists", lists);
		
		dispatcher.forward(request, response);
		
	}

}
