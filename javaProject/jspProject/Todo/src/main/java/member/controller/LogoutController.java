package member.controller;
		
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
		
@WebServlet("/logout")
public class LogoutController extends HttpServlet {
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("로그아웃 겟으로 잘들어왔다.");
		
		// 현재 세션을 받아서 invalidate()
		request.getSession().invalidate(); //invalidate() 세션을 다날려버린다.
		response.sendRedirect("/app");
		
	}	
		
}
