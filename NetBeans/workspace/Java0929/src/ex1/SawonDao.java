package ex1;
import conn.MyConn;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import vo.SawonVO;
// DAO(Data Access Object) : 반복적인 CURD에 해당되는 메서드를
// 별도의 클래스로 분리 ***** (응집도, 단일책임의 원칙)
public class SawonDao {
    // 싱글톤 개념.(동기화는 빠짐 - 네트워크나, 3tier환경이 아님)
    private static SawonDao dao;
    public static SawonDao getDao() {
        // 최초에 getDao를 호출한 사용자에게 생성을
        // 두번째부터는 이미 static에 생성된 주소를 리턴한다.
        if (dao == null) {
            dao = new SawonDao();
        }
        return dao;
    }
    public ArrayList<SawonVO> sawonSearch(int deptno) throws SQLException {
        // cursor로 select된 row하나당 vo에 담아서 저장할 ArrayList
        ArrayList<SawonVO> arlist = new ArrayList<SawonVO>();
        // 커넥션 획득
        Connection con = MyConn.getConn();
        // 프로시져 호출 후 ? 는 호출시 mode와 바인딩 된다.
        CallableStatement cs = con.prepareCall("begin p_sawon(?,?); end;");
        // 입력 파라미터 inmode
        cs.setInt(1, deptno);
        // 출력 파라미터 SYS_REFCURSOR
        cs.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
        // 실행
        cs.execute();
        // 커서를 획득
        ResultSet rs = (ResultSet) cs.getObject(2);
        while (rs.next()) {
            // select * from sawon 이다.
            // 10개라고 가정한다면 rs.next() 호출이 몇 번?
            // 하나의 row를 반복하며 출력했는데 이것을 vo에 저장!
            SawonVO v = new SawonVO();
            v.setSabun(rs.getInt("sabun"));
            v.setSaname(rs.getString("saname"));
//            v.setComm(rs.getInt("comm"));
            v.setDeptno(rs.getInt("deptno"));
            v.setSahire(rs.getString("sahire"));
            v.setSajob(rs.getString("sajob"));
            v.setSapay(rs.getInt("sapay"));
            v.setSasex(rs.getString("sasex"));
            // v하나당 하나의 데이터로 취급하여 그 주소를
            // ArrayList에 담아 둔다.
            arlist.add(v);
        }
        cs.close();
        rs.close();
        con.close();
        return arlist; // 반환
    }
}
