package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import member.domain.MemberDTO;
import todo.util.ConnectionProvider;

public class MemberDAO {
	
	// 로그인 처리를 위한 select 
	// uid, pw 비교해서 처리 => MemberDTO
	
	public MemberDTO selectByUidPw(Connection conn , String uid, String pw) {
		
		// 반환할 결과 데이터 변수 선언
		MemberDTO memberDTO = null;
		// sql 실행을 위해 PreparedStatement 선언 =>  나중에 트라이구문에서 close() 질해주자
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select idx, uid, uname , uphoto from member where uid = ? and pw = ?";
		
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
//			rs = pstmt.executeUpdate();
			
			if(rs.next()) {
				
				int idx = rs.getInt("idx");
				String id = rs.getString("uid");
				String uname = rs.getString("uname");
				String uphoto = rs.getString("uphoto");
				
				memberDTO = new MemberDTO(idx , id , uname , uphoto);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			try {
				
				if(rs != null) {
					rs.close();
				}
				
				if(pstmt != null) {
					pstmt.close();
				}
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return memberDTO;
		
	}
	
	public static void main(String[] args) throws SQLException {
		
		MemberDAO dao = new MemberDAO();
		Connection conn = ConnectionProvider.getConnection();
		
		MemberDTO member = dao.selectByUidPw(conn , "cool" , "1111");
			
//		System.out.println(selectByUidPw(conn , "cool" , "1111"));
		System.out.println(member);
		
			
	}
	
	
	
		
}
