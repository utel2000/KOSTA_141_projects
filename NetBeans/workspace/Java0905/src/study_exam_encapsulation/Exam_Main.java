package study_exam_encapsulation;

import java.util.Scanner;

public class Exam_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구입할 사과의 값 : ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.print("구입할 사과의 수량 : ");
        int qty = Integer.parseInt(sc.nextLine());
        int totalPrice = price*qty;
        Exam_Customer ec = new Exam_Customer();
        Exam_Vendor ev = new Exam_Vendor();
        ev.setStock(qty);
        ec.setCusMoney(totalPrice);
        System.out.println("지불할 금액 : " + totalPrice);
        System.out.println("지갑의 잔액 : " + ec.getCusMoney());
        System.out.println("사과의 남은 재고 : " + ev.getStock());
    }
}
