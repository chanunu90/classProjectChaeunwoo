package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {

		try {
			// 1. 드라이버 로드 : Class.forName("클레스의 풀네임")
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Conection 객체를 생성 : 연결 정보
			// jdbcUrl (지금은 내 로컬이라 @localhost:1521:xe(@호스트이름:포트:sid) 이렇게 쓰지만 추후에 다른 로컬 디비쓰려면 유알엘 써줘야함) 
			// oracle 연결
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "HR", "tiger");
			
			// MySql연결
			//3306은 기본포트라서 거의대부분 바꾼다.
//							jdbc:mysql://IP주소:3306/데이터베이스이름
//			String dbUrl = "jdbc:mysql://localhost:3306/project";
//			Connection conn = DriverManager.getConnection(dbUrl, "himedia", "tiger");
			
			// 3. Statement / PreparedStatement => sql 실행 요청 
			// insert sql
			String sql = "insert into dept values(? , ? , ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,50);
			ps.setString(2,"개발팀");
			ps.setString(3,"서울");
			
			int result = ps.executeUpdate(); // INSERT, UPDATE , DELETE
			
			if(result > 0) {
				System.out.println("정상적으로 실행 되었습니다.");
			}
			
			
//			if(conn != null) {
//				System.out.println("데이터베이스 연결!!!");
//				conn.close();
//			}	
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
