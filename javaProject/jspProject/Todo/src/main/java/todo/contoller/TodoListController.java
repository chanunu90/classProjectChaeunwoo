package todo.contoller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "TodoListController" , urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet{

	// 화면에 리스트 출략 : get 방식의 요청
	// 브라우저의 url창 에 입력해서 요청 => get
	
	// doget() 메소드를 오버라이딩
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("TodoListController 겟으로 잘 들어온다.");
		
		// post방식의 데이터 전달 -> 파라미터 한글처리
		request.setCharacterEncoding("utf-8");
		
		// 1 .사용자 요청의 분석
		// 2 .Seveice에 요청 -> 응답 데이터 반환
	    // 3 .응답 데이터 request의 속성에 저장 : view로 데이터 전달
		// 4. view 저장 -> forword
		
		String viewPath = "/WEB-INF/views/todo/list.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
		
	}

}
