package ex2;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class Ex2_Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex2/ex2_map.xml");
		Ex2_Map ex2Map = ctx.getBean("mapSub", Ex2_Map.class);
		Map<String, Integer> map = ex2Map.getMap();
		service.LogFactory.getLogFactory().getLogHeader("Ex2_Main.java", "main()");
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			service.LogFactory.getLogFactory().getLog("e(키)", e.getKey());
			service.LogFactory.getLogFactory().getLog("e(값)", e.getValue());
		}
		System.out.println("--------------");
		for(String e : map.keySet()) {
			service.LogFactory.getLogFactory().getLog("e(키)", e);
		}
		for(Integer e : map.values()) {
			service.LogFactory.getLogFactory().getLog("e(값)", e);
		}
	}
}
