package ex1;

import java.util.Scanner;

public class Exam1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String strName = sc.nextLine();
        System.out.print("나이 : ");
        int age = Integer.parseInt(sc.nextLine());
        int res = age + 2;
        System.out.print("주소 : ");
        String strAddr = sc.nextLine();

        System.out.println(strName + "님은 2년 후에는 " + res + "세 입니다.");
        System.out.println("주소는 " + strAddr + "입니다.");
    }
}
