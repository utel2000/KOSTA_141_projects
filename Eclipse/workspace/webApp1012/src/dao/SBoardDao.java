package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.MyConn;
import vo.SBoardVO;

public class SBoardDao {
	private static SBoardDao dao;

	// synchronized 동기화를 적용한 싱글톤 패턴
	public synchronized static SBoardDao getDao() {
		if (dao == null)
			dao = new SBoardDao();
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

	public void save(SBoardVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("insert into sboard values(");
			sql.append("sboard_seq.nextVal,?,?,?,?,sysdate,?,?)");
			System.out.println(sql);
			con = MyConn.getConn();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, vo.getSub());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getPwd());
			pstmt.setString(4, vo.getCont());
			pstmt.setString(5, vo.getReip());
			pstmt.setString(6, "noimage.jpg");
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
	
	public ArrayList<SBoardVO> list() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = MyConn.getConn();
		StringBuffer sql = new StringBuffer();
		sql.append("select * from sboard order by 1 desc");
		ArrayList<SBoardVO> list = new ArrayList<>();
		pstmt = con.prepareStatement(sql.toString());
		rs = pstmt.executeQuery();
		while(rs.next()) {
			SBoardVO v = new SBoardVO();
			v.setNum(rs.getInt("num"));
			v.setSub(rs.getString("sub"));
			v.setWriter(rs.getString("writer"));
			v.setCont(rs.getString("cont"));
			v.setRdate(rs.getString("rdate"));
			v.setReip(rs.getString("reip"));
			// 동시에 ArrayList에 값을 가진 v의 주소를 저장!
			list.add(v);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return list;
	}
}
