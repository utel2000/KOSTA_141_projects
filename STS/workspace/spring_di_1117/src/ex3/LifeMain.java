package ex3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class LifeMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex3/life.xml");
		LifeInter li = ctx.getBean("life1", LifeInter.class);
		li.execute();
	}
}
