package home;

import java.util.Scanner;

public class Home6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("∞‘¿”»Ωºˆ : ");
        int numCount = Integer.parseInt(sc.nextLine());
        int numUser = 0;
        int numCpu = 0;
        int numWinCount = 0;
        
        for (int i = 1; i <= numCount; i++) {
            numCpu = (int) ((Math.random() * 2) + 1);
            System.out.print("»¶-1  | ¬¶-2 : ");
            numUser = Integer.parseInt(sc.nextLine());
            
            if (numUser == numCpu) {
                System.out.println("CPU : " + numCpu + " VS YOU : " + numUser + " => WIN");
                numWinCount++;
            }else{
                System.out.println("CPU : " + numCpu + " VS YOU : " + numUser + " => LOSE");
            }
            
            System.out.println("Total : " + i);
            System.out.println("Win : " + numWinCount);
        }
    }
}
