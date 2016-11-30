package home;

import java.util.Scanner;

public class Home2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("호랑이, 늑대, 뱀, 곰 입력 : ");
        String strAnimal = sc.nextLine();
        if(strAnimal.equals("호랑이")){
            System.out.println("호랑이는 어흥! 하고 웁니다.");
        }else if(strAnimal.equals("늑대")){
            System.out.println("늑대는 아웅~ 하고 웁니다.");
        }else if(strAnimal.equals("뱀")){
            System.out.println("뱀은 쉬익.. 하고 웁니다.");
        }else if(strAnimal.equals("곰")){
            System.out.println("곰은 쿠오오! 하고 웁니다.");
        }else{
            System.out.println("[안내] 동물 이름을 바르게 입력해주세요.");
        }
    }
}
