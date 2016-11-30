package ex1;

import org.aspectj.lang.ProceedingJoinPoint;

public class CheckAdvice {
	// Around Advice�� ���� ProccedingJoinPoin�� ���ڷ� �ݵ�� ���Թ޾ƾ� �Ѵ�.
	// Interceptor�� ����� �����Ѵ�.
	public void checkTime(ProceedingJoinPoint pjp) {
		long start = System.currentTimeMillis();
		// target ��ü�� �޼��带 ȣ��
		try {
			// Around�� ��쿡�� �ٽ� ����Ͻ������� �޼��带 ȣ��.
			pjp.proceed();
		} catch (Throwable ex) {
			ex.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "��");
	}
}
