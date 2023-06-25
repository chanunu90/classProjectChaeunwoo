package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnerctionTest {
	
	public static void main(String[] args) {

		try {
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
			
			// 4. select 의 결과 데이터는 ResultSet 객체로 받는다.
			
			// 5. ResultSet 객체에서 데이터 추출
			
			
			if(conn != null) {
				System.out.println("데이터베이스 연결!!!");
				conn.close();
			}
			
		} catch (SQLException e) {
			System.out.println("연결 실패.........");
			e.printStackTrace();
		}

		
		

	}

}
