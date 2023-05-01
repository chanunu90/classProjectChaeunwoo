package todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import todo.domain.todoDTO;
import todo.util.ConnectionProvider;

public class TodoDAO {

	// 싱글톤
	// 1. 생성자 - private
	private TodoDAO() {

	}

	// 2. 내부에서 인스턴스 생성 -> private static
	private static TodoDAO dao = new TodoDAO();

	// 3. 외부에서 TodoDAO의 참조값을 얻어갈 수 있는 메소드 -> public static
	public static TodoDAO getInstance() {
		return dao;
	}

	// TodoDTO 리스트를 반환하는 메소드
	public List<todoDTO> selectByAll(Connection conn) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from tbl_todo";
		List<todoDTO> list = null;

		// SQL
		// PreparedStatment
		try {
			pstmt = conn.prepareStatement(sql);
			// prtmt.setString(0, sql);
			// 결과 받기
			rs = pstmt.executeQuery();

			list = new ArrayList<todoDTO>();

			while (rs.next()) {
				int tno = rs.getInt("tno");
				String todo = rs.getString("todo");
				String duedate = rs.getString("duedate");
				boolean finished = rs.getBoolean("finished");

				todoDTO dto = new todoDTO(tno, todo, duedate, finished);
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				if (rs != null) {
					rs.close();
				}

				if (pstmt != null) {
					pstmt.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// ResultSet
		// List<TodoDTO> 에 저장 반환

		return list;
	}

	public static void main(String[] args) throws SQLException {
		TodoDAO todo = TodoDAO.getInstance();
		Connection conn = ConnectionProvider.getConnection();

		List<todoDTO> list = dao.selectByAll(conn);
		for (todoDTO todod : list) {
			System.out.println(todod);
		}

	}

}
