package todo.contoller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.domain.RequestTodo;
import todo.service.TodoInsertService;

/**
 * Servlet implementation class TodoRegisterController
 */
@WebServlet("/todo/register")
public class TodoRegisterController extends HttpServlet {

	TodoInsertService todoInsertService;
	
	public TodoRegisterController() {
		this.todoInsertService = TodoInsertService.getInstance();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// todo 입력 폼 화면 출력
		System.out.println("TodoRegisterController...doGet()...");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/registerForm.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("TodoRegisterController 포스트로 받는다.");
		request.setCharacterEncoding("utf-8");
		//입력폼에서 전달한 데이터를 받아서 처리해준다.
		String todo = request.getParameter("todo");
		String dueDate = request.getParameter("duedate");
		System.out.println(todo + " : " + dueDate);
		
		RequestTodo requestTodo = new RequestTodo(todo, dueDate);
		
		//Service에 요청 
		int result = todoInsertService.register(requestTodo);
		
		if(result > 0) {
			System.out.println("입력 성공...");
		} else {
			System.out.println("압력된 건이 없습니다. 입력을 실패했습니다.");
		}
		
		//redirect : "list"
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/list.jsp");
//		dispatcher.forward(request, response);
		response.sendRedirect("list"); //외부에서 접속하는 url
		
	}

	
}
