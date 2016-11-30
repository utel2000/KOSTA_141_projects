package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DaoMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex1_aop.xml");
		DaoInter dao = ctx.getBean("dao", DaoInter.class);
		dao.first();
		System.out.println("M: " + dao.second());
		dao.third();
	}
}
