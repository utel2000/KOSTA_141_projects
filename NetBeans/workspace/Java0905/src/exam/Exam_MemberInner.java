package exam;
public class Exam_MemberInner extends Exam_SuperA { // 상속1
    int a = 10;
    private int b = 200;
    static int c = 300;
    class Inner extends Exam_SuperB { // 상속2
        public void printData() {
            System.out.println("int a : " + a);
            System.out.println("private int b : " + b);
            System.out.println("static int c : " + c);
            testA();
            testB();
        }
    }
}
