package todo.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import todo.dao.TodoDAO;
import todo.domain.todoDTO;
import todo.util.ConnectionProvider;

public class TodoListService {

	TodoDAO dao;
	
	
	public TodoListService() {
		this.dao = TodoDAO.getInstance();
	}
	
	public List<todoDTO> getList(){
		// 데이터 처리
		// 트렌젝션 처리
		
		Connection conn = null;
		List<todoDTO> list = null;
		
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
