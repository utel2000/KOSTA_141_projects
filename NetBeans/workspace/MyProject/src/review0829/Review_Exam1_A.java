package review0829;

public class Review_Exam1_A {

    private int num1; // 멤버필드 선언

    public void test1() {
        // 클래스 내의 멤버필드를 출력
        System.out.println(num1);
    }

    public static void main(String[] args) {
        // num1 = 30 대입한 후에
        // test1()호출하면 30이 출력되도록 하고싶다.
        // 생성해서 사용해야 한다.
        Review_Exam1_A rea = new Review_Exam1_A(); // 생성 후
        rea.num1 = 30; // 객체로 값을 저장하고
        rea.test1(); // 호출해서 사용.
    }
}
