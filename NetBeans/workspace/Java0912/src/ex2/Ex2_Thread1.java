package ex2;

public class Ex2_Thread1 {
    // Ex1_Thread2.java�� ����� MyData.java�� Ŭ������ ����ؼ�
    // �Ʒ��� ������ ���ü����� �����ϵ��� MyData�� �ٸ� ���������
    // ������ �� �ֵ��� ���� �غ�����. (���ü����� ����)
    public static void main(String[] args) {
        Ex2_MyThread1 t1 = new Ex2_MyThread1();
        Ex2_MyThread1 t2 = new Ex2_MyThread1();
        t1.start();
        t2.start();
    }
}
