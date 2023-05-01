package firstweb.todo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import todo.Todo;

@WebServlet("/list")
public class TodoListController extends HttpServlet {
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		request.setAttribute("main_title", "Todo List");
		
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String date = request.getParameter("date");
		List<Todo> todo = new ArrayList<>();
		
		// 리스폰스 한글처리
//		response.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = response.getWriter();
//		
//		out.println(" ");
//		out.println(date);
//		out.close();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/list.jsp");
		
		// todoList 속성 가져오기
		List<Todo> todoList = (List<Todo>) getServletContext().getAttribute("todoList");
	    if (todoList == null) { // todoList 속성이 없는 경우
	        todoList = new ArrayList<>();
	        getServletContext().setAttribute("todoList", todoList);
	    }
		
	    todoList.add(new Todo(todoList.size()+1,name,date));
	    request.setAttribute("todoList", todoList);
		
		dispatcher.forward(request, response);
		
	}

}
