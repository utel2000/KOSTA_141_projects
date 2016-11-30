package ex3;
public class Ex3_Static {
    static int num = 10;
    public void print() {
        System.out.println(num);
    }
    public static void test1(Ex3_Static ref){
        System.out.println("출력 결과1 : ");
        ref.print(); // CallByReference로 주소를 안받으면 주소를 몰라서 오류난다.
    }
    public static void test2(){
        Ex3_Static ref = new Ex3_Static();
        System.out.println("출력 결과2 : ");
        ref.print();
    }
    public static void main(String[] args) {
        Ex3_Static ref = new Ex3_Static();
        ref.test1(ref); // CallByReference
        Ex3_Static.test2();
    }
}
