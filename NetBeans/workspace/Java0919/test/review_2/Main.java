package review_2;
public class Main {
    public static void main(String[] args) {
        Abstract_Class ac = new Abstract_Class() {
            @Override //클래스 생성 및 재정의
            public void print_msg() {
                System.out.println("우리는 C조입니다.");
            }
        };
        ac.print_msg();
    }
}
