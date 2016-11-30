package review0829;

import java.util.Scanner;

public class Review_Exam2_B {
    // 두 수를 저장할 멤버 변수(n1, n2)를 선언하고
    int n1;
    int n2;

    // 두 수를 입력받는 printNum() 메서드를 사용해서
    // 화면에 출력하는 동작을 정의.
    public void printNum() {
        System.out.println("n1 + n2 : " + (n1 + n2));
    }

    // 멤버변수에 값을 각각 대입.
    // printNum() 호출해서 n1 + n2의 더한 값을 출력.
    public static void main(String[] args) {
        Review_Exam2_B eb = new Review_Exam2_B();
        Scanner sc = new Scanner(System.in);
        System.out.print("n1값을 입력하시오 : ");
        eb.n1 = Integer.parseInt(sc.nextLine());
        System.out.print("n2값을 입력하시오 : ");
        eb.n2 = Integer.parseInt(sc.nextLine());
        eb.printNum();
    }
}
