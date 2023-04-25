package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Dept;

public class DeptDao {
	
	// 여러개가 필요없으니 싱글톤처리를 한다.
	// 1. 인스턴스 생성 금지 : private 생성자
	private DeptDao(){ // 딴대서 이클레스 생성못하게 막아버림
	}
	// 2. 클래스 내부에서 인스턴스 생성 : private static
	private static DeptDao dao = new DeptDao();
	
	// 3. 다른클래스에서 인스텀스를 얻을 수 있는 메소드 : public static
	public static DeptDao getInstance() {
		return dao;
	}
	
	// 1. dept list : List<Dept>
	public List<Dept> selectByAll(Connection conn){

		// Connection close() 해줘야함
		// PreparedStatement
		PreparedStatement pstmt = null;
		List<Dept> result = new ArrayList<>();
		ResultSet rs = null;
		
		try {
			// 반환하고자 하는 결과 데이터
			// Collection 클래스중 List => 입력 순서
			String sql = "select * from dept";
			pstmt = conn.prepareStatement(sql);
//			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
//			conn = DriverManager.getConnection(dbUrl, "HR", "tiger");
			rs = pstmt.executeQuery();
			
			// while
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
			
				Dept dept = new Dept(deptno , dname , loc);
				//result에 Dept 객체를 추가
				result.add(dept);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(rs != null) {
					pstmt.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}
	
	// 2. 부서번호로 검색(Connection conn , int num)
	public Dept selectByDeptno(Connection conn , int deptno) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Dept result = null;
		
		//sql
		String sql = "select * from dept where deptno = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = new Dept(rs.getInt(1) , rs.getString(2) , rs.getString(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
		
	}
	
	
	// 3. 부서 정보 입력
	// 은우 테스트
	public int insertByDeptno(Connection conn , int deptno , String dname , String loc) {
		
		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		Dept result = null;
		int resultf = 0;
		
		//sql
		String sql = "insert into dept values ( ? , ? , ? )";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			resultf = pstmt.executeUpdate();
			
			if(resultf > 0) {
				System.out.println( " 정상적으로 입력 되었습니다. " );
			}else{
				System.out.println( " 입력이 실패하였습니다. " );
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			try {
				
				if(pstmt!=null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			
			
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return resultf;
		
	}
	
	
	public int insertDeptno(Connection conn , Dept dept) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		//sql
		String sql = "insert into dept values ( ? , ? , ? )";
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println(result + "건의 행이 입력 되었습니다.");
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			try {
				
				if(pstmt!=null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			
			
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
		
	}
	
	// 4. 부서 정보 수정 : deptno , dname , loc
	public int updateDeptByDeptno(Connection conn , Dept dept) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String sql = "update dept set dname=? , LOC=? WHERE DEPTNO=?";
		try {
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			try {
				
				if(pstmt!=null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.commit();
					conn.close();
				}
			
			
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
		
	}
	
	// 5. 부서 정보 삭제
	public int deleteDeptByDeptno(Connection conn , int deptno) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String sql = "delete from dept where deptno=?";
		try {
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			try {
				
				if(pstmt!=null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			
			
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
		
	}
	
	
	
	
	
	//일단 다오가 제대로 돌아가는지 테스트하는 메인클레스
	public static void main(String[] args) throws SQLException {
		
		DeptDao dd = new DeptDao();
		// oracle 연결
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(dbUrl, "HR", "tiger");
		
		List<Dept> list = dd.selectByAll(conn);
		
		//result : 4개의 객체를 가지고 있다.
		for(Dept s : list) {
			System.out.println(s);
		};
		
//		Dept dept = dd.selectByDeptno(conn, 10);
		dd.selectByDeptno(conn, 10);
		
		
//		int unbserRasdasdasd = dd.insertDeptno(conn, new Dept(70 , "TEST" , "Seoul") );
//		System.out.println("저장 결과 : " + unbserRasdasdasd);
		
		
//		int unbserRasdasdasd = dd.updateDeptByDeptno(conn, new Dept(80 , "asd" , "asd") );
//		System.out.println("저장 결과 : " + unbserRasdasdasd);
		
		int unbserRasdasdasd = dd.deleteDeptByDeptno(conn, 80 );
		System.out.println("삭제 결과 : " + unbserRasdasdasd);
	}
	
}
