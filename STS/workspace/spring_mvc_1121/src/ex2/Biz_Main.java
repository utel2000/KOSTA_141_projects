package ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Biz_Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex2/ex2_anno.xml");
		BizService dao = ctx.getBean("target", BizService.class);
		dao.bizMethod1();
	}
}
