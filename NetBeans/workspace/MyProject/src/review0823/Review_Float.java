package review0823;

public class Review_Float {

    public static void main(String[] args) {
        float f1 = (float) 3.14; // double���� float���� ����.
        float f2 = 3.14F; // float���� �ٷ� ����.
        float f3 = 3.14f; // float���� �ٷ� ����.
        System.out.println(f1); // ���: 3.14
        System.out.println(f2); // ���: 3.14
        System.out.println(f3); // ���: 3.14

        double d1 = 3.14; // double�� �ٷ� ����.
        double d2 = f1; // ���θ��
        double d3 = f2; // ���θ��
        double d4 = f3; // ���θ��
        System.out.println(d1); // ���: 3.14
        System.out.println(d2); // ���: 3.140000104904175
        System.out.println(d3); // ���: 3.140000104904175
        System.out.println(d4); // ���: 3.140000104904175
    }
}
