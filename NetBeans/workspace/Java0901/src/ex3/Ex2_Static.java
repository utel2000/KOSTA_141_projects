package ex3;
public class Ex2_Static {
    static int a; int b;
    public Ex2_Static(){
        a++; b++;
    }
    public static void main(String[] args) {
        Ex2_Static ref1 = new Ex2_Static();
        Ex2_Static ref2 = new Ex2_Static();
        System.out.println("Ref1_a : "+ref1.a); // R : 2 
        System.out.println("Ref1_b : "+ref1.b); // R : 1
        System.out.println("Ref2_a : "+ref2.a); // R : 2
        System.out.println("Ref2_b : "+ref2.b); // R : 1
        // static�� ǥ���� ���� Class.static�ڿ����� ����� ��.
        // static�� ����ؼ� �ܺ� Ŭ�������� ������ �� ���.
        System.out.println("Ex2_Static"+Ex2_Static.a);
        // �̷��� �ص� ���� �ʳ���? => ������ ��.
        // ������ �и��Ǿ� ������ ����� �� ����.        
        System.out.println("�̰��� �� �ǳ���?"+a);
    }
}
