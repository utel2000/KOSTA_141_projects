package ex2;
public class Ex2_Main {
    public static void main(String[] args) {
        // �����带 ���� ����
        Ex2_Th1 ref1 = new Ex2_Th1(); // ��ӹ��� ��
        Ex2_Th2 ref2 = new Ex2_Th2(); // �������̽� ������ ��
        ref1.start();
        // ref2�� Runnable �������̽��� ������ Ŭ������ ���
        // start()�޼��带 ����ϱ� ���ؼ�
        // Runnable�� ������ Ŭ������ �ּҸ� ���ڷ�
        // �־ Thread�� �����ؼ� ���!
        Thread t = new Thread(ref2);
        t.start();
        // ���� �޼��尡 ������ �ݺ���
        for(int i=0; i<50; i++){
            System.out.print("-");
        }
    }
}
