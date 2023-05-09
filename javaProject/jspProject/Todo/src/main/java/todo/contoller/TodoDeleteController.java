package todo.contoller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import todo.domain.Todo;
import todo.service.TodoDeleteService;
import todo.service.TodoUpdateService;
import todo.service.TodoViewService;

@WebServlet("/todo/delete")
public class TodoDeleteController extends HttpServlet {
        
	TodoDeleteService deleteService;
	
	public TodoDeleteController() {
		deleteService = deleteService.getInstance();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("todoDeleteController ...   여기까지 잘들어왔어");
		
		HttpSession session = request.getSession();
		if(session.isNew() || session.getAttribute("loginInfo") == null) {
			
			System.out.println("로그인이 필요한 페이지 입니다.");
			response.sendRedirect("/app/login");
			
			return;
		}
		
		
		// 사용자로 부터 no 받기
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);
		
		// 서비스로 no 전달 -> 삭제 처리
		int result = deleteService.delete(no);
		
		if(result > 0) {
			System.out.println("수정완료");
		}else{
			System.out.println("수정실패");
		}
		
		// 결과
		System.out.println(no + "번 할일이 삭제 되었습니다.");
		
		// redirect ( list )
		response.sendRedirect("list");
		
	}

}
