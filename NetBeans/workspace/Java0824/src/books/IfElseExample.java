package books;

import java.util.Scanner;

public class IfElseExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("������ �Է��ϼ��� : ");
        int score = Integer.parseInt(sc.nextLine());
        if (score >=90) {
            System.out.println("������ 90���� Ů�ϴ�.");
            System.out.println("����� A �Դϴ�.");
        } else {
            System.out.println("������ 90���� �۽��ϴ�.");
            System.out.println("����� B �Դϴ�.");
        }
    }
}
