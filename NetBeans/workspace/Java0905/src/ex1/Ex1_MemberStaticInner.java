package ex1;
public class Ex1_MemberStaticInner {
    int a = 10;
    private int b = 100;
    static int c = 200;
    static class Inner {
        // ��¿ �� ���� ���� Ŭ���� �ȿ��� static �ڿ��� ���� �Ϸ��� �� ��
        static int d = 1000;
        public void printData() {
            // a�� b�� ��¿��� ������ ���� ����, static�� ���� ����
            // ���� ���� �����Ǿ� static������ ���� ������
            // ���� ������ static �������� static Ŭ�������� ����� �� �ִ� �Ͱ� �޸�
            // class���� �ʰ� �����Ǿ� �ܺ� Ŭ������ �����ؾ߸� ����� �� �ִ�. 
            // System.out.println("int a : "+a); // ����
            // System.out.println("private int b : "+b); // ����
            System.out.println("static int c : " + c); 
            System.out.println("static int d : " + d);
        }
    }
}
