package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConn {
    
    static { // 스태틱 초기화 블럭.
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loading Surccess!");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public static Connection getConn() throws SQLException{
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "mykosta";
        String password = "test00";
        return DriverManager.getConnection(url, user, password);
    }
}
