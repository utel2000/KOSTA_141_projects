package ex1;
import java.util.Scanner;
public class ProjectMain {
	// Project 객체에게 Builder계열의 객체를 생성해서
	// 전달하는 것을 조립해주는 객체 (외부 조립기)
	public static void main(String[] args) {
		// 방법1: 가장 안좋은 방법인 상속
		// 방법2: CallByReference를 이용해서 주소를 넘겨받아 접근 (get, set)
		// 방법3: 가장 발전된 방법인 Interface를 활용한 '다형성' 구현.	
		// [방법3]
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
			System.out.println("똑바로 적어.");
		}
		if(builder != null) {
			Project pj = new Project(builder);
			sb.append("Message: ").append(pj.getBuilder().getMsg());
			System.out.println(sb);
		}
		
	}
}
