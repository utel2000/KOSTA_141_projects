package ex2;

public interface Ex1_InterA {
    int NUM = 100; // ���
    public void myAMethod(); // �߻�޼���
    // default�޼��� : ���� Ŭ�����鿡�� ������ �⺻ �޼���(����,å�� x)
    // ���� Ŭ�������� ������(�������̵�)�ؼ� ����� �� �ְ�,
    // �׳� ȣ���ؼ� ����� ���� �ִ�.
    default public String aResource(){
        return "A ������ ���ҽ�!";
    }
}
