package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

public class EmpDao {
		
	public static void main(String[] args) {
		
		try {
			//ConnectionProvider
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.154:1521:xe", "hr" , "tiger" );
			
			//컨트롤러
			Scanner sc = new Scanner(System.in);
			PreparedStatement pstmt = conn.prepareStatement("select * from emp where empno = ?");
			pstmt.setString(1, sc.nextLine());
			
			ResultSet rs =  pstmt.executeQuery();
			
			int count = 0;
			
			while(rs.next()){
				System.out.println(rs.getString(1));
				count++;
			}
			
			System.out.println(count + "개의 작업 완료");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}
