package ex1;
public class Ex1_Main {
    public static void main(String[] args) {
        // �������̵��� ��� �� ���� ����� ������ ȣ�� ���´� ������ �ٸ�.
        // �� �� ��� ����
        // �������̵����� ���ǵ� �θ��� �޼���� ȣ��� �� ����.(����ȭ)
        
        // �θ� �����ؼ� �ڽ��� ������ ���
        Ex1_Super ref = new Ex1_Sub();
        ref.message(); // �����Ƿ� ��ũ�� �ڽ� �޼��尡 �����.
        // �ڽ��� �����ؼ� �ڽ��� ������ ���
        Ex1_Sub ref1 = new Ex1_Sub();
        ref1.message();
    }
}
