package ex2;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex1_Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex2/ex1_List.xml");
		Ex1_List ex1List = ctx.getBean("list1", Ex1_List.class);
		List<String> list = ex1List.getItems();
		service.LogFactory.getLogFactory().getLogHeader("Ex1_Main", "main()");
		for(String e : list) {
			service.LogFactory.getLogFactory().getLog("e", e);
		}
		Ex1_List ex1List2 = ctx.getBean("list2", Ex1_List.class);
		List<Float> list2 = ex1List2.getItems2();
		for(Float e : list2) {
			service.LogFactory.getLogFactory().getLog("e", e);
		}
	}
}
