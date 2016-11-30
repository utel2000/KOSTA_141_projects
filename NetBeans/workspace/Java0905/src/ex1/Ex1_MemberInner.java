package ex1;
import exam.Exam_SuperB;
public class Ex1_MemberInner {
    // 접근제한자에 대한 점검
    int a = 10;
    private int b = 200;
    static int c = 300;
    // 멤버영역
    class Inner extends Exam_SuperB { // 멤버내부클래스
        public void printData(){
            System.out.println("int a : " + a);
            // 내부클래스는 외부클래스의 private도 접근 가능.
            // (상속된 클래스조차도 못하던 것.)
            System.out.println("private int b : "+b);
        }
    }
    public static void main(String[] args) {
        // 외부 클래스를 먼저 생성하고
        // Ex1_MemberInner out = new Ex1_MemberInner();
        // 내부 클래스를 생성한다.
        // Ex1_MemberInner.Inner inner = out.new Inner();
        // inner.printData();
        // 외부 클래스 생성하지 않고 한 줄로 내부 클래스 생성 해보기
        Ex1_MemberInner.Inner inner = new Ex1_MemberInner().new Inner();
        inner.printData();
    }
}
