package study_exam_encapsulation;

import java.util.Scanner;

public class Exam_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������ ����� �� : ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.print("������ ����� ���� : ");
        int qty = Integer.parseInt(sc.nextLine());
        int totalPrice = price*qty;
        Exam_Customer ec = new Exam_Customer();
        Exam_Vendor ev = new Exam_Vendor();
        ev.setStock(qty);
        ec.setCusMoney(totalPrice);
        System.out.println("������ �ݾ� : " + totalPrice);
        System.out.println("������ �ܾ� : " + ec.getCusMoney());
        System.out.println("����� ���� ��� : " + ev.getStock());
    }
}
