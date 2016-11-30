package ex1;

public class Ex7_For {

    public static void main(String[] args) {
        // 1 ~ 30 까지
        /*
            for(초기식;조건식;증감식){
                실행문;
        }
        */
        for (int i = 1; i <= 30; i++) {
            System.out.println(i);
        }
        // for문 안에 선언된 i는 for문 안에서만 사용.
        // 1. 실행순서 초기식은 딱 한 번 실행. i = 1;
        // 2. 조건을 판별 i <= 30 : true
        // 3. 실행문을 수행
        // 4. 증감식에 의해서 1 증가되어 i = 2
        // 2. 조건을 판별 2 <= 30 : true
        // 3. 실행문을 수행.
        // 4..............
        // 조건이 31 <= 30 되는 조건이면 false. for문의 영역이 종료된다.

    }
}
