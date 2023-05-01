package todo.contoller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.domain.Todo;

@WebServlet("/todo/modify")
public class todoModifyController extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 수정 폼 : 이전에 입력했던 데이터가 화면에 출력이 되야한다.
		// no 값을 받고
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);
		
		// no 값에 해당하는 Todo 데이터를 Service를 통해서 받고
		Todo todo = new Todo(no , "청소" , "2023-05-04" , "not");
		
		// request 속성에 결과 테이터를 젖장
		request.setAttribute("todo", todo);
		
		// view 지정
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/modify.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 수정 form에서 전달받은 데이터를 서비스에 요청 : update
		request.setCharacterEncoding("utf-8");
		
		String noStr = request.getParameter("no");
		String todo = request.getParameter("todo");
		String dueDate = request.getParameter("duedate");
		String complete = request.getParameter("complete");
		
		Todo newTodo = new Todo(Integer.valueOf(noStr) , todo , dueDate , complete != null ? (complete.equals("on") ? "done" : "not") : "not");
		
		System.out.println(newTodo);
		
		// 결과 받고 1 또는 0
		int result = 1;
		// 새로고침할때 다시 추가되지않도록 redirect 
		response.sendRedirect("list");
		
	}

}
