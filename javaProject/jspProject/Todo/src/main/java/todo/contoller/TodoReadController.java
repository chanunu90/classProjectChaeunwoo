package todo.contoller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import todo.dao.TodoDAO;
import todo.domain.TodoDTO;
import todo.service.TodoViewService;

@WebServlet("/todo/read")
public class TodoReadController extends HttpServlet {
		
	TodoViewService viewService;
		
	public TodoReadController() {
		this.viewService = TodoViewService.getInstance();
	}	
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("TodoReadController....doGet()...");
		
		HttpSession session = request.getSession();
		if(session.isNew() || session.getAttribute("loginInfo") == null) {
			
			System.out.println("로그인이 필요한 페이지 입니다.");
			response.sendRedirect("/app/login");
			
			return;
		}
		// 쿠키값 확인
		Cookie[] cookies = request.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("uname")) {
				System.out.println(c.getName() + "=" + c.getValue());
			}
		}
		
		// 상세보기 페이지는 get 요청에 화면을 보여주는 처리
		// 어떤 Todo의 데이터인지 식별한수있는 키 데이터 받아서 처리
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);
		
		// no 값으로 Sevice를 통해서 Todo 정보를 받아온다!
		TodoDTO todo = viewService.getTodo(no); // no = 2
		
		request.setAttribute("todo", todo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/read.jsp");
		dispatcher.forward(request, response);
		
	}
	
}
