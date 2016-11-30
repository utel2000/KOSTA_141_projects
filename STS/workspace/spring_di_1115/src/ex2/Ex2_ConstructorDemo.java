package ex2;
// 예제의 핵심 포인트: 생성자 주입방식에서의 차이, 스프링에 의해서 값이 주입될 때는
// String이 기본 값이다.
public class Ex2_ConstructorDemo implements Ex2_ConstructorDemoInter {
	private String msg;
	private int number;
	public Ex2_ConstructorDemo(String msg) {
		System.out.println("1번 생성자다.");
		this.msg = msg;
	}
	// xml에서 type을 지정해야 구별할 수 있다.
	public Ex2_ConstructorDemo(int number) {
		System.out.println("2번 생성자다.");
		this.number = number;
	}
	public Ex2_ConstructorDemo(String msg, int number) {
		System.out.println("3번 생성자다.");
		this.msg = msg;
		this.number = number;
	}
	@Override
	public void printNumber() {
		number *= 2;
		System.out.println("number: " + number);
	}
	@Override
	public void printString() {
		System.out.println("msg: " + msg);
	}
	@Override
	public String printNum_String() {
		StringBuffer sb = new StringBuffer();
		sb.append("msg: ").append(msg).append("<br />")
		.append("number: ").append(number).append("<br />");
		return sb.toString();
	}
}
