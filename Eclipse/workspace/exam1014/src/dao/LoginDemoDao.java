package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import conn.MyConn;

public class LoginDemoDao {
	private static LoginDemoDao dao;
	
	public synchronized static LoginDemoDao getDao() {
		if(dao == null) dao = new LoginDemoDao();
		return dao;
	}
	
	// VO대신 Map으로 하는 이유: 다양하게 배워보라는 뜻.
	public Map<String, String> loginProcess(Map<String, String> m) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Map<String, String> mUser = new HashMap<>();
		con = MyConn.getConn();
		StringBuffer sql = new StringBuffer();
		sql.append("select name, priv from admindemo where id=? and pwd=?");
		pstmt = con.prepareStatement(sql.toString());
		pstmt.setString(1,  m.get("uid"));
		pstmt.setString(2,  m.get("pwd"));
		rs = pstmt.executeQuery();
		if (rs.next()) {
			mUser.put("name", rs.getString("name"));
			mUser.put("priv", rs.getString("priv"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return mUser;	
	}
}
