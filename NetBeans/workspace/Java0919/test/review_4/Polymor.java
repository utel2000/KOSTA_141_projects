package review_4;
public class Polymor {
    // int�� ���� ���� �Ű������� �޴� a() �޼���
    public void a(int param1, int param2) { 
        System.out.println("int���� �޾� ���");
        System.out.println(param1+param2);
    }
    // String�� ���ڿ��� �Ű������� �޴� a() �޼���
    public void a(String param) { 
        System.out.println("String���� �޾� ���");
        System.out.println(param);
    }
    public static void main(String[] args) {
        Polymor poly = new Polymor();
        poly.a(10, 20); // �Ű����� Ÿ�Կ� ���� ������ �޼��尡 �ִٸ�
        poly.a("one");  // �ش� �޼��带 ȣ���Ѵ�. (�����ε�)
    }
}
