package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    // DB������ ���� ���� ���� ����ƽ �ʱ�ȭ ������ ����̹� �ε�.
    static { 
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loading Surccess!");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    // url, id, pwd�� ���� DB���� ������ ��ȯ.
    public static Connection getConn() throws SQLException{
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "mykosta";
        String password = "test00";
        return DriverManager.getConnection(url, user, password);
    }
}
