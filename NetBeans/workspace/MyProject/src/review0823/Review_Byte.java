package review0823;

public class Review_Byte {
    public static void main(String[] args) {
        byte num1 = 7;
        byte num2 = 70;
        // byte �ڷ������� �����ϸ鼭 (num1 + num2)�� int�� JVM�� �°ݽ��װ�
        // �̸� �����Ͽ� byte �ڷ����� ����.
        byte numResult1 = (byte) (num1 + num2);        
        System.out.println("numResult1 �����: " + numResult1); // ���: 77
    
        short num3 = 50;
        short num4 = 2;
        // ���� ���� short �ڷ������� �����ϸ鼭 int�� �°ݵ� ����
        // �����Ͽ� short �ڷ����� ����.
        short numResult2 = (short) (num3 * num4);
        System.out.println("numResult2 �����: " + numResult2); // ���: 100
        
        int num5 = 155;
        int num6 = 42;
        // num1 + num2�� num3 * num4�� int �ڷ������� �ڵ� �°�
        int numResult3 = num1 + num2;
        int numResult4 = num3 * num4;
        // num5 / num6�� ĳ���� ���� int�� ����.
        int numResult5 = num5 / num6;
        System.out.println("numResult3 �����: "+ numResult3); // ���: 77
        System.out.println("numResult4 �����: "+ numResult4); // ���: 100
        System.out.println("numResult5 �����: "+ numResult5); // ���: 3
        
        long num7 = 777; // int�� ����Ǿ��ٰ� long���� �°ݵǾ� �ٽ� ����.
        long num8 = 777L; // long���� �ٷ� ����.
        long num9 = 777l; // long���� �ٷ� ����.
    }
}
