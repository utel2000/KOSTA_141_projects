package ex3;
import org.springframework.beans.factory.annotation.Required;
public class RequiredService implements Printable {
	private String name, msg;
	@Override
	public String printName() {
		return name + " : " + msg;
	}
	// @Required �� �ʼ� ������Ƽ�� üũ�ؼ�
	// ���� ��� BeanInitializationException�� �߻� ��Ų��. -- �˼���.
	@Required
	public void setName(String name) {
		this.name = name;
	}
	@Required
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
