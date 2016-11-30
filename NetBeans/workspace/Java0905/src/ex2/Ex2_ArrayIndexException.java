package ex2;
import java.util.Scanner;
public class Ex2_ArrayIndexException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���� �Է�");
        String number = sc.nextLine();
        String[] argsv = {"10", number, "30"};
        try {
            for (int i = 0; i <= argsv.length; i++) { // 1
                int n = Integer.parseInt(argsv[i]);
                System.out.println(n); // 2
                System.out.println("----------------*****");
            }
        } catch (NumberFormatException e) {
            System.out.println("����� ���ڸ� �Է��ϼ���.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("�迭�� ������ �Ѿ����ϴ�.");
        } catch (Exception e) { // �ٸ� ����ó������ ���� ���� �� ����.
            System.out.println("��Ÿ ���� �߻�.");
        } finally { // ������ ����!
            System.out.println("����� ���ܿ� ������� ������ ����.");
        }
    }
}
