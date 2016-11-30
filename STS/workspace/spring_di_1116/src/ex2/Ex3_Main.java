package ex2;
import java.util.Properties;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class Ex3_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext ctx = new GenericXmlApplicationContext("ex2/ex3_Properties.xml");
		Ex3_Properties ep = ctx.getBean("propSub", Ex3_Properties.class);
		Properties props = ep.getProp();
		String msg = "";
		String response = "";
		exit:
		while(true) {
			System.out.print("[입력]: ");
			msg = sc.nextLine();
			response = props.getProperty(msg);
			switch(msg) {
				case "q":
					System.out.println("[System] 종료합니다.");
					System.exit(0);
					break exit;
				default:
					if(response == null){
						System.out.println("[답변]: 처음 듣는 말이라 뭐라 대답해야 할지 모르겠어요. ㅠㅠ");
					}else {
						System.out.println("[답변]: " + response);
						System.out.println("----------");
					}
			}
		}
	}
}
