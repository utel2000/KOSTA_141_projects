package ex1;

import org.aspectj.lang.ProceedingJoinPoint;

public class CheckAdvice {
	// Around Advice일 때는 ProccedingJoinPoin를 인자로 반드시 주입받아야 한다.
	// Interceptor의 기능을 포함한다.
	public void checkTime(ProceedingJoinPoint pjp) {
		long start = System.currentTimeMillis();
		// target 객체의 메서드를 호출
		try {
			// Around일 경우에만 핵심 비즈니스로직의 메서드를 호출.
			pjp.proceed();
		} catch (Throwable ex) {
			ex.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "초");
	}
}
