package ex2;

public interface Ex1_InterB {
    int NUM2 = 200; // ���
    public void myBMethod(); // �߻�޼���
    // ���� Ŭ�����鿡�� ������ �⺻ �޼���
    // ���� Ŭ�������� �������ؼ� ����� �� �ְ�, �׳� ȣ���ؼ� ����� �� �ִ�.
    default public String bResource(){
        return "B ������ ���ҽ�!";
    }
}
