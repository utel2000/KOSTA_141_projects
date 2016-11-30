package ex1;

public class Ex1 {

    // + 연산자를 사용해서 문자열과 변수를 연결 하는 방법
    public static void main(String[] args) {
        // 변수 선언, 초기화
        byte n;
        n = 20;
        byte num1 = 10;
        // 각 자료형은 크기를 가지고 있다.
        // 1byte 형식의 byte는 정수를 담을 수 있는 최소 단위 -128 ~ 127 사이의 정수만 기억.
        byte num2 = 20;
        // 출력
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        // 한 번 해보기
        // 사칙 연산자 +, -, *, /
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
    }
}
