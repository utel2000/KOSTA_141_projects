package ex1;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
// Around Advice�� �����غ��� ���ؼ� aopAlliance���� �����ϴ� APi
public class MessageAdvice implements MethodInterceptor {
	// Around�� ��쿡��
		// ������ɻ���1 ----- Advice ���뿵��
		// �ٽɷ��� ���� ----- �޼��� ȣ��
		// ������ɻ���2 ----- Advice ���뿵��
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Ÿ�� ���� ���� ó���� ���� ! �� �� �� �� �� ��");		
		// �޼��� ȣ��: Around�� ��쿡�� �ٽ� �����Ͻ������� �޼��带 ȣ�� 
		Object rev = invocation.proceed();
		System.out.println("Ÿ�� ���� �� ó���� ���� ! �סססס�");
		return rev;
	}

}
