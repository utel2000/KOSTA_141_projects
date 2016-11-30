package home;

import java.util.Scanner;

public class Home3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCpu = (int) ((Math.random() * 2) + 1);
        System.out.print("사용자가 입력할 값(1 or 2) : ");
        int numUser = Integer.parseInt(sc.nextLine());
        System.out.println("CPU : " + numCpu);
        System.out.println("YOU : " + numUser);
        
        if(numUser==numCpu){
            System.out.println("Res : Win");
        }else{
            System.out.println("Res : Lose");
        }
        

//        if(numUser)
    }
}
