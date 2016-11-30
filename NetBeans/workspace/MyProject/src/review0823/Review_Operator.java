package review0823;

public class Review_Operator {

    public static void main(String[] args) {
        boolean chk = false;
        String str1 = "역할";
        int num1 = 20;
        int num2 = 10;
        // +, -, *, / 연산자 (산술)
        System.out.println(num1 + num2); // + 연산자: 더하기, 결과: 30
        System.out.println(num1 - num2); // - 연산자: 빼기, 결과: 10
        System.out.println(num1 * num2); // * 연산자: 곱하기, 결과: 200
        System.out.println(num1 / num2); // / 연산자: 나누기, 결과: 2
        // + 연산자 (문자열)
        System.out.println("+ 연산자의" + str1); // 결과: + 연산자의 역할
        // . 연산자 (참조)
        System.out.println(str1.charAt(0) + "할"); // 결과: 역할
        // ! 연산자 (부정)
        if (!chk) { // chk가 참이 아니라면 행하라.
            System.out.println("! 연산자의 역할"); // 결과: !연산자의 역할
        }
    }
}
