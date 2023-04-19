package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest2 {

	public static void main(String[] args) throws ClassNotFoundException {

		try {
			// 1. 드라이버 로드 : Class.forName("클레스의 풀네임")
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Conection 객체를 생성 : 연결 정보
			// oracle 연결
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "HR", "tiger");
			
			// MySql연결
			//String dbUrl = "jdbc:mysql://localhost:3306/project";
			//Connection conn = DriverManager.getConnection(dbUrl, "himedia", "tiger");
			
			// 3. Statement / PreparedStatement => sql 실행 요청 메소드
			
			//PreparedStatement--여기서부터 중요
			//String sql = "select * from dept where deptno=? and dname=?";
			String sql = "select * from dept";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// ? 파라미터 설정
//			pstmt.setInt(1, 10);
//			pstmt.setString(2, "ACCOUNTING");
			
			// 4. select 의 결과 데이터는 ResultSet 객체로 받는다.
			// select 는 executeQuery() 이다.
			ResultSet rs = pstmt.executeQuery();
			
			// 5. ResultSet 객체에서 데이터 추출
			while(rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t"
					  + rs.getString(2) + "\t"
                      + rs.getString(3));
			}
			
			
//			if(conn != null) {
//				System.out.println("데이터베이스 연결!!!");
//				conn.close();
//			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("연결 실패.........");
			e.printStackTrace();
		}
		

		
		

	}

}
