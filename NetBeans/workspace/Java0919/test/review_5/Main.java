package review_5;
public class Main {
    public static void main(String[] args) {
        Parent pp = new Parent();
        Child c = new Child();
        Parent pc = new Child();
        
        pp.printParent();
        c.printParent();  // ������ �� �޼��� ȣ��.
        pc.printParent(); // ������ �� �޼��� ȣ��.
    }                     // �θ� Ŭ������ ���� ����.
}
