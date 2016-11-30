package ex2;

public class BizServiceImple implements BizService {
	@Override
	public void bizMethod1() {
		System.out.println("¼öÇà!");
	}
	@Override
	public String second() {
		StringBuffer sb = new StringBuffer();
		sb.append("----------\n")
		.append("±è±æµ¿\n")
		.append("----------\n");
		return sb.toString();
	}
}
