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

@WebServlet("/todo/delete")
public class todoDeleteController extends HttpServlet {
        
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("todoDeleteController ...   여기까지 잘들어왔어");
		
		// 사용자로 부터 no 받기
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);
		
		// 서비스로 no 전달
		
		
		
		// 결과
		System.out.println(no + "번 할일이 삭제 되었습니다.");
		
		
		// redirect ( list )
		response.sendRedirect("list");
		
		
	}

}
