package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex1_Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/autoWired.xml");
		Printable pAble = ctx.getBean("autoBean", Printable.class);
		System.out.println(pAble.printName());
		System.out.println(pAble.printName1());
		System.out.println(pAble.printNamed());
	}
}
