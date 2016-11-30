package ex1;

import org.aspectj.lang.JoinPoint;

public class NameReturnAdvice {
	// �ݵ�� ��ȯ���� �̸�(ret)�� ����ؾ� �մϴ�.
	// JointPoint jp�� ���� ����.
	public void myReturnMethod(JoinPoint jp, Object ret) {
		// JoinPoint�� Advice�� ����� �޼���
		// getSignature()�� �޼����� ������ �����´�.
		String namev = jp.getSignature().getName();
		System.out.println("Name: " + namev);
		System.out.println("��ȯ��: ");
		System.out.println(ret);
	}
}
