package ex1;

public class AfterThrowAdvice {
	//JoinPoint jp 타겟객체의 정보를 갖고오려면 사용
	//지금은 생략.
	public void commThrow(Exception ew){
		System.out.println("예외메세지 : "+ew.getMessage());
	}
}
