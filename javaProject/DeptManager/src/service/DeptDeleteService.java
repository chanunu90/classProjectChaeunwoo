package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDao;
import domain.Dept;
import util.ConnectionProvider;

public class DeptDeleteService {
	
	DeptDao dao;
	
	private DeptDeleteService() {
		this.dao = DeptDao.getInstance();
	}
	
	private static DeptDeleteService service = new DeptDeleteService();
	
	public static DeptDeleteService getInstance() {
		return service;
	}
	
	
	
	public int deleteDept(int newDept) {
		
		Connection conn = null;
		int result = 0;
		
		try {
			
			conn = ConnectionProvider.getConnection();
			result = dao.deleteDeptByDeptno(conn, newDept);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
//					conn.commit();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}
	
	
}
