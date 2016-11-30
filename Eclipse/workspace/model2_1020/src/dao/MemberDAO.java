package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conn.MyConn;
import vo.MemberDemoVO;

public class MemberDAO {
	private static MemberDAO dao;

	public synchronized static MemberDAO getDao() {
		if (dao == null) {
			dao = new MemberDAO();
		}
		return dao;
	}

	public void addMember(MemberDemoVO v) {
		// log start
		StringBuffer log = new StringBuffer();
		System.out.println("<MemberDAO.java> - addMember(MemberDemoVO v)");
		log.append("[Log] v.getId() : ").append(v.getId()).append("\n");
		log.append("[Log] v.getPwd() : ").append(v.getPwd()).append("\n");
		log.append("[Log] v.getName() : ").append(v.getName()).append("\n");
		log.append("[Log] v.getEmail() : ").append(v.getEmail()).append("\n");
		log.append("[Log] v.getBirth() : ").append(v.getBirth()).append("\n");
		log.append("[Log] v.getTel() : ").append(v.getTel()).append("\n");
		log.append("[Log] v.getReip() : ").append(v.getReip()).append("\n");
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		StringBuffer sql = new StringBuffer();
		sql.append("insert into memberdemo ")
		.append("values (seq_memberdemo.nextval, ?, ?, ?, ?, ?, ?, sysdate, ?)");

		// log start
		log.append("[Log] sql : ").append(sql).append("\n");
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		try (Connection con = MyConn.getConn();
				PreparedStatement pstmt = con.prepareStatement(sql.toString())){
			pstmt.setString(1,  v.getId());
			pstmt.setString(2,  v.getPwd());
			pstmt.setString(3,  v.getName());
			pstmt.setString(4,  v.getEmail());
			pstmt.setString(5,  v.getBirth());
			pstmt.setString(6,  v.getTel());
			pstmt.setString(7,  v.getReip());
			int exeChk = pstmt.executeUpdate();
			
			// log start
			log.append("[log] exeChk : ").append(exeChk);
			System.out.println(log);
			log.delete(0, log.length());
			// log end
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public int checkId(String id) {
			// log start
			StringBuffer log = new StringBuffer();
			System.out.println("<MemberDAO.java>-checkId(String id)");
			log.append("[log] id : ").append(id).append("\n");
			System.out.println(log);
			log.delete(0, log.length());
			// log end
			
			int res = 0;
			StringBuffer sql = new StringBuffer();
			sql.append("select count(*) cnt ")
			.append("from memberdemo ")
			.append("where id=?");
			
			// log start
			log.append("[log] sql : ").append(sql).append("\n");
			System.out.println(log);
			log.delete(0, log.length());
			// log end
			try (Connection con = MyConn.getConn();
					PreparedStatement pstmt = con.prepareStatement(sql.toString())){
				pstmt.setString(1,  id);
				try(ResultSet rs = pstmt.executeQuery()){
					if(rs.next()) {
						res = rs.getInt("cnt");
					}
					// log start
					log.append("[log] res : ").append(res).append("\n");
					System.out.println(log);
					log.delete(0, log.length());
					// log end
				} catch(SQLException ex) {
					ex.printStackTrace();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			} 
		return res;
	}
}
