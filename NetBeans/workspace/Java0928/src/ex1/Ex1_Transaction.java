package ex1;

import conn.MyConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex1_Transaction {

    public void addTest1() {
        Connection con = null;
        PreparedStatement pstmt = null;
        boolean success = false;
        try {
            con = MyConn.getConn();
            System.out.println("Ŀ�ؼ� ����"+con);
            String query1 = "insert into test1 values('k1','11')";
            String query2 = "insert into test1 values('k2','11')";
            String query3 = "insert into test1 values('k3','11')";
            String cnt = "update testcnt set contv=contv+1 where num=1";
            pstmt = con.prepareCall(query1);
            pstmt.executeUpdate();
            pstmt = con.prepareCall(query2);
            pstmt.executeUpdate();
            int num = 10/0; // ���ܰ� �߻��ϴ��� ����ó���� �ȵȴ�.
            pstmt = con.prepareCall(query3);
            pstmt.executeUpdate();
            pstmt = con.prepareCall(cnt);
            pstmt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(); // �ݵ�� ���!
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException ex){ 
                ex.printStackTrace();
            }
        }

    }
    public void addTest2() {
        Connection con = null;
        PreparedStatement pstmt = null;
        boolean success = false;
        try {
            con = MyConn.getConn();
            // JDBC�� �⺻ ������ AutoCommit�̸� ��������!(Ʈ������� ����)
            con.setAutoCommit(false); 
            System.out.println("Ŀ�ؼ� ����"+con);
            String query1 = "insert into test1 values('k1','11')";
            String query2 = "insert into test1 values('k2','11')";
            String query3 = "insert into test1 values('k3','11')";
            String cnt = "update testcnt set contv=contv+1 where num=1";
            pstmt = con.prepareCall(query1);
            pstmt.executeUpdate();
            pstmt = con.prepareCall(query2);
            pstmt.executeUpdate();
            int num = 10/0; // ���ܰ� �߻��ϴ��� ����ó���� �ȵȴ�.
            pstmt = con.prepareCall(query3);
            pstmt.executeUpdate();
            pstmt = con.prepareCall(cnt);
            pstmt.executeUpdate();
            // �Ϸ�� ����ó��
            success = true;
        } catch (Exception ex) {
            ex.printStackTrace(); // �ݵ�� ���!
        } finally {
            try {
                if(success){
                    con.commit(); //����ó���� �Ϸ�.
                }else{
                    con.rollback(); // �ѹ��ϰڴ�.
                }
                if (con != null) {
                    con.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException ex){ 
                ex.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Ex1_Transaction ref = new Ex1_Transaction();
//        ref.addTest1();
        ref.addTest2();
    }
}
