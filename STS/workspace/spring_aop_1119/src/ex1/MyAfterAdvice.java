package ex1;
import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
public class MyAfterAdvice implements AfterReturningAdvice {
	// 타겟메서드가 실행 된 이 후에 적용
	/*
		Log--------------
		메서드의 이름: myGetMessage
		리턴타입: class java.lang.String
		Target의 주소: ex1.MyBeanImple
		Id: 김길동
		End--------------
		Message: test 핵심 로직 수행!
		§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
	 */
	@Override
	public void afterReturning(Object arg0, Method method, Object[] id, Object target) throws Throwable {
		System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
	}
}
