package service;

import java.sql.Connection;
import java.sql.SQLException;
import dao.DeptDao;
import domain.Dept;
import util.ConnectionProvider;

public class DeptInsertService {
	
	DeptDao dao = null; 
	
	private DeptInsertService(){
		this.dao = DeptDao.getInstance();
	}
	
	private static DeptInsertService service = new DeptInsertService();
	
	public static DeptInsertService getInstance() {
		return service;
	}
	
	public int insertDept(Dept dept){
		//RequestDept => dname, loc
		// 데이터 가공
		
		// Transaction
		Connection conn = null;
		int result = 0;
		
		try {
			conn = ConnectionProvider.getConnection();
			result = dao.insertDeptno(conn, dept);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	
	
	
}
