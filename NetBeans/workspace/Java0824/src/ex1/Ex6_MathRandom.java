package ex1;

public class Ex6_MathRandom {

    public static void main(String[] args) {
        // Math : 수학관련 자원을 가진 클래스.
        // random() : 난수를 반환하는 메서드.
        // Math.random()은 0 ~ 1.0의 double을 반환.
        // <정수형으로 바꿨을 경우> - 소수점 이하 '버림'
        // 랜덤 : 0 (1가지 수), 랜덤 * 2 : 0부터 1까지 (2가지 수),
        // 랜덤 * 3 : 0부터 2까지 (3가지 수), ...,
        // 랜덤 * 10 : 0부터 9까지 (10가지 수)
        int rNum = (int) ((Math.random() * 3)+1); // 디모션.
        System.out.println("rNum : " + rNum); // R: 1~3 무작위 출력.        
    }
}
