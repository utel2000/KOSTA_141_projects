package ex1;

public class Ex3_Char {

    public static void main(String[] args) {
        // 문자형 java에서는 모든 문자를 2byte로 저장하여 취급한다.
        char ch1 = 'B';
        System.out.println("ch1 : " + ch1);
        ch1 = 65 + 1; // 65 : A  ***********
        // 65 + 1 = B
        System.out.println("ch1 : " + ch1);

        // 값을 초기화 할 때 값을 비워 두고 싶다면 ch1 = '\ucafe'; 권장.
        // 좋은 방법은 아니나 스페이스로 비워둘 수 있기는 하다.(유니코드:32)
        // ch1 = ' ';
        ch1 = '\ucafe'; // 초기값 쫾
        System.out.println("ch1 : " + ch1);

        // ---- 하나의 문자
        // 문자열 저장
        String str1 = "A";
        // A는 문자열이지만 char형 자료형으로 저장.
        // 복습) "." 연산자는 변수에서도 사용할 수 있다.
        // 자료형이 참조(객체)형 : 참조자료형 변수
        // -----------------------------------------
        // 참고: 메서드를 호출할 때 반환형에 맞게 변수에 저장 가능하다.
        // ch1 = str1.charAt(str1.indexOf("A"));
        // -----------------------------------------

        String str2 = "Test";
        // [T][e][s][t]
        // 0부터 시작
        // 의도: String의 문자열 Test 중에서 한 문자 T만 추출해서 char 변수 ch2에 저장하고 싶다.
        char ch2 = str2.charAt(0);
        System.out.println("ch2: " + ch2); // T
        ch2 = str2.charAt(1);
        System.out.println("ch2: " + ch2); // e
        ch2 = str2.charAt(2);
        System.out.println("ch2: " + ch2); // s
        ch2 = str2.charAt(3);
        System.out.println("ch2: " + ch2); // t
    }
}
