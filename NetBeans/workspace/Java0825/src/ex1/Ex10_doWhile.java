package ex1;

import java.util.Scanner;

public class Ex10_doWhile {

    public static void main(String[] args) {
        // do { ���๮ | while(����);
        System.out.println("�޼����� �Է��ϼ���.");
        System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
        Scanner scanner = new Scanner(System.in);
        String strInput;
        do {
            System.out.print(">");
            strInput = scanner.nextLine();
            System.out.println(strInput);
        } while (!strInput.equals("q")); // q�� �Է��ϸ� �ݺ� ����.
        System.out.println();
        System.out.println("���α׷� ����.");
    }
}
