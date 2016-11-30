package dao;

import java.sql.Connection;
import java.sql.SQLException;
import conn.MyConn;

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
}
