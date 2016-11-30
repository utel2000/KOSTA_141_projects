package ex1;
import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;
public class MyBeanBeforeAdvice implements MethodBeforeAdvice  {
	@Override
	public void before(Method method, Object[] id, Object target) throws Throwable {
		System.out.println("Log--------------------");
		System.out.println("�޼����� �̸�: " + method.getName());
		System.out.println("����Ÿ��: " + method.getReturnType());
		System.out.println("Target�� �ּ�: " + target.getClass().getName());
		String idv = (String) id[0];
		System.out.println("ID: " + idv);
		System.out.println("----------------------end");
	}
	
}
