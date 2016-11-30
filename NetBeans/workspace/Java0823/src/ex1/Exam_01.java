package ex1;

public class Exam_01 {

    public static void main(String[] args) {
        // 문제 1)
        // char형 변수 ch1에 A란 문자와 ?를 연산 등의 작업을 한 후
        // char형 변수 chres에 연산된 결과를 저장한 후
        // 출력은 B로 출력하시오.

        // 문제 2)
        // kosta란 문자열을 String형 변수 str1에 저장한 후
        // char형 변수 ch2에 o란 문자,
        // char형 변수 ch3에 a란 문자를 각각 추출해서 저장한 후 출력하시오.
        // 정답 1)
        char ch1 = 'A';
        char chres = (char) (ch1 + 1);
        System.out.println(chres);

        // 정답 2)
        String str1 = "kosta";
        char ch2 = str1.charAt(1);
        char ch3 = str1.charAt(4);

        System.out.println("ch2: " + ch2);
        System.out.println("ch3: " + ch3);
    }
}
