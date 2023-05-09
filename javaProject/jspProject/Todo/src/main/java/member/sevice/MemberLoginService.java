package member.sevice;

import java.sql.Connection;
import java.sql.SQLException;

import member.dao.MemberDAO;
import member.domain.MemberDTO;
import todo.util.ConnectionProvider;

public class MemberLoginService {
	
	MemberDAO dao = null;
	
	public MemberLoginService() {
		this.dao = new MemberDAO();
	};
	
	//id, pw 요청해서 dao 로 select 할꺼다. => MemberDTO
	public MemberDTO login(String uid, String pw) {
		
		MemberDTO member = null;
		Connection conn = null;
		try {
			// conn
			conn = ConnectionProvider.getConnection();
			//dao.selectByUidPw
			member = dao.selectByUidPw(conn, uid, pw);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			if(conn != null) {
				
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
			
		}
		
		
		return member;
		
	}
	
	
	
}
