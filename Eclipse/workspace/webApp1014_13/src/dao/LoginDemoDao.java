package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import conn.MyConn;
import vo.SBoardVO;

public class LoginDemoDao {
	private static LoginDemoDao dao;
	
	public synchronized static LoginDemoDao getDao() {
		if(dao == null) dao = new LoginDemoDao();
		return dao;
	}
	
	// VO대신 Map으로 하는 이유: 다양하게 배워보라는 뜻.
	public String loginProcess(Map<String, String> m) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = MyConn.getConn();
		StringBuffer sql = new StringBuffer();
		sql.append("select name from memdemo where id=? and pwd=?");
		pstmt = con.prepareStatement(sql.toString());
		pstmt.setString(1,  m.get("uid"));
		pstmt.setString(2,  m.get("pwd"));
		rs = pstmt.executeQuery();
		String res = null;
		if (rs.next()) {
			res = rs.getString("name");
		}
		rs.close();
		pstmt.close();
		con.close();
		return res;
	}
}
