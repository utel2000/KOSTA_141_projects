package ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex1_Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex2/resource.xml");
		Printable pAble = ctx.getBean("res", Printable.class);
		System.out.println(pAble.printName());
	}
}
