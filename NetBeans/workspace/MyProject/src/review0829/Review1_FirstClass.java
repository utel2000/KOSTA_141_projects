package review0829;

public class Review1_FirstClass {
    // ��� �ʵ�, ��� ����, �Ӽ� => �ƴ� ��
    String msg; // �ʱⰪ null
    int num; // �ʱⰪ 0
    //-----------------------------------------
    // ��� �޼���, ���� => �ϴ� ��, ��������, �����Ͻ� ���� ����
    // �޼��� �ȿ� ������ String m, int n�� ���������� ����.
    public void printMessage(String m, int n) {
        msg = m;
        num = n; 
        System.out.println("msg : " + msg);
        System.out.println("num : " + num);
    }
    //-------------------------------------------
    //main�޼��带 �ۼ��� ��� (���� å���� ��Ģ�� ����)
    public static void main(String[] args) {
        // ���� Review1_FirstClass�� Heap�� �÷�����
        // �����ؼ� ����ϱ� ���ؼ� new �����ڷ� ����.
        // 1. ���ÿ� ���������� ����.
        Review1_FirstClass ef = null;
        // 2. ������ ���� ������ new�����ڷ� ������ ��ü�� �ּҸ� ����.
        ef = new Review1_FirstClass();
        // 3. ���������� ���ؼ� �ش� �ڿ�(�������, �޼���)�� ���.
        // ������ ��ü�� �ڿ� �߿� ��� �ʵ带 �����ϴ� �� (ĸ��ȭ ����)
        // ���� ������ �������� ���.
        System.out.println("msg ���ڿ��� ���� ��������� : " + ef.msg);
        // �޼��带 ����غ���. printMessage()�� ȣ���ؼ� ��� ���.
        ef.printMessage("ȣ��¥", 20);
    }
}
