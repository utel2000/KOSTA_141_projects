package home;

import java.util.Scanner;

public class Home5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("���ĺ� �Է�(�빮�� or �ҹ���) : ");
        String strAlphabet = sc.nextLine();
        if ((strAlphabet.charAt(0) >= 65) && (strAlphabet.charAt(0) < 91)) {
            System.out.println("��� : �빮��");
        } else {
            System.out.println("��� : �ҹ���");
        }
    }
}
