package ex3;
public class Ex1_Static {
    // static�� ��� ��ü���� ������ �� ������,
    // ��������(new)���� �ٷ� ���� ������ �ڿ���...
    // �ٽ�����Ʈ�� static�ʱ�ȭ�� ���� �޼��庸�� ���� ȣ���� �ȴ�.
    // ��) JDBC Driver Loading (���񽺰� �� ���� �ε�)
    static { // ����ƽ �ʱ�ȭ ��
        System.out.println("�ʱ�ȭ !"); // 1
    }
    public static void main(String[] args) {
        System.out.println("���� �޼��� ȣ��!"); // 2
    }
}
