package emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import emp.domain.EmpMemberDTO;
import emp.util.ConnectionProvider;

public class EmpMemberDAO {
	
	// 로그인 처리를 위한 select 
	// uid, pw 비교해서 처리 => MemberDTO
	
	// 전체리스트를 가지고온다,
	public List<EmpMemberDTO> selectByAll(Connection conn) {
		
		List<EmpMemberDTO> empMember = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from emp";
		
		try {
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			empMember = new ArrayList<EmpMemberDTO>();
			
			while(rs.next()) {
				
				int eno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				String mgr = rs.getString("mgr");
				
				String hiredate = rs.getString("hiredate");
				String sal = rs.getString("sal");
				String comm = rs.getString("comm");
				String deptno = rs.getString("deptno");
				
				empMember.add(new EmpMemberDTO( eno , ename , job , mgr , hiredate , sal , comm , deptno ));
				
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
		
		return empMember;
	}
	
	
	
	// 사원번호를 이용하여 조회한값을 가지고 온다
	public EmpMemberDTO selectByEmpno(Connection conn , String empno) {
		
		EmpMemberDTO memberDTO = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from emp where empno = ?";
		
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, empno);
			rs = pstmt.executeQuery();
//			rs = pstmt.executeUpdate();
			
			while(rs.next()) {
				
				int eno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				String mgr = rs.getString("mgr");
				
				String hiredate = rs.getString("hiredate");
				String sal = rs.getString("sal");
				String comm = rs.getString("comm");
				String deptno = rs.getString("deptno");
				
				memberDTO = new EmpMemberDTO(eno , ename , job , mgr , hiredate , sal , comm , deptno );
				
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
	
	// 업데이트 이름만 변경 테스트
	public int updateByEmpno(Connection conn , String ename , int empno) {
		
		PreparedStatement pstmt = null;
		int rs = 0;
		
		String sql = "update emp set ename = ? where empno = ?";
		
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ename);
			pstmt.setInt(2, empno);
			rs = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return rs;
		
	}
	
	
	
	// 추가
	
	
	
	// 삭제
	
	// 테스트를 위한 메인
	public static void main(String[] args) throws SQLException {
		
		EmpMemberDAO dao = new EmpMemberDAO();
		Connection conn = ConnectionProvider.getConnection();
		
		// 전체를 조회
//		List<EmpMemberDTO> members = dao.selectByAll(conn);
//		for(EmpMemberDTO member : members) {
//			System.out.println(member);
//		}
		
		// 사원번호 를 넣었을때 조회
//		EmpMemberDTO member = dao.selectByEmpno(conn , "7499");
//		System.out.println(member);
		
		// 사원번호를 이용하여 사원의 이름 변경
		int member = dao.updateByEmpno(conn , "ALLEN" , 7499);
		if(member > 0) {
			System.out.println(member + "건을 수정을 완료 하였습니다.");
		}
		
		
			
	}
	
	
	
		
}
