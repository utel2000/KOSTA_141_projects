package ex2;
public class Ex1_NullPoint {
    public void test() {
        System.out.println("Test");
    }
    public static void main(String[] args) {
        Ex1_NullPoint en = null;
        try {
            en.test(); // ���ܰ� �߻��ϴ� ����. RuntimeException.
        } catch (Exception e) {
            // catch�� ����.
            System.out.println("��ü�� �����Ǿ�� �Ѵ�.");
            // Exception���� ���� �޼��� ���
            e.printStackTrace();
        }
    }
}
