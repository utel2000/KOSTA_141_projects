package review0829;

public class Review_Exam1_A {

    private int num1; // ����ʵ� ����

    public void test1() {
        // Ŭ���� ���� ����ʵ带 ���
        System.out.println(num1);
    }

    public static void main(String[] args) {
        // num1 = 30 ������ �Ŀ�
        // test1()ȣ���ϸ� 30�� ��µǵ��� �ϰ�ʹ�.
        // �����ؼ� ����ؾ� �Ѵ�.
        Review_Exam1_A rea = new Review_Exam1_A(); // ���� ��
        rea.num1 = 30; // ��ü�� ���� �����ϰ�
        rea.test1(); // ȣ���ؼ� ���.
    }
}
