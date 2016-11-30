package review0824;

public class Review_Oper2 {

    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("---------------");
        x++; // 전치 x= 11
        ++x; // 후치 x= 12
        System.out.println("x= " + x); // R: x= 12

        System.out.println("---------------");
        y--; // y= 9
        --y; // y= 8
        System.out.println("y= " + y); // R: y= 8

        System.out.println("---------------");
        z = x++; // x값이 z에 저장된 후에 증가. z= 12, x= 13
        System.out.println("z= " + z); // R: z= 12
        System.out.println("x= " + x); // R: x= 13

        System.out.println("---------------");
        z = ++x; // x값이 증가된 후에 z에 저장. x= 14, z= 14
        System.out.println("z= " + z); // R: z= 14
        System.out.println("x= " + x); // R: x= 14

        System.out.println("---------------");
        z = ++x + y++; // x의 값이 증가된 후 y값과 더해진 값이 z에 저장된 다음
                       // y값 증가. 
        System.out.println("z= " + z); // R: z= 23
        System.out.println("x= " + x); // R: x= 15
        System.out.println("y= " + y); // R: y= 9
    }
}
