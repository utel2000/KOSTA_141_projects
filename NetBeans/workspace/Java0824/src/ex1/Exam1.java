package ex1;

import java.util.Scanner;

public class Exam1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�̸� : ");
        String strName = sc.nextLine();
        System.out.print("���� : ");
        int age = Integer.parseInt(sc.nextLine());
        int res = age + 2;
        System.out.print("�ּ� : ");
        String strAddr = sc.nextLine();

        System.out.println(strName + "���� 2�� �Ŀ��� " + res + "�� �Դϴ�.");
        System.out.println("�ּҴ� " + strAddr + "�Դϴ�.");
    }
}
