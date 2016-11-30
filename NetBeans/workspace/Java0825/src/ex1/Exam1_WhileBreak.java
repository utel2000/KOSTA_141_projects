package ex1;

import java.util.Scanner;

public class Exam1_WhileBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("멈출 숫자를 입력하시오 : " );
        int numStop = Integer.parseInt(sc.nextLine());
        int i = 1;
        while(i<=100){
            System.out.println(i);
            if(i == numStop){
                break;
            }
            i++;
        }
        
        //무한루프
        /*
            while(true){
            System.out.println(i);
            i++;
        }
        */
    }
}
