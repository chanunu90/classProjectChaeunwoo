package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ConnectionProvider {

	public static Connection getConnection() throws SQLException{
		
		// Connection 객체 구하기
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		return DriverManager.getConnection(dbUrl, "hr", "tiger");
		
	} 
	
}
