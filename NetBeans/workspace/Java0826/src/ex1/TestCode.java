package ex1;

public class TestCode {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = null;
        for (int i = 0; i < 100000; i++) {
            str += i + ""; // ���� �ڵ� : ���������� ������ ���� ��Ŵ.
        }
        long end = System.currentTimeMillis();
        System.out.println("�ð� : " + (end - start));
    }
}
