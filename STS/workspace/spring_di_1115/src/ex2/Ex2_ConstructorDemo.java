package ex2;
// ������ �ٽ� ����Ʈ: ������ ���Թ�Ŀ����� ����, �������� ���ؼ� ���� ���Ե� ����
// String�� �⺻ ���̴�.
public class Ex2_ConstructorDemo implements Ex2_ConstructorDemoInter {
	private String msg;
	private int number;
	public Ex2_ConstructorDemo(String msg) {
		System.out.println("1�� �����ڴ�.");
		this.msg = msg;
	}
	// xml���� type�� �����ؾ� ������ �� �ִ�.
	public Ex2_ConstructorDemo(int number) {
		System.out.println("2�� �����ڴ�.");
		this.number = number;
	}
	public Ex2_ConstructorDemo(String msg, int number) {
		System.out.println("3�� �����ڴ�.");
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
