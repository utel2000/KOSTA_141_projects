package ex1;
// 핵심포인트: AOP의 원리를 이해하기 위해서
// print 계열 메서드만 Advice를 적용시켜보는 예제
public class MessageImple implements MessageInter {
	private String message;
	public MessageImple() {
		message="오늘은 AOP란 이런거다 한 번 해보는 날!";
	}
	@Override
	public void print() {
		// 지뢰밭 의 예) 요기 객체를 생성하고 메서드를 호출
		System.out.println("Print 메서드가 호출!");
	}
	@Override
	public void print2() {
		// 지뢰밭 의 예) 요기 객체를 생성하고 메서드를 호출
		System.out.println("Print2 메서드가 호출!");
	}
	@Override
	public String message() {
		return "◎◎◎◎◎◎" + message;
	}
	
}
