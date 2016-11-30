package ex1;

public class Ex11_CountDown {

    public static void main(String[] args) throws InterruptedException {
        int i = 10;
        /*
        while (i<=10) {
            Thread.sleep(1000);
            System.out.println(i);
            i++;
        }
         */

        // 연습문제: do while로 start! 문구 넣어서 역순으로 숫자가 감소하는 카운트다운 만들어라.
        do {
            if (i == 11) {
                System.out.println("Start!");
            } else {
                Thread.sleep(1000);
                System.out.println(i);
            }
            i--;
        } while (i >= 0);
    }
}
