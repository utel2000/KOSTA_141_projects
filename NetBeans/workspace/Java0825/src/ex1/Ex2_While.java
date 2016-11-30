package ex1;

public class Ex2_While {
    public static void main(String[] args) {
        int i=1; // 초기식
        while(i<=10) { // 조건식
            System.out.println(i); // 실행문
            i++; // 증감식
        }
        System.out.println("i값 : " + i);
    }
}
