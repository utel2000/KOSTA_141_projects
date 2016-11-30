package ex1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
// JDBC를 사용한 DML은 모두 autocommit이다.(즉 commit을 줄 필요가 없다.)
public class Ex1_ConnectionTest {
    public static void main(String[] args) {
        // 사용자로 부터 입력값을 받아서 연결된 Connection을 통해서
        // 데이터베이스의 emp테이블에 런타임으로 데이터를 저장해보자.
        // 1. Scanner생성
        Scanner sc = new Scanner(System.in);
        // 2. 입력 UI, 번호, 이름, 직책
        System.out.print("번호 : ");
        int enums = Integer.parseInt(sc.nextLine());
        System.out.print("이름 : ");
        String ename = sc.nextLine();
        System.out.print("직책 : ");
        String ejob = sc.nextLine();
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String id = "mykosta";
            String pwd = "test00";
            con = DriverManager.getConnection(url, id, pwd);
            System.out.println("Oracle 접속이 성공!");
            // 3. Statements객체를 사용해서 사용자가 입력한 값을 전달한다.
            stmt = con.createStatement();
            // 4. SQL명령문 작성 - insert
            StringBuffer sql = new StringBuffer();
            sql.append("insert into emp (empno,ename,job,hiredate)");
            sql.append(" values(").append(enums).append(",'");
            sql.append(ename).append("','");
            sql.append(ejob).append("',sysdate)");
            System.out.println(sql);
            // 5. 작성된 쿼리를 실행
            int res = stmt.executeUpdate(sql.toString());
            System.out.println(res+" 개의 행이 추가 되었습니다.");
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
