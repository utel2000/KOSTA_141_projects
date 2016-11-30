package ex1;
public class Ex3_AnonyInner {

    // Member 익명 내부클래스로 정의하기
    Ex3_TestInter ref = new Ex3_TestInter() {
        @Override
        public void printData() {
            System.out.println("테스트! 멤버입니다.");
        }
    };
// local 안에 작성해보기
    public void test() {
        new Ex3_TestInter() { // 이런 형식 적용! 연습 철저.
            public void printData() {
                System.out.println("테스트! 지역입니다.");
            }
        }.printData();
    }
    
    public static void main(String[] args) {
        Ex3_AnonyInner r = new Ex3_AnonyInner();
        r.ref.printData();
        r.test();
    }
}
