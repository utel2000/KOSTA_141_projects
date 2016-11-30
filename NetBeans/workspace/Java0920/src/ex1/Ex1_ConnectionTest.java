package ex1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
// JDBC�� ����� DML�� ��� autocommit�̴�.(�� commit�� �� �ʿ䰡 ����.)
public class Ex1_ConnectionTest {
    public static void main(String[] args) {
        // ����ڷ� ���� �Է°��� �޾Ƽ� ����� Connection�� ���ؼ�
        // �����ͺ��̽��� emp���̺� ��Ÿ������ �����͸� �����غ���.
        // 1. Scanner����
        Scanner sc = new Scanner(System.in);
        // 2. �Է� UI, ��ȣ, �̸�, ��å
        System.out.print("��ȣ : ");
        int enums = Integer.parseInt(sc.nextLine());
        System.out.print("�̸� : ");
        String ename = sc.nextLine();
        System.out.print("��å : ");
        String ejob = sc.nextLine();
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String id = "mykosta";
            String pwd = "test00";
            con = DriverManager.getConnection(url, id, pwd);
            System.out.println("Oracle ������ ����!");
            // 3. Statements��ü�� ����ؼ� ����ڰ� �Է��� ���� �����Ѵ�.
            stmt = con.createStatement();
            // 4. SQL��ɹ� �ۼ� - insert
            StringBuffer sql = new StringBuffer();
            sql.append("insert into emp (empno,ename,job,hiredate)");
            sql.append(" values(").append(enums).append(",'");
            sql.append(ename).append("','");
            sql.append(ejob).append("',sysdate)");
            System.out.println(sql);
            // 5. �ۼ��� ������ ����
            int res = stmt.executeUpdate(sql.toString());
            System.out.println(res+" ���� ���� �߰� �Ǿ����ϴ�.");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally{
            try{
                if(stmt!=null) stmt.close();
                if(con !=null) con.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
}
