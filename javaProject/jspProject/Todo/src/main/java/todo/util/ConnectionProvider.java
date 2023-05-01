package todo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	//Service : Dao 메소드에 매개변수로 전달
	public static Connection getConnection() throws SQLException {
		//db연결
		String dbUrl = "jdbc:mysql://localhost:3306/project";
		return  DriverManager.getConnection(dbUrl, "himedia" , "tiger");
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println(ConnectionProvider.getConnection());
	}
	
}
