package ex1;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1~100������ �� : " + sum);

        System.out.println();
        
        for (int i = 1; i <= 10; i++) {
            System.out.print(i); // i�� 1 ~ 9���� =, else, X
            if (i != 10) {
                System.out.print(", ");
            }
        }
        
        System.out.println("\n");

        // 1 ~ 10���� ��� [Ȧ]¦
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " Ȧ");
            } else {
                System.out.println(i + " ¦");
            }
        }
        
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("�� : ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.print("���� �� : ");
        int numRange = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= num; i++){
            System.out.print(i + " ");
            if(i % numRange == 0){
                System.out.println();
            }
        }
    }
}
