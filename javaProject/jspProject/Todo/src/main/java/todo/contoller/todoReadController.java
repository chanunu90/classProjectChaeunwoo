package todo.contoller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/todo/read")
public class todoReadController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//상세보기 페이지는 get 요청에 화면을 보여주는 처리
		// 어떤 Todo의 데이터인지 식별할수 있는 키 데이터 받아서 처리
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);
		
		//no 값으로 Sevice를 통해서 Todo 정보를 받아온다!
		String todo = "청소";
		String duedate = "2023-05-05";
		String complete = "done";
		
		request.setAttribute("no", no);
		request.setAttribute("todo", todo);
		request.setAttribute("duedate", duedate);
		request.setAttribute("complete", complete);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/read.jsp");
		dispatcher.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
