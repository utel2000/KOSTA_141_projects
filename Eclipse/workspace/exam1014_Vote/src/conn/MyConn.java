package conn;


import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MyConn {
	private static DataSource ds;
	static{
		//context.xml에서 Resource를 읽어와서 DataSource객체를 얻어내기 위한
		//객체 생성(JNDI를 사용해서 name="jdbc/myora" 값을 찾아서
		//DataSource객체를 생성하는 것이 목적
		try {
			//작동순서
			//1.InitialContext 객체생성되면서
			//2.JNDI java:comp/env의 형식으로 Context.xml에 jdbc/myora
			//검색하여 DataSource를 반환 받는다.
			InitialContext itx = new InitialContext();
			ds = (DataSource) itx.lookup("java:comp/env/jdbc/myora");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConn() throws SQLException{
		// 3. 반환 받은 데이터소스로부터 Connection을 획득하여 반환한다.
		return ds.getConnection();
	}
}
