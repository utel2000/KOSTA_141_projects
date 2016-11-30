package ex2;
import javax.annotation.Resource;
public class Ex1_ResourceService implements Printable {
	// @Resource는 자바 확장 API에서 제공하는 자동 빈 묶기.
	// byType일 경우 같은 타입일 때 name으로 식별.
	@Resource
	private String msg;
	@Override
	public String printName() {
		return msg + "입니다.";
	}
}
