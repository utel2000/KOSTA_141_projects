package ex2;

public class BizServiceImple implements BizService {
	@Override
	public void bizMethod1() {
		System.out.println("����!");
	}
	@Override
	public String second() {
		StringBuffer sb = new StringBuffer();
		sb.append("----------\n")
		.append("��浿\n")
		.append("----------\n");
		return sb.toString();
	}
}
