package ex3;
import org.springframework.beans.factory.annotation.Required;
public class RequiredService implements Printable {
	private String name, msg;
	@Override
	public String printName() {
		return name + " : " + msg;
	}
	// @Required 은 필수 프로퍼티를 체크해서
	// 없을 경우 BeanInitializationException을 발생 시킨다. -- 검수용.
	@Required
	public void setName(String name) {
		this.name = name;
	}
	@Required
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
