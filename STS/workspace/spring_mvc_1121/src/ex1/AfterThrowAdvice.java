package ex1;

public class AfterThrowAdvice {
	//JoinPoint jp Ÿ�ٰ�ü�� ������ ��������� ���
	//������ ����.
	public void commThrow(Exception ew){
		System.out.println("���ܸ޼��� : "+ew.getMessage());
	}
}
