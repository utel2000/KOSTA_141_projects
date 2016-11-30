package review0823;

public class Review_Byte {
    public static void main(String[] args) {
        byte num1 = 7;
        byte num2 = 70;
        // byte 자료형끼리 연산하면서 (num1 + num2)가 int로 JVM이 승격시켰고
        // 이를 디모션하여 byte 자료형에 맞춤.
        byte numResult1 = (byte) (num1 + num2);        
        System.out.println("numResult1 결과값: " + numResult1); // 결과: 77
    
        short num3 = 50;
        short num4 = 2;
        // 위와 같이 short 자료형끼리 연산하면서 int로 승격된 것을
        // 디모션하여 short 자료형에 맞춤.
        short numResult2 = (short) (num3 * num4);
        System.out.println("numResult2 결과값: " + numResult2); // 결과: 100
        
        int num5 = 155;
        int num6 = 42;
        // num1 + num2와 num3 * num4는 int 자료형으로 자동 승격
        int numResult3 = num1 + num2;
        int numResult4 = num3 * num4;
        // num5 / num6은 캐스팅 없이 int형 유지.
        int numResult5 = num5 / num6;
        System.out.println("numResult3 결과값: "+ numResult3); // 결과: 77
        System.out.println("numResult4 결과값: "+ numResult4); // 결과: 100
        System.out.println("numResult5 결과값: "+ numResult5); // 결과: 3
        
        long num7 = 777; // int로 저장되었다가 long으로 승격되어 다시 저장.
        long num8 = 777L; // long으로 바로 저장.
        long num9 = 777l; // long으로 바로 저장.
    }
}
