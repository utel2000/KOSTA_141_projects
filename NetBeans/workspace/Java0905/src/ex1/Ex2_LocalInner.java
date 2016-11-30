package ex1;
public class Ex2_LocalInner {
    int a = 100; // �������
    // ���ó���Ŭ������ ���������� ���� �� �� ����. **(�߿�)**
    // ����� ���� �����ϴ�. **(�߿�)**
    // jdk 8���� �̻���ʹ� 'final'�� �Է����� �ʾƵ� �����.
    // �޼��尡 ���ÿ��� ���� �� �� ������ ���� ������ ������.
    public void innerTest(int k) { // k�� ���ú������� ���� Ŭ���� ������ ����� ��.
        int b = 200; // b�� ���ú������� ���� Ŭ���� ������ ����� ��.
        // ����� ���� Ŭ�������� ������ �ϴµ� ����ó�� ���� �ٲٷ��� �ؼ� getData()���� ���� �߻�.
        // b = 500; // �̷��� �ϸ� b�� ����ó�� ���� �����Ϸ� �ϹǷ� ������ ��.
        // ����� ���� Ŭ�������� ������ �ϴµ� ����ó�� ���� �ٲٷ��� �ؼ� getData()���� ���� �߻�.
        // k = 1000; // �̷��� �ϸ� k�� ����ó�� ���� �����Ϸ� �ϹǷ� ������ ��.
        class Inner { // ���ó���Ŭ����
            public void getData() {
                System.out.println("int a : " + a);
                System.out.println("int b : " + b);
                System.out.println("int k : " + k);
            }
        }
        Inner i = new Inner(); // ���ÿ������� �����ǰ� ����.
        i.getData();
    }
    public static void main(String[] args) {
        Ex2_LocalInner el = new Ex2_LocalInner();
        el.innerTest(1000);
    }
}
