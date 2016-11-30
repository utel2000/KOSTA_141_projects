package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import conn.MyConn;

public class LoginDao {
	private static LoginDao dao;

	public synchronized static LoginDao getDao() {
		if (dao == null) {
			dao = new LoginDao();
		}
		return dao;
	}

	public Map<String, String> loginProcess(Map<String, String> m) throws SQLException {
		// log start
		StringBuffer log = new StringBuffer();
		System.out.println("<LoginDao.java> - loginProcess(Map<String, String> m)");
		// log end
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Map<String, String> mUser = new HashMap<>();
		StringBuffer sql = new StringBuffer();
		con = MyConn.getConn();
		sql.append("select name, priv ");
		sql.append("from memberdemo ");
		sql.append("where id=? and pwd=?");
		
		// log start
		log.append("* SQL¹® : ").append(sql).append("\n");
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		pstmt = con.prepareStatement(sql.toString());
		pstmt.setString(1, m.get("id"));
		pstmt.setString(2, m.get("pwd"));
		rs = pstmt.executeQuery();
		if (rs.next()) {
			// log start
			log.append("* rs.getString(\"name\") : ").append(rs.getString("name")).append("\n");
			log.append("* rs.getString(\"priv\") : ").append(rs.getString("priv")).append("\n");
			System.out.println(log);
			log.delete(0, log.length());
			// log end
			
			mUser.put("name", rs.getString("name"));
			mUser.put("priv", rs.getString("priv"));
		}
		return mUser;
	}
}
