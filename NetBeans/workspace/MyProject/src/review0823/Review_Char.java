package review0823;

public class Review_Char {

    public static void main(String[] args) {
        char ch0 = '\ucafe'; // �ʱ�ȭ
        char ch1 = '��'; // ���ڴ� ���� ����ǥ
        char ch2 = 65;
        System.out.println("ch0: " + ch0); // ? (�����ڵ� ��)
        System.out.println("ch1: " + ch1); // ��
        System.out.println("ch2: " + ch2); // A (�����ڵ� ��)        
        ch0 = 65 + 1;
        ch1 = 65 + 2;
        ch2 = 65 + 3;
        System.out.println("ch0: " + ch0); // B
        System.out.println("ch1: " + ch1); // C
        System.out.println("ch2: " + ch2); // D
        System.out.println();
        // �ڷ����� ����(��ü)��: �����ڷ��� ����
        // Bang�� ���ڿ������� char�� �ڷ������� ����.
        // [B][a][n][g] ������� 0���� ����.
        String str1 = "Bang";
        char ch3 = str1.charAt(0);
        System.out.println("ch3: " + ch3); // B
        ch3 = str1.charAt(1);
        System.out.println("ch3: " + ch3); // a
        ch3 = str1.charAt(2);
        System.out.println("ch3: " + ch3); // n
        ch3 = str1.charAt(3);
        System.out.println("ch3: " + ch3); // g
    }
}
