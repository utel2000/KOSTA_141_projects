package books;

public class SignOperatorExample {
// 교재의 소스 코드 p.69

    public static void main(String[] args) {
        int x = -100;
        int result1 = +x; // +산술 연산(x에 +를 곱한다.)
        int result2 = -x; // -산술 연산(x에 -를 곱한다.)
        System.out.println("result1= " + result1); // R: result1= -100
        System.out.println("result2= " + result2); // R: result2= 100

        short s = 100;
        //short result3 = -s // 컴파일 에러: -연산되며 4byte의 int형이 되어서 디모션 발생.
        int result3 = -s; // 프로모션에 맞춰 result3을 int형으로 선언.
        System.out.println("result= " + result3); // R: result= -100
    }
}
