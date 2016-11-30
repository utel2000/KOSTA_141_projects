package home;

import java.util.Scanner;

public class Home5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("알파벳 입력(대문자 or 소문자) : ");
        String strAlphabet = sc.nextLine();
        if ((strAlphabet.charAt(0) >= 65) && (strAlphabet.charAt(0) < 91)) {
            System.out.println("결과 : 대문자");
        } else {
            System.out.println("결과 : 소문자");
        }
    }
}
