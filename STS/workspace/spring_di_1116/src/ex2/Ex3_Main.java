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
			System.out.print("[�Է�]: ");
			msg = sc.nextLine();
			response = props.getProperty(msg);
			switch(msg) {
				case "q":
					System.out.println("[System] �����մϴ�.");
					System.exit(0);
					break exit;
				default:
					if(response == null){
						System.out.println("[�亯]: ó�� ��� ���̶� ���� ����ؾ� ���� �𸣰ھ��. �Ф�");
					}else {
						System.out.println("[�亯]: " + response);
						System.out.println("----------");
					}
			}
		}
	}
}
