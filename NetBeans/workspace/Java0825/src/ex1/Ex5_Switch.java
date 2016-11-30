package ex1;

public class Ex5_Switch {

    // if문 보다는 가독성이 우수하다.
    public static void main(String[] args) {
        int num = 10;
        switch (num) {
            case 10:
                System.out.println("10이니까 실행.");
                break; // break가 없으면 아래의 다른 조건의 실행문까지 실행.
                       // 이 경우 break를 만나거나 마지막 줄까지 실행.
            case 20:
                System.out.println("20이니까 실행.");
                break;
            default:
                System.out.println("10, 20이 아니니까 실행.");
        }
    }
}
