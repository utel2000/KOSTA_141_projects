package ex1;

import java.util.Scanner;

public class Exam1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단 입력 : ");
        int numCount = Integer.parseInt(sc.nextLine());
        System.out.print("범위 입력(1, 3, 5, 7, 9)  : ");
        int numRange = Integer.parseInt(sc.nextLine());
        int start = (numCount - numRange/2);
        int end = (numCount + numRange/2);
        System.out.println("Start : "+start);
        System.out.println("End : "+end);
        for (int i = 0; i <= 9; i++) {
            for (int j = (numCount - (numRange / 2)); j <= (numCount + (numRange / 2)); j++) {
                if (i == 0) {
                    System.out.print("    " + j + "단\t\t");
                } else {
                    System.out.print(j + " x " + i + " = " + (j * i) + "\t");
                }
            }
            System.out.println("");
        }
    }
}
