package review0825;

public class Review_ForFor {
    public static void main(String[] args) {
        // ������ 2�ܺ��� 9�ܱ���
        for (int i = 0; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                if(i==0)
                   System.out.print("    " + j + "��\t\t");
                else
                    System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.println("");
        }
    }
}
