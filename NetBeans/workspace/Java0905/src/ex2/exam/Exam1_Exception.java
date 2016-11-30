package ex2.exam;
import java.util.Scanner;
public class Exam1_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        try {
            int number = Integer.parseInt(sc.nextLine());
            int result = 0;
            for (int i = 0; i < 10; i++) {
                result = number / (int) (Math.random() * 5);
                System.out.println(result);
            }
        } catch (NumberFormatException e) {
            System.out.println("예외발생 : 숫자를 입력해주세요.");
            System.exit(0);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생 : 0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("--------------쏴리질러!!--------------");
        }
    }
}

