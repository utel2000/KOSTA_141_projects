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
            System.out.print("�޴� 1.�Է�, 2.���, 3.���� : ");
            int numMenu = Integer.parseInt(sc.nextLine());
            switch (numMenu) {
                case 3:
                    System.out.println("���α׷��� �����մϴ�. ^.^/");
                    break exit;
                case 1:
                    System.out.println("���� �Է�");
                    System.out.print("�̸� : ");
                    strName = sc.nextLine();
                    System.out.print("���� : ");
                    age = Integer.parseInt(sc.nextLine());
                    mdata.append("�̸� : ").append(strName);
                    mdata.append(" // ���� : ").append(age).append("\n");
                    break;
                case 2:
                    System.out.println("��� ����");
                    System.out.println(mdata);
                    break;
            }
            /*
            exit:
        while (true) {
            System.out.print("�޴� 1.�Է�, 2.���, 3.���� : ");
            int numMenu = Integer.parseInt(sc.nextLine());
            System.out.println("�˼� : " + numMenu);
            
            switch (numMenu) {
                case 3:
                    System.out.println("���α׷��� �����մϴ�. ^.^/");
                    //run = false;
                    break exit;
                case 1:
                    System.out.println("���� �Է�");
                    System.out.print("�̸� : ");
                    strName = sc.nextLine();
                    System.out.print("���� : ");
                    age = Integer.parseInt(sc.nextLine());
                    break;
                case 2:
                    System.out.println("��� ����");
                    System.out.print("�Է��� �̸� : " + strName);
                    System.out.println(" // �Է��� ���� : " + age);
                    break;
            }
             */
 /*
            if (numMenu == 3) {
                System.out.println("���α׷��� �����մϴ�. ^.^/");
                break;
            } else if (numMenu == 1) {
                System.out.println("���� �Է�");
                System.out.print("�̸� : ");
                strName = sc.nextLine();
                System.out.print("���� : ");
                age = Integer.parseInt(sc.nextLine());
            } else if (numMenu == 2) {
                System.out.println("��� ����");
                System.out.println("�Է��� �̸� : " + strName);
                System.out.println("�Է��� ���� : " + age);
            }
             */
        }
    }
}
