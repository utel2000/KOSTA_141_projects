package exam1;

import conn.MyConn;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import vo.SawonVO;

public class SawonDao {

    private static SawonDao dao;

    public static SawonDao getDao() {
        if (dao == null) {
            dao = new SawonDao();
        }
        return dao;
    }

    public ArrayList<SawonVO> insertDB(SawonVO v) {
        ArrayList<SawonVO> arlist = new ArrayList<SawonVO>();
        Connection con = null;
        CallableStatement cs = null;
        try {
            con = MyConn.getConn();
            cs = con.prepareCall("begin ps_in(?,?,?,?,?); end;");
            // 작업중 - 오류
//            cs.setInt(1, saname);
//            cs.setInt(1, deptno);
//            cs.setInt(1, deptno);
//            cs.setInt(1, deptno);
//            cs.setInt(1, deptno);
            cs.execute();
            arlist.add(v);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return arlist;
    }
}
