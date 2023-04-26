package firstweb.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form/input")
public class InputServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 사용자 요청의 한글 처리
		request.setCharacterEncoding("utf-8");
		
		// 입력 내려 받기
		String asd = request.getParameter("content");
		System.out.println(asd);
		
		
		String gender = request.getParameter("gender");
		System.out.println(gender);
		
		//체크박스 받기
		String[] langs = request.getParameterValues("lang"); //  파람값중 같은이름의 파람값을 배열로 담아줌
		for(String l : langs) {
			System.out.println(l);
		}
		
		//셀렉트박스 담기
		String birthYear = request.getParameter("birthYear");
		System.out.println(birthYear);
		
		//넘버박스 받기
		int age = Integer.valueOf(request.getParameter("age"));
		System.out.println(age);
		
		if(age > 19) {
			System.out.println("성인이 접속 가능한 페이지 입니다.");
		}else{
			System.out.println("당신은 미성년으로 접속이 불가능합니다.");
		}
		//달력 받기
		String birth = request.getParameter("birth");
		System.out.println(birth);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out =  response.getWriter();
		out.println("<h3>content : " + asd + "</h3>");
		out.println("<h3>gender : " + gender + "</h3>");
		out.println("<hr>");
		out.println("<h3>관심사</h3>");
		for(String l : langs) {
			out.println("-" + l + " " + "<br>");
		}
		out.println("<h3>birthYear : " + birthYear + "</h3>");
		out.println("<h3>age : " + age + "</h3>");
		out.println("<h3>birth : " + birth + "</h3>");
	}

}
