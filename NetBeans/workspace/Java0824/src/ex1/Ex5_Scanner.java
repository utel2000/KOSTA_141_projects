package ex1;

import java.util.Scanner;

public class Ex5_Scanner {

    public static void main(String[] args) {
        // Ű���� �Է� ���� �޾Ƴ��� ���� ��ü�� ����(new).
        Scanner sc = new Scanner(System.in);
        System.out.print("���� �Է� : ");
        // Ű������ �Է� ���� �� ��(����) ������ ���ڿ� ��ü�� ��ȯ.
        String msg = sc.nextLine(); 
        System.out.println("�Է��� ���� : " + msg); // R: �Է��� ���� : (�Է��� ����)
        // ������ �Է� �޴� ���
        // Integer.parseInt(String������) : ���ڿ� ���ڸ� ������ ��ȯ ���ִ� �޼���.
        System.out.print("���� �Է� : ");
        int num1 = Integer.parseInt(sc.nextLine());
        int res = num1 + 10;
        System.out.println(res); // R: (�Է¹��� �� + 10)
        
        // �� �� �غ���
        // Exam1.java �ۼ�
        // ��) �̸� : 
        //     ���� :
        //     �ּ� :
        // ���
        // �ھƹ������� 2�� �Ŀ��� 21�� �Դϴ�.
        // �ּҴ� �Ǳ��Դϴ�.
        
    }
}
