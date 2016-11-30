package ex1;

public class Ex1_Oper {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("&& : " + ((num1 == num2) || (num1 <= num2)));
        int a = 10;
        int b = 20;
        boolean c = ((a += 12) > b) || (a == (b += 2));
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
