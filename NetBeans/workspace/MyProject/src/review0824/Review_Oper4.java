package review0824;

public class Review_Oper4 {
    public static void main(String[] args) {
        int charCode = 'A';

        if ((charCode >= 65) & (charCode <= 90)) { // &�� |�� ��, ������ �����Ǿ
            System.out.println("�빮�� �̱���.");   // �׻� ���� ������ �� Ȯ���Ѵ�.(��ȿ����)
        }
        if ((charCode >= 97) && (charCode <= 22)) { // �ݸ� &&�� ||�� ��, ������ �����Ǹ�
            System.out.println("�ҹ��� �̱���."); // ������ ���� Ȯ������ �ʰ� �Ѿ��.(ȿ����)
        }
        if (!(charCode < 48) && !(charCode > 57)) {
            System.out.println("0~9 ���� �̱���.");
        }
        int value = 6;
        if ((value%2== 0) | (value%3== 0)) {
            System.out.println("2 �Ǵ� 3�� ��� �̱���.");
        }
        if ((value%2== 0) || (value%3== 0)) {
            System.out.println("2 �Ǵ� 3�� ��� �̱���.");
        }
    }
}
