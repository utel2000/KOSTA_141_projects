package ex3;
public class Ex3_Static {
    static int num = 10;
    public void print() {
        System.out.println(num);
    }
    public static void test1(Ex3_Static ref){
        System.out.println("��� ���1 : ");
        ref.print(); // CallByReference�� �ּҸ� �ȹ����� �ּҸ� ���� ��������.
    }
    public static void test2(){
        Ex3_Static ref = new Ex3_Static();
        System.out.println("��� ���2 : ");
        ref.print();
    }
    public static void main(String[] args) {
        Ex3_Static ref = new Ex3_Static();
        ref.test1(ref); // CallByReference
        Ex3_Static.test2();
    }
}
