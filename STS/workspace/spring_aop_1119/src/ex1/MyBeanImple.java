package ex1;

import org.springframework.beans.factory.annotation.Autowired;
// �ֿ� ����Ʈ: ���� �ð��� �ڹ� ��ü�� ProxyFactoryBean�� ���踦 �������� DI�� ����.
// ��������!
public class MyBeanImple implements MyBeanInter{
	@Autowired
	private String msg;
	@Override
	public String myGetMessage(String name) {
		StringBuffer sb = new StringBuffer();
		sb.append("Message: ").append(msg)
		.append(" �ٽɷ��� ����!");
		return sb.toString();
	}

}
