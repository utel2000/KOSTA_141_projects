package ex1;

public class Ex1_Sub extends Ex1_Super {
    // Alt + Insert => �������̵� ����
    // ��Ӱ��迡�� �θ��� �޼��带 ������ �ߴ�.(��ũ)
    @Override // ���� ������ �ּ��̸鼭 JVM�� �о���δ�.
    public void message() { // Ŀ�� �ø��� Ctrl + Shift + P �ϸ� ��ũ�� ������ �̵�.
        System.out.println("!�ڡ١١١�!");
    }
    public void subM() {
        System.out.println("�θ� �����ؼ� �����Ǹ�"
                + " �� �޼���� ȣ�� �� �� ����!");
    }
}
