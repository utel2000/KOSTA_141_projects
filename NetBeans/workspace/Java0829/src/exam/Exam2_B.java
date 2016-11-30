package exam;

import java.util.Scanner;

public class Exam2_B {
    // 두 수를 저장할 멤버 변수(n1, n2)를 선언하고
    int n1;
    int n2;
    // 두 수를 입력받는 printNum() 메서드를 사용해서
    // 화면에 출력하는 동작을 정의
    public void printNum(){
        System.out.println("n1 + n2 : " + (n1 + n2));
    }
    // 메인 만들어서
    // Exam2_B를 생성 한 후
    // 멤버변수에 값을 각각 대입시킨다.(Scanner를 사용하면 굿)
    // printNum() 호출해서 n1 + n2의 더한 값을 출력하시오.
    public static void main(String[] args) {
        Exam2_B eb = new Exam2_B();
        Scanner sc = new Scanner(System.in);
        System.out.print("n1값을 입력하시오 : ");
        eb.n1 = Integer.parseInt(sc.nextLine());
        System.out.print("n2값을 입력하시오 : ");
        eb.n2 = Integer.parseInt(sc.nextLine());
        eb.printNum();
    }
}
