package books;

public class IncreaseDecreaseOperatorExample {
// 교재의 소스 코드 p. 71

    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("---------------");
        x++; // x= 11
        ++x; // x= 12
        System.out.println("x= " + x); // R: x= 12

        System.out.println("---------------");
        y--; // y= 9
        --y; // y= 8
        System.out.println("y= " + y); // R: y= 8

        System.out.println("---------------");
        z = x++; // z= 12, x= 13
        System.out.println("z= " + z); // R: z= 12
        System.out.println("x= " + x); // R: x= 13

        System.out.println("---------------");
        z = ++x; // z= 14, x= 14
        System.out.println("z= " + z); // R: z= 14
        System.out.println("x= " + x); // R: x= 14
        
        System.out.println("---------------");
        z = ++x + y++; // x= 15, z= 23, y= 9
        System.out.println("z= " + z); // R: z= 23
        System.out.println("x= " + x); // R: x= 15
        System.out.println("y= " + y); // R: y= 9
    }
}
