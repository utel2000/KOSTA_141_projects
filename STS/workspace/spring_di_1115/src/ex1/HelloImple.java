package ex1;

public class HelloImple implements HelloInter{
	// ���ڿ��� ������ �� �ִ� ���� ����
	private String message;
	// ������ �����̳ʿ� ���ؼ� ������ ���� �ּҷ� (�������̽��� ���) ȣ��� �޼��带 ����
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
	// Spring�� ���ؼ� message���� ����
	public void setMessage(String message) {
		this.message = message;
	}
}
