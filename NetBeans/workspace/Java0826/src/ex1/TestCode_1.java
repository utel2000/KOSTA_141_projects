package ex1;

public class TestCode_1 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // StringBufferŬ������ �����Ͽ� Buffer������ ���ڿ��� �����Ͽ�(append())
        // ���� �Ѵ�.
        // TestCode�� �������� ������� �ʴ� ��Ʈ�� ��ü��
        // û�� �߾�����, ���⼭�� ���ǵǴ� ��Ʈ�� ��ü�� �ּҰ�
        // ���� ������ �������� �δ��� �پ���. *****
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            str.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("�ð� : " + (end - start));
    }
}
