package ex1;

import java.util.Scanner;

public class Ex10_doWhile {

    public static void main(String[] args) {
        // do { 실행문 | while(조건);
        System.out.println("메세지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String strInput;
        do {
            System.out.print(">");
            strInput = scanner.nextLine();
            System.out.println(strInput);
        } while (!strInput.equals("q")); // q를 입력하면 반복 종료.
        System.out.println();
        System.out.println("프로그램 종료.");
    }
}
