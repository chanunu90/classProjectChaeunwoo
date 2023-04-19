package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTest {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			// 1. 드라이버 로드 : Class.forName("클레스의 풀네임")
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Conection 객체를 생성 : 연결 정보
			// oracle 연결
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dbUrl, "HR", "tiger");
			// MySql연결
//			String dbUrl = "jdbc:mysql://localhost:3306/project";
//			Connection conn = DriverManager.getConnection(dbUrl, "himedia", "tiger");
			//커밋을 자동으로 하면 안된다.
			conn.setAutoCommit(false);
			
			// 3. Statement / PreparedStatement => sql 실행 요청 
			String sql = "delete from dept where deptno=?";
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1,50);
			
			int result = ps.executeUpdate(); // INSERT, UPDATE , DELETE
			
			if(result == 1) {
				System.out.println("데이터가 삭제되었습니다.");
			}
			
		} catch (SQLException e) {
			System.out.println("연결 실패.........");
			if(conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("연결 실패.........");
			e.printStackTrace();
		}finally {
			//완료
			
				try {
					if(conn != null) {
						conn.commit();
						conn.close();
					}
					if(conn != null) {
						ps.close();
					}
					
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}

	}

}
