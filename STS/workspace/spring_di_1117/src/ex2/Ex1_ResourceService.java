package ex2;
import javax.annotation.Resource;
public class Ex1_ResourceService implements Printable {
	// @Resource�� �ڹ� Ȯ�� API���� �����ϴ� �ڵ� �� ����.
	// byType�� ��� ���� Ÿ���� �� name���� �ĺ�.
	@Resource
	private String msg;
	@Override
	public String printName() {
		return msg + "�Դϴ�.";
	}
}
