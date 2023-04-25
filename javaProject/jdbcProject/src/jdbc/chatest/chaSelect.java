package jdbc.chatest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class chaSelect {

	public static void main(String[] args) {
		
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Connection ct = DriverManager.getConnection(dbUrl, "hr" , "tiger");
			
			if(ct != null) {
				System.out.println("데이터베이스에 연결 완료");
			}
			
			ct.setAutoCommit(false);
			
			String query = "select * from dept where deptno = ?";
			PreparedStatement ps = ct.prepareStatement(query);
			ps.setInt(1, 20);
            //ps.executeUpdate(); 나머지 dml은 이거
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
			
				System.out.println(	rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
