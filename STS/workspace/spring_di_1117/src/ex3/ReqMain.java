package ex3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class ReqMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex3/requiredService.xml");
		Printable pAble = ctx.getBean("req1", Printable.class);
		System.out.println(pAble.printName());
	}
}
