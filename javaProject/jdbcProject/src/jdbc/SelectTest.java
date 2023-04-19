package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			// 1. 드라이버 로드 : Class.forName("클레스의 풀네임")
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Conection 객체를 생성 : 연결 정보
			// jdbcUrl (지금은 내 로컬이라 @localhost:1521:xe(@호스트이름:포트:sid) 이렇게 쓰지만 추후에 다른 로컬 디비쓰려면 유알엘 써줘야함) 
			// oracle 연결
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "HR", "tiger");
			
			// MySql연결
			//3306은 기본포트라서 거의대부분 바꾼다.
//							jdbc:mysql://IP주소:3306/데이터베이스이름
			//String dbUrl = "jdbc:mysql://localhost:3306/project";
			//Connection conn = DriverManager.getConnection(dbUrl, "himedia", "tiger");
			
			// 3. Statement / PreparedStatement => sql 실행 요청 메소드
			Statement stmt = conn.createStatement();
			
			//sql
			//String sql = "select * from dept";
			String sql = "select deptno, dname, loc from dept order by deptno";
			//select 실행 메소드 (executeQuery)
			
			// 4. select 의 결과 데이터는 ResultSet 객체로 받는다.
			ResultSet rs = stmt.executeQuery(sql); // 여기에 셀렉트관련 쿼리써줌 
			
			// 5. ResultSet 객체에서 데이터 추출
			while(rs.next()) {
//				int deptno = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
				
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				
				System.out.println(deptno + "\t" + dname + "\t" + loc);
			}
			
//			if(conn != null) {
//				System.out.println("데이터베이스 연결!!!");
//				conn.close();
//			}
			
			rs.getStatement();
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("연결 실패.........");
			e.printStackTrace();
		}

	}

}
