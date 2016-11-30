package ex3;

public class Ex1_MethodOverloading {
    // Method Overloading �ϳ��� Ŭ���� ������ ���� �̸��� ������ �޼��尡
    // ������ ���� �Ǿ� �ִ� ���� ���Ѵ�.
    // �ϰ����ִ� �۾��̱� ������ ���α׷��� �ŷڼ��� ���δ�.
    // �Ű������� Ÿ��, ����, ���� 3���� ��� �����ε��� ��Ģ.
    public void getLength(int a) {
        String s = String.valueOf(a);
        System.out.println("�Է��� ���� �� : " + s.length());
    }
    public void getLength(float f) {
        String s = String.valueOf(f);
        System.out.println("�Է��� ���� �� : " + s.length());
    }
    public void getLength(char[] c) {
        String s = String.valueOf(c);
        System.out.println("�Է��� ���� �� : " + s.length());
    }
    public void getLength(int a, float f) {
        String s = String.valueOf(a);
        System.out.println("�Է��� ���� �� : " + s.length());
    }
    public void getLength(float f, int a) {
        String s = String.valueOf(a);
        System.out.println("�Է��� ���� �� : " + s.length());
    }
    public static void main(String[] args) {
        Ex1_MethodOverloading em = new Ex1_MethodOverloading();
        em.getLength(1);
        em.getLength(3.14f);
        em.getLength('��');
        em.getLength(1, 3.14f);
        em.getLength(3.14f, 1);
    }
}
