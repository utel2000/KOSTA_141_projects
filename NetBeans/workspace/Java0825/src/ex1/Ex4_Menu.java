package ex1;

import java.util.Scanner;

public class Ex4_Menu {

    // �̸�/���� <= Input
    // �̸�/���� => Output
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strName = "";
        int age = 0;
        while (true) {
        // ������ �帧�� �ݺ��� �ȿ��� �׻� �ʱ�ȭ.
        // String strName = "";
        // int age = 0;
            System.out.print("�޴� 1.�Է�, 2.���, 3.���� : ");
            int numMenu = Integer.parseInt(sc.nextLine());
            System.out.println("�˼� : " + numMenu);
            if (numMenu == 3) {
                System.out.println("���α׷��� �����մϴ�. ^.^/");
                break;
            } else if (numMenu == 1) {
                System.out.println("���� �Է�");
                System.out.print("�̸� : ");
                // ���� �����ϸ� : ���� if�� �ȿ� scope, �޴� �������� ���� �Ұ���.
                strName = sc.nextLine();
                System.out.print("���� : ");
                age = Integer.parseInt(sc.nextLine());
            } else if (numMenu == 2) {
                System.out.println("��� ����");
                System.out.println("�Է��� �̸� : " + strName);
                System.out.println("�Է��� ���� : " + age);
            }
        }
    }
}
