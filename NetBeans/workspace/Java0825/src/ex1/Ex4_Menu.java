package ex1;

import java.util.Scanner;

public class Ex4_Menu {

    // 이름/나이 <= Input
    // 이름/나이 => Output
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strName = "";
        int age = 0;
        while (true) {
        // 로직의 흐름상 반복문 안에서 항상 초기화.
        // String strName = "";
        // int age = 0;
            System.out.print("메뉴 1.입력, 2.출력, 3.종료 : ");
            int numMenu = Integer.parseInt(sc.nextLine());
            System.out.println("검수 : " + numMenu);
            if (numMenu == 3) {
                System.out.println("프로그램을 종료합니다. ^.^/");
                break;
            } else if (numMenu == 1) {
                System.out.println("정보 입력");
                System.out.print("이름 : ");
                // 변수 선언하면 : 현재 if문 안에 scope, 달느 영역에서 참조 불가능.
                strName = sc.nextLine();
                System.out.print("나이 : ");
                age = Integer.parseInt(sc.nextLine());
            } else if (numMenu == 2) {
                System.out.println("출력 정보");
                System.out.println("입력한 이름 : " + strName);
                System.out.println("입력한 나이 : " + age);
            }
        }
    }
}
