package service;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FactoryService {
	private static SqlSessionFactory factory;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("config/config.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
