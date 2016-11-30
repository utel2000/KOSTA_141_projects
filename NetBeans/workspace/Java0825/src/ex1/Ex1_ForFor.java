package ex1;

public class Ex1_ForFor {
    // �н� ����Ʈ : ���� for���� �����Ѵ�.
    // 2 x 1 = 2, 3 x 1 = 3, ...... 9 x 1 = 9
    // ..
    // 2 x 9 = 18 .....

    public static void main(String[] args) {
        // �����غ��� : �߰� �䱸������ ���� ������ �Բ� ���
        // for���� ������ �߰� ��Ű�� �ʰ�, ���� ���� for�� �ȿ���
        // if, if else�� �߰��ؼ� ����.
        for (int i = 0; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                // \t : �� ���ͷ�
                // ����) If���� {} ���� ���� �ϳ��� ���๮ ";" ���������
                // If���� ������ �������� ���.
                if(i==0)
                   System.out.print("    " + j + "��\t\t");
                else
                    System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        // 5, 6, 7�ܸ� ���.
        for (int i = 0; i <= 9; i++) {
            for (int j = 5; j <= 7; j++) {
                if(i==0)
                   System.out.print("    " + j + "��\t\t");
                else
                    System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.println("");
        }
        // 5�ܸ�
        for (int i = 0; i <= 9; i++) {
            for (int j = 5; j == 5; j++) {
                if(i==0)
                   System.out.print("    " + j + "��\t\t");
                else
                    System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.println("");
        }
        // 5, 6, 7, 8, 9�ܸ� ���.
        for (int i = 0; i <= 9; i++) {
            for (int j = 5; j <= 9; j++) {
                if(i==0)
                   System.out.print("    " + j + "��\t\t");
                else
                    System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.println("");
        }
    }
}
