package ex2.exam;
import java.util.Scanner;
public class Exam1_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("���� �Է� : ");
        try {
            int number = Integer.parseInt(sc.nextLine());
            int result = 0;
            for (int i = 0; i < 10; i++) {
                result = number / (int) (Math.random() * 5);
                System.out.println(result);
            }
        } catch (NumberFormatException e) {
            System.out.println("���ܹ߻� : ���ڸ� �Է����ּ���.");
            System.exit(0);
        } catch (ArithmeticException e) {
            System.out.println("���� �߻� : 0���� ���� �� �����ϴ�.");
        } finally {
            System.out.println("--------------��������!!--------------");
        }
    }
}

