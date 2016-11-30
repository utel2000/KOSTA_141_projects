package home;

import java.util.Scanner;

public class Home1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int numUser = Integer.parseInt(sc.nextLine());
        if (numUser % 2 != 0) {
            System.out.println("입력한 "+numUser+"은 홀수 입니다.");
        }else{
            System.out.println("입력한 "+numUser+"은 짝수 입니다.");
        }
    }
}
