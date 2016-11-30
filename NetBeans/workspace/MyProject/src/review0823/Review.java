package review0823;

public class Review {

    static boolean chk1; // 초기값 가짐 (멤버 변수)
    static int num1; // 초기값 가짐 (멤버 변수)

    public static void main(String[] args) {
        boolean chk2 = false; // 초기값 가지지 않음. false로 초기화. (지역 변수)
        int num2 = 0; // 초기값 가지지 않음. 0으로 초기화. (지역 변수)
        
        System.out.println("boolean 변수 초기값: " + chk1); // 결과: false
        System.out.println("num1 변수 초기값: " + num1); // 결과: 0
    }
}
