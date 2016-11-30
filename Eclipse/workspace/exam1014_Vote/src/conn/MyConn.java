package conn;


import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MyConn {
	private static DataSource ds;
	static{
		//context.xml���� Resource�� �о�ͼ� DataSource��ü�� ���� ����
		//��ü ����(JNDI�� ����ؼ� name="jdbc/myora" ���� ã�Ƽ�
		//DataSource��ü�� �����ϴ� ���� ����
		try {
			//�۵�����
			//1.InitialContext ��ü�����Ǹ鼭
			//2.JNDI java:comp/env�� �������� Context.xml�� jdbc/myora
			//�˻��Ͽ� DataSource�� ��ȯ �޴´�.
			InitialContext itx = new InitialContext();
			ds = (DataSource) itx.lookup("java:comp/env/jdbc/myora");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConn() throws SQLException{
		// 3. ��ȯ ���� �����ͼҽ��κ��� Connection�� ȹ���Ͽ� ��ȯ�Ѵ�.
		return ds.getConnection();
	}
}
