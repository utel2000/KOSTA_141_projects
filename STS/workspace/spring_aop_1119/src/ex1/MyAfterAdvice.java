package ex1;
import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
public class MyAfterAdvice implements AfterReturningAdvice {
	// Ÿ�ٸ޼��尡 ���� �� �� �Ŀ� ����
	/*
		Log--------------
		�޼����� �̸�: myGetMessage
		����Ÿ��: class java.lang.String
		Target�� �ּ�: ex1.MyBeanImple
		Id: ��浿
		End--------------
		Message: test �ٽ� ���� ����!
		�ססססססססססססססססססססססססססססס�
	 */
	@Override
	public void afterReturning(Object arg0, Method method, Object[] id, Object target) throws Throwable {
		System.out.println("�ססססססססססססססססססססססססססססס�");
	}
}
