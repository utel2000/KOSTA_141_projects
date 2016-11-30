package ex1;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
public class MessageMain {
	public static void main(String[] args) {
		// 1. Target객체를 생성
		MessageImple target  = new MessageImple();
		// 2. Advice 객체를 생성
		MessageAdvice advice = new MessageAdvice();
		// 3. 1, 2를 위빙시키기 위한 관리 객체를 생성(ProxyFactoryBean)
		ProxyFactoryBean pBean = new ProxyFactoryBean();
		// 3-1. ProxyFactoryBean에게 타겟, Advice들을 알려주도록 한다.
		pBean.setTarget(target);
//		pBean.addAdvice(advice);
		// 3-2. PointCut과 Advice를 결합한 Advisor 생성.
		NameMatchMethodPointcut pointCut = new NameMatchMethodPointcut();
		pointCut.setMappedName("pri*");
		
		pBean.addAdvisor(new DefaultPointcutAdvisor(pointCut, advice));
		// 비즈니스 로직을 설정
		MessageInter prMessage = (MessageInter) pBean.getObject();
		prMessage.print();
		prMessage.print2();
		System.out.println(prMessage.message());
	}
}
