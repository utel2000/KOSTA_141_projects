package ex1;
import conn.MyConn;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import vo.SawonVO;
// DAO(Data Access Object) : �ݺ����� CURD�� �ش�Ǵ� �޼��带
// ������ Ŭ������ �и� ***** (������, ����å���� ��Ģ)
public class SawonDao {
    // �̱��� ����.(����ȭ�� ���� - ��Ʈ��ũ��, 3tierȯ���� �ƴ�)
    private static SawonDao dao;
    public static SawonDao getDao() {
        // ���ʿ� getDao�� ȣ���� ����ڿ��� ������
        // �ι�°���ʹ� �̹� static�� ������ �ּҸ� �����Ѵ�.
        if (dao == null) {
            dao = new SawonDao();
        }
        return dao;
    }
    public ArrayList<SawonVO> sawonSearch(int deptno) throws SQLException {
        // cursor�� select�� row�ϳ��� vo�� ��Ƽ� ������ ArrayList
        ArrayList<SawonVO> arlist = new ArrayList<SawonVO>();
        // Ŀ�ؼ� ȹ��
        Connection con = MyConn.getConn();
        // ���ν��� ȣ�� �� ? �� ȣ��� mode�� ���ε� �ȴ�.
        CallableStatement cs = con.prepareCall("begin p_sawon(?,?); end;");
        // �Է� �Ķ���� inmode
        cs.setInt(1, deptno);
        // ��� �Ķ���� SYS_REFCURSOR
        cs.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
        // ����
        cs.execute();
        // Ŀ���� ȹ��
        ResultSet rs = (ResultSet) cs.getObject(2);
        while (rs.next()) {
            // select * from sawon �̴�.
            // 10����� �����Ѵٸ� rs.next() ȣ���� �� ��?
            // �ϳ��� row�� �ݺ��ϸ� ����ߴµ� �̰��� vo�� ����!
            SawonVO v = new SawonVO();
            v.setSabun(rs.getInt("sabun"));
            v.setSaname(rs.getString("saname"));
//            v.setComm(rs.getInt("comm"));
            v.setDeptno(rs.getInt("deptno"));
            v.setSahire(rs.getString("sahire"));
            v.setSajob(rs.getString("sajob"));
            v.setSapay(rs.getInt("sapay"));
            v.setSasex(rs.getString("sasex"));
            // v�ϳ��� �ϳ��� �����ͷ� ����Ͽ� �� �ּҸ�
            // ArrayList�� ��� �д�.
            arlist.add(v);
        }
        cs.close();
        rs.close();
        con.close();
        return arlist; // ��ȯ
    }
}
