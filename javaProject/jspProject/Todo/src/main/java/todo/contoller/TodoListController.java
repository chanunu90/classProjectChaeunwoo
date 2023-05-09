package todo.contoller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import todo.domain.TodoDTO;
import todo.service.TodoListService;

//@WebServlet(name = "todoListController", urlPatterns = "/todo/list")
@WebServlet("/todo/list")
public class TodoListController extends HttpServlet {

	TodoListService listService;
	
	public TodoListController() {
		this.listService = TodoListService.getInstance();
	}
	
	@Override
	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		System.out.println("TodoListController... doGet()...");
		
		HttpSession session = request.getSession();
		if(session.isNew() || session.getAttribute("loginInfo") == null) {
			
			System.out.println("로그인이 필요한 페이지 입니다.");
			response.sendRedirect("/app/login");
			
			return;
		}
		
		List<TodoDTO> list = listService.getList(); 
		
		request.setAttribute("todoList", list);
		
		// 쿠키설정
		// 1. Cookie 객체 생성
		Cookie cookis = new Cookie("uname", "cool");
		// 2. response.addCookie(쿠키 객체)
		response.addCookie(cookis);
		
		// 3. 응답 데이터 
		String viewPath = "/WEB-INF/views/todo/list.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
		
	}

}