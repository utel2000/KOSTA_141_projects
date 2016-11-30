package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		System.out.println("<MemberDAO.java>");
		log.append("* v.getId() : ").append(v.getId()).append("\n");
		log.append("* v.getPwd() : ").append(v.getPwd()).append("\n");
		log.append("* v.getName() : ").append(v.getName()).append("\n");
		log.append("* v.getEmail() : ").append(v.getEmail()).append("\n");
		log.append("* v.getBirth() : ").append(v.getBirth()).append("\n");
		log.append("* v.getTel() : ").append(v.getTel()).append("\n");
		log.append("* v.getReip() : ").append(v.getReip()).append("\n");
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		StringBuffer sql = new StringBuffer();
		sql.append("insert into memberdemo ")
		.append("values (seq_memberdemo.nextval, ?, ?, ?, ?, ?, ?, sysdate, ?)");

		// log start
		log.append("* sql : ").append(sql).append("\n");
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
			log.append("* exeChk : ").append(exeChk);
			System.out.println(log);
			log.delete(0, log.length());
			// log end
		} catch (SQLException ex) {
			ex.printStackTrace();
		} 
		
	}
}
