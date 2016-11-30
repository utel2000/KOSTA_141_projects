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

	// synchronized ����ȭ�� ������ �̱��� ����
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

	// �׸� �߰�.
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
			pstmt.setString(6, vo.getImg());
			pstmt.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

	// ����Ʈ ���
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
		while (rs.next()) {
			SBoardVO v = new SBoardVO();
			v.setNum(rs.getInt("num"));
			v.setSub(rs.getString("sub"));
			v.setWriter(rs.getString("writer"));
			v.setCont(rs.getString("cont"));
			v.setRdate(rs.getString("rdate"));
			v.setReip(rs.getString("reip"));
			v.setImg(rs.getString("img"));
			// ���ÿ� ArrayList�� ���� ���� v�� �ּҸ� ����!
			list.add(v);
		}
		rs.close();
		pstmt.close();
		con.close();
		return list;
	}

	// �� ����
	public SBoardVO detail(int num) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = MyConn.getConn();
		StringBuffer sql = new StringBuffer();
		sql.append("select * from sboard where num=?");
		pstmt = con.prepareStatement(sql.toString());
		pstmt.setInt(1, num);
		rs = pstmt.executeQuery();
		SBoardVO v = new SBoardVO();
		if (rs.next()) {
			v.setNum(rs.getInt("num"));
			v.setSub(rs.getString("sub"));
			v.setWriter(rs.getString("writer"));
			v.setCont(rs.getString("cont"));
			v.setRdate(rs.getString("rdate"));
			v.setReip(rs.getString("reip"));
			v.setImg(rs.getString("img"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return v;
	}

	// ���� Dao
	public void delete(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = MyConn.getConn();
			StringBuffer sql = new StringBuffer();
			sql.append("delete from sboard where num=?");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, num);
			System.out.println(sql);
			pstmt.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

	// ��ü���� Dao
	public void delete() {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			StringBuffer sql = new StringBuffer();
			con = MyConn.getConn();
			sql.append("delete from sboard");
			pstmt = con.prepareStatement(sql.toString());
			System.out.println(sql);
			pstmt.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	// �����Ǵ� Ư�� �ο��� �̹������ϸ� ���� Dao
		public String findDeleteImgName(int num) {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String imgName = null;
			try {
				con = MyConn.getConn();
				StringBuffer sql = new StringBuffer();
				sql.append("select img from sboard where num=?");
				pstmt = con.prepareStatement(sql.toString());
				pstmt.setInt(1, num);
				System.out.println(sql);
				rs = pstmt.executeQuery();
				if(rs.next()){
					imgName = rs.getString("img");
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			} finally {
				try {
					if (rs != null)
						rs.close();
					if (pstmt != null)
						pstmt.close();
					if (con != null)
						con.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			return imgName;
		}
		
		// ��ü �����Ǵ� �ο���� �̹������ϸ� ���� Dao
		public ArrayList<String> findAllImgName() {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			ArrayList<String> allist = new ArrayList<>();
			String imgName = null;
			try {
				con = MyConn.getConn();
				StringBuffer sql = new StringBuffer();
				sql.append("select img from sboard");
				pstmt = con.prepareStatement(sql.toString());
				System.out.println(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					imgName = rs.getString("img");
					allist.add(imgName);
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			} finally {
				try {
					if (rs != null)
						rs.close();
					if (pstmt != null)
						pstmt.close();
					if (con != null)
						con.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			return allist;
		}

		// ����(update)�ϴ� Dao
		public void update() {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				StringBuffer sql = new StringBuffer();
				con = MyConn.getConn();
				sql.append("update sboard set ");
				pstmt = con.prepareStatement(sql.toString());
				System.out.println(sql);
				pstmt.executeUpdate();
			} catch (SQLException ex) {
				ex.printStackTrace();
			} finally {
				try {
					if (pstmt != null)
						pstmt.close();
					if (con != null)
						con.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
}
