package todo.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import todo.dao.TodoDAO;
import todo.domain.RequestTodo;
import todo.util.ConnectionProvider;

public class TodoInsertService {
	
	//TodoDAO가 싱글톤으로 잠겨있기때문에 이렇게 해야한다.
	TodoDAO dao;
	//생성자 
	private TodoInsertService() {
		this.dao = TodoDAO.getInstance();
	}
	//------------------------------------------------
	//싱글톤
	private static TodoInsertService service = new TodoInsertService();
	public static TodoInsertService getInstance() {
		return service;
	}
	
	
	//입력의 요청을 처리하는 메소드
	//RequestTodo 전달 받고 Dao 메소드에 요청
	public int register(RequestTodo todo) {
			
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			
			conn = ConnectionProvider.getConnection();
			result = dao.insertTodo(conn, todo);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		
		return result;
	}
	
	
	
	
}
