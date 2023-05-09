package todo.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import todo.dao.TodoDAO;
import todo.domain.TodoDTO;
import todo.util.ConnectionProvider;

public class TodoListService {
	
	TodoDAO dao;
	
	private TodoListService() {
		this.dao = TodoDAO.getInstance();
	}
	
	private static TodoListService service = new TodoListService();
	
	public static TodoListService getInstance() {
		return service;
	}
	
	public List<TodoDTO> getList(){
		// 데이터 처리
		// 트렌젝션 처리
		
		Connection conn = null;
		List<TodoDTO> list = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			list = dao.selectByAll(conn);
			
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
		
		return list;
	
	}
	
}
