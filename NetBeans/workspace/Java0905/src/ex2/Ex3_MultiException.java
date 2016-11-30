package ex2;
import java.util.Scanner;
public class Ex3_MultiException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���� �Է� : ");
        try {   
            int number = Integer.parseInt(sc.nextLine());
            int result = 0;
            for (int i = 0; i < 10; i++) {
                result = number / (int) (Math.random() * 5);
                System.out.println(result);
            }
            // '�̷� ��'���� �� ���� ������ 'Ǯ�' ���� ���� �� ���� ���̴�.
        } catch (NumberFormatException | ArithmeticException e) {
            // ����, NumberFormat, Arithmetic �����ؼ� ����Ϸ���?
            if (e instanceof NumberFormatException) { // ����� ���ܵ� ������.
                System.out.println("���ڸ� ����� �Է��ϼ���.");
            } else {
                System.out.println("0���� ���� �� �����ϴ�.");
            }
        } catch (Exception e) {
            System.out.println("��Ÿ ���� �߻�.");
        } finally {
            System.out.println("--------------��������!!--------------");
        }
    }
}
