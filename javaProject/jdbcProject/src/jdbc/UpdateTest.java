package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {

	public static void main(String[] args) {

		try {
			// 1. 드라이버 로드 : Class.forName("클레스의 풀네임")
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Conection 객체를 생성 : 연결 정보
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "HR", "tiger");
			
			// MySql연결
			//3306은 기본포트라서 거의대부분 바꾼다.
//							jdbc:mysql://IP주소:3306/데이터베이스이름
//			String dbUrl = "jdbc:mysql://localhost:3306/project";
//			Connection conn = DriverManager.getConnection(dbUrl, "himedia", "tiger");
			
			// 3. Statement / PreparedStatement => sql 실행 요청 
			// insert sql
			String sql = "update dept set dname=?,loc=? where deptno=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1,"디자인팀");
			ps.setString(2,"제주");
			ps.setInt(3,50);
			
			int result = ps.executeUpdate(); // INSERT, UPDATE , DELETE
			
			if(result > 0) {
				System.out.println("데이터가 수정되었습니다.");
			}
			
			conn.close();
			ps.close();
			
		} catch (SQLException e) {
			System.out.println("연결 실패.........");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("연결 실패.........");
			e.printStackTrace();
		}
		

		
		

	}

}
