package review0824;

public class Review_Oper2 {

    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("---------------");
        x++; // ��ġ x= 11
        ++x; // ��ġ x= 12
        System.out.println("x= " + x); // R: x= 12

        System.out.println("---------------");
        y--; // y= 9
        --y; // y= 8
        System.out.println("y= " + y); // R: y= 8

        System.out.println("---------------");
        z = x++; // x���� z�� ����� �Ŀ� ����. z= 12, x= 13
        System.out.println("z= " + z); // R: z= 12
        System.out.println("x= " + x); // R: x= 13

        System.out.println("---------------");
        z = ++x; // x���� ������ �Ŀ� z�� ����. x= 14, z= 14
        System.out.println("z= " + z); // R: z= 14
        System.out.println("x= " + x); // R: x= 14

        System.out.println("---------------");
        z = ++x + y++; // x�� ���� ������ �� y���� ������ ���� z�� ����� ����
                       // y�� ����. 
        System.out.println("z= " + z); // R: z= 23
        System.out.println("x= " + x); // R: x= 15
        System.out.println("y= " + y); // R: y= 9
    }
}
