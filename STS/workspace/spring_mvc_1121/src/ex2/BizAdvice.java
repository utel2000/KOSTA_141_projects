package ex2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
// <aop:config> ��, ProxyFactoryBean ����
@Aspect
public class BizAdvice {
	@Before("execution(* ex2.BizServiceImple.*(..))")
	public void beforeMethod() {
		System.out.println("�ڡڡڡڡڡڡڡڡڡ�");
	}
	@AfterReturning(
			pointcut="execution(* ex2.BizServiceImple.second(..))",
			returning="ret")
	public void myReturnMethod(JoinPoint jp, Object ret) {
		String namev = jp.getSignature().getName();
		System.out.println("Name: " + namev);
		System.out.println("��ȯ��: ");
		System.out.println(ret);
	}
}
