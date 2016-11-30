package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    // DB연결을 위해 제일 먼저 스태틱 초기화 블럭에서 드라이버 로딩.
    static { 
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loading Surccess!");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    // url, id, pwd를 통해 DB와의 연결을 반환.
    public static Connection getConn() throws SQLException{
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "mykosta";
        String password = "test00";
        return DriverManager.getConnection(url, user, password);
    }
}
