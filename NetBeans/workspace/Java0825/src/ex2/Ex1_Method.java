package ex2;

public class Ex1_Method {

    // 기본적인 형식
    // 1) 기본 메서드
    public static void test1() {
        System.out.println("하이(Hige)");
    }

    // 2) 인자 값이 있는 메서드 : 메서드이름(인자1, 인자2..) => 인자가 많을 수록 안좋은 코드
    public static void test2(int num) {
        
        System.out.println(num);
    }
    // 3) 반환 값이 있는 메서드 : 반환 값은 호출한 쪽으로 돌려주는 것
    // void 자리에 반환할 자료형 명시
    // 연산이 끝난 후 return문에 값을 반환.
    public static String test3(int num) {
        test2(num);
        return "Result : " + num;
    }
    
    public static void main(String[] args) {
        int num = 100;
        String res = test3(num);
        System.out.println(res);
        test1();
    }
}
