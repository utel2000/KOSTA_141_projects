package ex1;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
public class MessageMain {
	public static void main(String[] args) {
		// 1. Target��ü�� ����
		MessageImple target  = new MessageImple();
		// 2. Advice ��ü�� ����
		MessageAdvice advice = new MessageAdvice();
		// 3. 1, 2�� ������Ű�� ���� ���� ��ü�� ����(ProxyFactoryBean)
		ProxyFactoryBean pBean = new ProxyFactoryBean();
		// 3-1. ProxyFactoryBean���� Ÿ��, Advice���� �˷��ֵ��� �Ѵ�.
		pBean.setTarget(target);
//		pBean.addAdvice(advice);
		// 3-2. PointCut�� Advice�� ������ Advisor ����.
		NameMatchMethodPointcut pointCut = new NameMatchMethodPointcut();
		pointCut.setMappedName("pri*");
		
		pBean.addAdvisor(new DefaultPointcutAdvisor(pointCut, advice));
		// ����Ͻ� ������ ����
		MessageInter prMessage = (MessageInter) pBean.getObject();
		prMessage.print();
		prMessage.print2();
		System.out.println(prMessage.message());
	}
}
