package ex1;

import java.util.Scanner;

public class Ex5_Scanner {

    public static void main(String[] args) {
        // 키보드 입력 값을 받아내기 위한 객체를 생성(new).
        Scanner sc = new Scanner(System.in);
        System.out.print("문자 입력 : ");
        // 키보드의 입력 값을 한 줄(엔터) 단위로 문자열 객체로 반환.
        String msg = sc.nextLine(); 
        System.out.println("입력한 문자 : " + msg); // R: 입력한 문자 : (입력한 문자)
        // 정수를 입력 받는 방법
        // Integer.parseInt(String형숫자) : 문자열 숫자를 정수로 변환 해주는 메서드.
        System.out.print("정수 입력 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        int res = num1 + 10;
        System.out.println(res); // R: (입력받은 값 + 10)
        
        // 한 번 해보기
        // Exam1.java 작성
        // 예) 이름 : 
        //     나이 :
        //     주소 :
        // 출력
        // 박아무개님은 2년 후에는 21세 입니다.
        // 주소는 판교입니다.
        
    }
}
