package firstweb.form.chaform;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form/chaform/input")
public class InputServletSignup extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 사용자 요청의 한글 처리
		request.setCharacterEncoding("utf-8");
		
		// 아이디, 패스워드, 이름
		
		// 아이디 내려 받기
		String id = request.getParameter("id");
		System.out.println(id);
		
		// 패스워드 내려 받기
		String password = request.getParameter("password");
		System.out.println(password);
		
		// 이름 내려 받기
		String name = request.getParameter("name");
		System.out.println(name);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out =  response.getWriter();
		out.println("<h3>id : " + id + "</h3>" + "<br>");
		out.println("<h3>password : " + password + "</h3>" + "<br>");
		out.println("<h3>name : " + name + "</h3>" + "<br>");
//		
//		//db연결
//		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
//		
//		ResultSet rs = null;
//		try {
//			Connection ct = DriverManager.getConnection(dbUrl, "hr" , "tiger");
//			
//			System.out.println("asd");
//			
//			if(ct != null) {
//				System.out.println("데이터베이스에 연결 완료");
//			}else {
//				System.out.println("데이터베이스에 연결실패");
//			}
//			System.out.println("asd2");
////			ct.setAutoCommit(false);
//			
////			String query = "select * from dept where deptno = ?";
//			String query = "select * from dept";
//			PreparedStatement ps = ct.prepareStatement(query);
////			ps.setInt(1, 40);
////			ps.executeUpdate(); 나머지 dml은 이거
//			//ps.executeQuery(); 셀렉트는 이거
//			
//			rs = ps.executeQuery();
//			
////			while(rs.next()) {
//			if(rs.next()) {
//				System.out.println(
//						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
//			
//			}
//			
//			// 아이디 내려 받기
//			String id = request.getParameter("id");
//			System.out.println(id);
//			
//			// 패스워드 내려 받기
//			String password = request.getParameter("password");
//			System.out.println(password);
//			
//			// 이름 내려 받기
//			String name = request.getParameter("name");
//			System.out.println(name);
//			
//			
//			response.setContentType("text/html; charset=UTF-8");
//			PrintWriter out =  response.getWriter();
//			out.println("<h3>id : " + id + "</h3>" + "<br>");
//			out.println("<h3>password : " + password +  rs.getString(2) +  "</h3>" + "<br>");
//			out.println("<h3>name : " + name + "</h3>" + "<br>");
//			
//			System.out.println("asd3");
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

		

		
	}

}
