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
            System.out.println("커넥션 연결"+con);
            String query1 = "insert into test1 values('k1','11')";
            String query2 = "insert into test1 values('k2','11')";
            String query3 = "insert into test1 values('k3','11')";
            String cnt = "update testcnt set contv=contv+1 where num=1";
            pstmt = con.prepareCall(query1);
            pstmt.executeUpdate();
            pstmt = con.prepareCall(query2);
            pstmt.executeUpdate();
            int num = 10/0; // 예외가 발생하더라도 단위처리가 안된다.
            pstmt = con.prepareCall(query3);
            pstmt.executeUpdate();
            pstmt = con.prepareCall(cnt);
            pstmt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(); // 반드시 출력!
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
            // JDBC는 기본 설정이 AutoCommit이며 해제가능!(트랜잭션을 위해)
            con.setAutoCommit(false); 
            System.out.println("커넥션 연결"+con);
            String query1 = "insert into test1 values('k1','11')";
            String query2 = "insert into test1 values('k2','11')";
            String query3 = "insert into test1 values('k3','11')";
            String cnt = "update testcnt set contv=contv+1 where num=1";
            pstmt = con.prepareCall(query1);
            pstmt.executeUpdate();
            pstmt = con.prepareCall(query2);
            pstmt.executeUpdate();
            int num = 10/0; // 예외가 발생하더라도 단위처리가 안된다.
            pstmt = con.prepareCall(query3);
            pstmt.executeUpdate();
            pstmt = con.prepareCall(cnt);
            pstmt.executeUpdate();
            // 완료된 단위처리
            success = true;
        } catch (Exception ex) {
            ex.printStackTrace(); // 반드시 출력!
        } finally {
            try {
                if(success){
                    con.commit(); //단위처리를 완료.
                }else{
                    con.rollback(); // 롤백하겠다.
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
