package ex1;
// �ٽ�����Ʈ: AOP�� ������ �����ϱ� ���ؼ�
// print �迭 �޼��常 Advice�� ������Ѻ��� ����
public class MessageImple implements MessageInter {
	private String message;
	public MessageImple() {
		message="������ AOP�� �̷��Ŵ� �� �� �غ��� ��!";
	}
	@Override
	public void print() {
		// ���ڹ� �� ��) ��� ��ü�� �����ϰ� �޼��带 ȣ��
		System.out.println("Print �޼��尡 ȣ��!");
	}
	@Override
	public void print2() {
		// ���ڹ� �� ��) ��� ��ü�� �����ϰ� �޼��带 ȣ��
		System.out.println("Print2 �޼��尡 ȣ��!");
	}
	@Override
	public String message() {
		return "�ݡݡݡݡݡ�" + message;
	}
	
}
