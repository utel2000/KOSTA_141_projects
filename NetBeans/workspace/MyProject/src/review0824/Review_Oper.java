package review0824;

public class Review_Oper {

    public static void main(String[] args) {
        int x = -100;
        int result1 = +x;
        int result2 = -x;

        short s = 100;
        int result = -s; // 프로모션

        System.out.println(result1); // R: -100
        System.out.println(result2); // R: 100
        System.out.println(result); // R: -100
    }
}
