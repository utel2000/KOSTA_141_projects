package ex2;

public class Ex1_Method {

    // �⺻���� ����
    // 1) �⺻ �޼���
    public static void test1() {
        System.out.println("����(Hige)");
    }

    // 2) ���� ���� �ִ� �޼��� : �޼����̸�(����1, ����2..) => ���ڰ� ���� ���� ������ �ڵ�
    public static void test2(int num) {
        
        System.out.println(num);
    }
    // 3) ��ȯ ���� �ִ� �޼��� : ��ȯ ���� ȣ���� ������ �����ִ� ��
    // void �ڸ��� ��ȯ�� �ڷ��� ���
    // ������ ���� �� return���� ���� ��ȯ.
    public static String test3(int num) {
        test2(num);
        return "Result : " + num;
    }
    
    public static void main(String[] args) {
        int num = 100;
        String res = test3(num);
        System.out.println(res);
        test1();
    }
}
