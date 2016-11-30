package review0823;

public class Review_Float {

    public static void main(String[] args) {
        float f1 = (float) 3.14; // double에서 float으로 디모션.
        float f2 = 3.14F; // float으로 바로 저장.
        float f3 = 3.14f; // float으로 바로 저장.
        System.out.println(f1); // 결과: 3.14
        System.out.println(f2); // 결과: 3.14
        System.out.println(f3); // 결과: 3.14

        double d1 = 3.14; // double로 바로 저장.
        double d2 = f1; // 프로모션
        double d3 = f2; // 프로모션
        double d4 = f3; // 프로모션
        System.out.println(d1); // 결과: 3.14
        System.out.println(d2); // 결과: 3.140000104904175
        System.out.println(d3); // 결과: 3.140000104904175
        System.out.println(d4); // 결과: 3.140000104904175
    }
}
