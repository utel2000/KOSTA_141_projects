package ex4;
// Ex1_Super�� Ȯ���� �ڽ�Ŭ����.
// �θ�Ŭ������ �ڽ�Ŭ������ �����ϴܰ迡�� extends��� Ű����� ��������.(*�߿�)
public class Ex1_Child extends Ex1_Super{
    private String msg;
    private int number1;
    int number2=20;
    public void childMethod(){
        parentMethod(); // �θ��� �޼��尡 �ڽ��� ���� �Ǿ���.
        System.out.println("�θ��� �ڿ� : "+num2);
    }
    public static void main(String[] args) {
        Ex1_Child ec = new Ex1_Child();
        ec.childMethod();
        ec.parentMethod(); // �ڽ��� ���۷����� �θ��� �ڿ��� ȣ��.
    }
}
