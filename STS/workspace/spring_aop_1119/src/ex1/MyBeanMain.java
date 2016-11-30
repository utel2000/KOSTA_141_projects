package ex1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class MyBeanMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/myBean.xml");
		MyBeanInter mi = ctx.getBean("pfBean", MyBeanInter.class);
		System.out.println(mi.myGetMessage("¿Œº±¿Ã"));
		return;
	}
}
