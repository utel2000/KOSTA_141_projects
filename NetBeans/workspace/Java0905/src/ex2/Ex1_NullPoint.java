package ex2;
public class Ex1_NullPoint {
    public void test() {
        System.out.println("Test");
    }
    public static void main(String[] args) {
        Ex1_NullPoint en = null;
        try {
            en.test(); // 예외가 발생하는 문장. RuntimeException.
        } catch (Exception e) {
            // catch로 간다.
            System.out.println("객체는 생성되어야 한다.");
            // Exception에서 예외 메세지 출력
            e.printStackTrace();
        }
    }
}
