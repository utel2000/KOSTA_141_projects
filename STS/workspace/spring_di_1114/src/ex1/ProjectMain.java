package ex1;
import java.util.Scanner;
public class ProjectMain {
	// Project ��ü���� Builder�迭�� ��ü�� �����ؼ�
	// �����ϴ� ���� �������ִ� ��ü (�ܺ� ������)
	public static void main(String[] args) {
		// ���1: ���� ������ ����� ���
		// ���2: CallByReference�� �̿��ؼ� �ּҸ� �Ѱܹ޾� ���� (get, set)
		// ���3: ���� ������ ����� Interface�� Ȱ���� '������' ����.	
		// [���3]
		Scanner sc = new Scanner(System.in);
		System.out.print("A/B/C: ");
		String choice = null;
		choice = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		Buildable builder = null;
		if(choice.equals("A") || choice.equals("a")){
			builder = new BuilderAType();
		}else if(choice.equals("B") || choice.equals("b")){
			builder = new BuilderBType();
		}else if(choice.equals("C") || choice.equals("c")){
			builder = new BuilderCType();
		}else{
			System.out.println("�ȹٷ� ����.");
		}
		if(builder != null) {
			Project pj = new Project(builder);
			sb.append("Message: ").append(pj.getBuilder().getMsg());
			System.out.println(sb);
		}
		
	}
}
