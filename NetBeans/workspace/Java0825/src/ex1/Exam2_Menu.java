package ex1;

import java.util.Scanner;

public class Exam2_Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strName = "";
        int age = 0;
        //boolean run = true;
        StringBuffer mdata = new StringBuffer();

        exit:
        while (true) {
            System.out.print("메뉴 1.입력, 2.출력, 3.종료 : ");
            int numMenu = Integer.parseInt(sc.nextLine());
            switch (numMenu) {
                case 3:
                    System.out.println("프로그램을 종료합니다. ^.^/");
                    break exit;
                case 1:
                    System.out.println("정보 입력");
                    System.out.print("이름 : ");
                    strName = sc.nextLine();
                    System.out.print("나이 : ");
                    age = Integer.parseInt(sc.nextLine());
                    mdata.append("이름 : ").append(strName);
                    mdata.append(" // 나이 : ").append(age).append("\n");
                    break;
                case 2:
                    System.out.println("출력 정보");
                    System.out.println(mdata);
                    break;
            }
            /*
            exit:
        while (true) {
            System.out.print("메뉴 1.입력, 2.출력, 3.종료 : ");
            int numMenu = Integer.parseInt(sc.nextLine());
            System.out.println("검수 : " + numMenu);
            
            switch (numMenu) {
                case 3:
                    System.out.println("프로그램을 종료합니다. ^.^/");
                    //run = false;
                    break exit;
                case 1:
                    System.out.println("정보 입력");
                    System.out.print("이름 : ");
                    strName = sc.nextLine();
                    System.out.print("나이 : ");
                    age = Integer.parseInt(sc.nextLine());
                    break;
                case 2:
                    System.out.println("출력 정보");
                    System.out.print("입력한 이름 : " + strName);
                    System.out.println(" // 입력한 나이 : " + age);
                    break;
            }
             */
 /*
            if (numMenu == 3) {
                System.out.println("프로그램을 종료합니다. ^.^/");
                break;
            } else if (numMenu == 1) {
                System.out.println("정보 입력");
                System.out.print("이름 : ");
                strName = sc.nextLine();
                System.out.print("나이 : ");
                age = Integer.parseInt(sc.nextLine());
            } else if (numMenu == 2) {
                System.out.println("출력 정보");
                System.out.println("입력한 이름 : " + strName);
                System.out.println("입력한 나이 : " + age);
            }
             */
        }
    }
}
