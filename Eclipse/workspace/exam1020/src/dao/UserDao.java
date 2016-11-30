package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import conn.MyConn;
import vo.UserVO;

public class UserDao {
	private static UserDao dao;

	public synchronized static UserDao getDao() {
		if (dao == null) {
			dao = new UserDao();
		}
		return dao;
	}

	public int idChk(String id) {		
		// log start
		StringBuffer log = new StringBuffer();
		System.out.println("<UserDao> - public int userID(String id)");
		log.append("[Log] id : ").append(id).append("\n");
		System.out.println(log);
		log.delete(0, log.length());
		// log end

		StringBuffer sql = new StringBuffer();
		sql.append("select count(*) cnt ")
		.append("from userinfo ")
		.append("where id=?");
		int res = 0;
		try (Connection con = MyConn.getConn();
				PreparedStatement pstmt = con.prepareStatement(sql.toString())) {
		
			// log start
			log.append("[Log] sql : ").append(sql).append("\n");
			System.out.println(log);
			log.delete(0, log.length());
			// log end

			pstmt.setString(1, id);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					res = rs.getInt("cnt");
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
		
		// log start
		log.append("[Log] res : ").append(res).append("\n");
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		return res;
	}
	
	public UserVO loginProcess(Map<String, String> m) {		
		// log start
		StringBuffer log = new StringBuffer();
		System.out.println("<UserDao> - public Map<String, String> loginProcess(Map<String, String> m)");
		log.append("[Log] m.get(\"id\") : ").append(m.get("id")).append("\n");
		log.append("[Log] m.get(\"pwd\") : ").append(m.get("pwd")).append("\n");
		System.out.println(log);
		log.delete(0, log.length());
		// log end

		UserVO vo = new UserVO();
		StringBuffer sql = new StringBuffer();
		sql.append("select num, id ")
		.append("from userinfo ")
		.append("where id=? and pwd=?");
		try (Connection con = MyConn.getConn();
				PreparedStatement pstmt = con.prepareStatement(sql.toString())) {
		
			// log start
			log.append("[Log] sql : ").append(sql).append("\n");
			System.out.println(log);
			log.delete(0, log.length());
			// log end

			pstmt.setString(1, m.get("id"));
			pstmt.setString(2, m.get("pwd"));
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					vo.setNum(rs.getInt("num"));
					vo.setId(rs.getString("id"));
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
		
		// log start
		log.append("[Log] vo.getNum : ").append(vo.getNum()).append("\n");
		log.append("[Log] vo.getId : ").append(vo.getId()).append("\n");
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		return vo;
	}
}