package home;

import java.util.Scanner;

public class Home1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�Է� : ");
        int numUser = Integer.parseInt(sc.nextLine());
        if (numUser % 2 != 0) {
            System.out.println("�Է��� "+numUser+"�� Ȧ�� �Դϴ�.");
        }else{
            System.out.println("�Է��� "+numUser+"�� ¦�� �Դϴ�.");
        }
    }
}
