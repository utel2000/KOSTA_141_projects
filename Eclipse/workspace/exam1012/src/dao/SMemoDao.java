package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conn.MyConn;
import vo.SMemoVO;

public class SMemoDao {
	private static SMemoDao dao;

	// synchronized 동기화를 적용한 싱글톤 패턴
	public synchronized static SMemoDao getDao() {
		if (dao == null)
			dao = new SMemoDao();
		return dao;
	}

	public void addDemo() {
		Connection con = null;
		try {
			con = MyConn.getConn();
			System.out.println("Connection! " + con);
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

	public void save(SMemoVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("insert into smemo values(");
			sql.append("seq_smemo.nextVal,?,?,?,sysdate,?)");
			System.out.println(sql);
			con = MyConn.getConn();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getMemo());
			pstmt.setString(4, vo.getReip());
			pstmt.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}
