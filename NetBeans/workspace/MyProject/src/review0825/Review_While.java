package review0825;

public class Review_While {

    public static void main(String[] args) {
        int i = 1; // �ʱ��
        while (i <= 5) { // ���ǽ�
            System.out.print(i + " "); // ���๮, R: 1 2 3 4 5
            i++; // ������
        }
        System.out.println();
        System.out.println("i�� : " + i); // R: i�� : 6

        do {
            System.out.print(i + " ");
            i++;

        } while (i <= 5);
        System.out.println("");
        System.out.println("i�� : " + i);
    }
}
