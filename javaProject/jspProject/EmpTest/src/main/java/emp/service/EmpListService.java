package emp.service;

import java.sql.SQLException;
import java.util.List;

import emp.dao.EmpMemberDAO;
import emp.domain.EmpMemberDTO;
import emp.util.ConnectionProvider;

public class EmpListService{

	EmpMemberDAO dao = new EmpMemberDAO();
	
	public List<EmpMemberDTO>getlist() throws SQLException {
		
		return dao.selectByAll(ConnectionProvider.getConnection());
	}

}
