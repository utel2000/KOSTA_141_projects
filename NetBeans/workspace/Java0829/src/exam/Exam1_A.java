package exam;

public class Exam1_A {
    private int num1; // ����ʵ� ����
    public void test1(){
    // Ŭ���� ���� ����ʵ带 ���
        System.out.println(num1);
    }
    public static void main(String[] args) {
        // num1 = 30 ������ �Ŀ�
        // test1()ȣ���ϸ� 30�� ��µǵ��� �ϰ�ʹ�.
        // �����ؼ� ����ؾ� �Ѵ�.
        Exam1_A rf = new Exam1_A(); // ���� ��
        rf.num1 = 30; // ��ü�� ���� �����ϰ�
        rf.test1(); // ȣ���ؼ� ���.
    }
}

