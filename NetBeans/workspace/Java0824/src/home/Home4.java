package home;

import java.util.Scanner;

public class Home4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호 입력(oooooo-ooooooo) : ");
        String str = sc.nextLine();
        char chkGender = str.charAt(7);
        if(chkGender=='1' || chkGender=='3'){
            System.out.println("결과: 남성입니다.");
        }else if(chkGender=='2' || chkGender=='4'){
            System.out.println("결과: 여성입니다.");
        }else{
            System.out.println("[안내] 올바른 주민등록번호를 양식에 맞춰 입력해주세요. oooooo-ooooooo");
        }
    }
}
