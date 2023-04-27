package firstweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/auth/login")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userid = request.getParameter("userid");
		System.out.println("사용자 입력 id : " + userid);
		
		String password = request.getParameter("password");
		System.out.println("사용자 입력 password : " + password);
		
		//////////////////////////////////////////////////////////////
		// 응답 
		PrintWriter out = response.getWriter();
		out.println("사용자 입력 id : " + userid);
		out.println("사용자 입력 password : " + password);
		out.close();
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userid = request.getParameter("userid");
		System.out.println("사용자 입력 id : " + userid);
		
		String password = request.getParameter("password");
		System.out.println("사용자 입력 password : " + password);
		
		//////////////////////////////////////////////////////////////
		// 응답 
		PrintWriter out = response.getWriter();
		out.println("사용자 입력 id : " + userid);
		out.println("사용자 입력 password : " + password);
		out.close();
		
	}

}
