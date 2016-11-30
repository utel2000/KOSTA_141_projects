package books;

import java.util.Scanner;

public class IfElseExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요 : ");
        int score = Integer.parseInt(sc.nextLine());
        if (score >=90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        } else {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B 입니다.");
        }
    }
}
