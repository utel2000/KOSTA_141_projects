package ex1;

import java.util.StringTokenizer;

public class Ex3_StringTokenizer {

    public static void main(String[] args) {
        // 구문자를 기준으로 문자열을 분리하여
        // String객체로 반환.
        String msgStr = "김길동☆아이유☆구하라";
        StringTokenizer stz1 = new StringTokenizer(msgStr, "☆");
        System.out.println("토큰의 수 : " + stz1.countTokens());
        // 초기식;
        // while(조건식) { 실행식; 증감식; }
        // stz1.hasMoreTokens() : while의 조건으로 지정하면
        // 동작(호출)이 되면서 해당 토큰이 있을 경우 true를 반환.
        while (stz1.hasMoreTokens()){
        System.out.println(stz1.nextToken());
        }
        String dateStr = "2016-08-26";
        StringTokenizer stz2 = new StringTokenizer(dateStr, "-");
        System.out.println("토큰의 수 : " + stz2.countTokens());
        while (stz2.hasMoreTokens()) {
            System.out.println(stz2.nextToken());
        }
        String telStr = "02-1235-1211";
        StringTokenizer stz3 = new StringTokenizer(telStr, "-");
        System.out.println("토큰의 수 : " + stz3.countTokens());
        while (stz3.hasMoreTokens()) {
            System.out.println(stz3.nextToken());
        }
        // 확인] 의미없는 공간 : whitespace는 StringTokenizer의 토큰으로
        //                      취급하지 않는다.
        String testStr = "02--1211";
        StringTokenizer stz4 = new StringTokenizer(testStr, "-");
        System.out.println("토큰의 수 : " + stz4.countTokens());
        while (stz4.hasMoreTokens()) {
            System.out.println(stz4.nextToken());
        }
    }
}
