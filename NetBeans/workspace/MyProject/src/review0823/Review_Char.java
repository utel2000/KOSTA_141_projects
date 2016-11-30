package review0823;

public class Review_Char {

    public static void main(String[] args) {
        char ch0 = '\ucafe'; // 초기화
        char ch1 = '꺅'; // 문자는 작은 따옴표
        char ch2 = 65;
        System.out.println("ch0: " + ch0); // ? (유니코드 값)
        System.out.println("ch1: " + ch1); // 꺅
        System.out.println("ch2: " + ch2); // A (유니코드 값)        
        ch0 = 65 + 1;
        ch1 = 65 + 2;
        ch2 = 65 + 3;
        System.out.println("ch0: " + ch0); // B
        System.out.println("ch1: " + ch1); // C
        System.out.println("ch2: " + ch2); // D
        System.out.println();
        // 자료형이 참조(객체)형: 참조자료형 변수
        // Bang은 문자열이지만 char형 자료형으로 저장.
        // [B][a][n][g] 순서대로 0부터 시작.
        String str1 = "Bang";
        char ch3 = str1.charAt(0);
        System.out.println("ch3: " + ch3); // B
        ch3 = str1.charAt(1);
        System.out.println("ch3: " + ch3); // a
        ch3 = str1.charAt(2);
        System.out.println("ch3: " + ch3); // n
        ch3 = str1.charAt(3);
        System.out.println("ch3: " + ch3); // g
    }
}
