package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDao;
import domain.Dept;
import util.ConnectionProvider;

public class DeptInsertService2 {

		
		DeptDao dao;
		public DeptInsertService2() {
			this.dao = DeptDao.getInstance();
		}
		
		//검색 번호를 받고 Dept 정보를 저장하고 있는 객체를 반환
		public int insertDept(int deptno , String dname , String loc) {
			
			Connection conn = null;
			int insert = 0;
//			Dept dept = null;
			
			try {
				conn = ConnectionProvider.getConnection();
				insert = dao.insertByDeptno(conn, deptno , dname , loc);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return insert;

		}
}
