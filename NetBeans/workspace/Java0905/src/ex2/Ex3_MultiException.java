package ex2;
import java.util.Scanner;
public class Ex3_MultiException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 : ");
        try {   
            int number = Integer.parseInt(sc.nextLine());
            int result = 0;
            for (int i = 0; i < 10; i++) {
                result = number / (int) (Math.random() * 5);
                System.out.println(result);
            }
            // '이런 식'으로 쓸 수도 있지만 '풀어서' 쓰는 것이 더 좋을 것이다.
        } catch (NumberFormatException | ArithmeticException e) {
            // 만약, NumberFormat, Arithmetic 구분해서 출력하려면?
            if (e instanceof NumberFormatException) { // 어찌보면 예외도 다형성.
                System.out.println("숫자를 제대로 입력하세요.");
            } else {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        } catch (Exception e) {
            System.out.println("기타 예외 발생.");
        } finally {
            System.out.println("--------------쏴리질러!!--------------");
        }
    }
}
