package ex1;

public class Ex2_Boolean {

    // 1bit, 제어문, 반복문에서 조건의 값으로 많이 사용.
    // 예) 유효성 검사, 토글 형식의 알고리즘에 사용.
    // boolean은 false와 true만 동작. 초기값은 false.
    static boolean num;
    public static void main(String[] args) {
        boolean num2 = false;
        System.out.println("멤버변수 num: " + num);
        // 증명: 지역변수는 초기화 시켜야만 사용할 수 있다.
        System.out.println("지역변수 num2: " + num2);
        // 변수는 다시 사용할 때 값을 재 할당할 수 있다.
        num2 = true;
        System.out.println("변경한 num2의 변수 값 출력: " + num2);
    }
}
