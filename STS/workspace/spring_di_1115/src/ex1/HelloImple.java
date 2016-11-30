package ex1;

public class HelloImple implements HelloInter{
	// 문자열을 저장할 수 있는 변수 선언
	private String message;
	// 스프링 컨테이너에 의해서 생성된 빈의 주소로 (인터페이스를 사용) 호출될 메서드를 정의
	@Override
	public void sayHello() {
		// log start
		StringBuffer log = new StringBuffer();
		log.append("----------\n")
		.append("<HelloImple> - public void sayHello()\n")
		.append("[Log] message: ").append(message);
		System.out.println(log);
		log.delete(0, log.length());
		// log end
	}
	// Spring에 의해서 message값을 주입
	public void setMessage(String message) {
		this.message = message;
	}
}
