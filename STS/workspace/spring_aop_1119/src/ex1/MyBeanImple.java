package ex1;

import org.springframework.beans.factory.annotation.Autowired;
// 주요 포인트: 지난 시간의 자바 객체의 ProxyFactoryBean의 관계를 스프링의 DI로 변경.
// 개념위주!
public class MyBeanImple implements MyBeanInter{
	@Autowired
	private String msg;
	@Override
	public String myGetMessage(String name) {
		StringBuffer sb = new StringBuffer();
		sb.append("Message: ").append(msg)
		.append(" 핵심로직 수행!");
		return sb.toString();
	}

}
