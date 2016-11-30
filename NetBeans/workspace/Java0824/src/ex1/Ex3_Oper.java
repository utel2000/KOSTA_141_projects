package ex1;

public class Ex3_Oper {
    public static void main(String[] args) {
        // bit연산자는 bit단위로 연산하는 연산자.
        // &, |, ^, ~
        int a = 10; // 1 0 1 0 
        int b = 7; // 0 1 1 1
        int c = a & b;
        System.out.println(c); // R: 2
    }
}
