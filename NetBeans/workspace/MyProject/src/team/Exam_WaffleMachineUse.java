package team;

import java.util.Scanner;

public class Exam_WaffleMachineUse {
        public static void main(String[] args) {
        Exam_WaffleMachine ew = new Exam_WaffleMachine();
        Scanner sc = new Scanner(System.in);
        String waffleShape = null;
        int wafflePrice = 0;
        int waffleQuantity = 0;
        System.out.print("���ø��(��, ��, ����) : ");
        waffleShape = sc.nextLine();
        System.out.print("���ð��� : ");
        wafflePrice = Integer.parseInt(sc.nextLine());
        System.out.print("���� : ");
        waffleQuantity = Integer.parseInt(sc.nextLine());

        ew.setWaffle(wafflePrice, waffleQuantity, waffleShape);
        ew.orderWaffle();
        System.out.println(ew.getWaffle());
    }
}
