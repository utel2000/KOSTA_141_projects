package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Exam_SearchArray {
    static int[] data = {1, 2, 8, 9, 3, 4, 5, 6, 7, 10};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ã�� ���ڸ� �Է��ϼ���(1~10) : ");
        int numUser = Integer.parseInt(sc.nextLine());
        int indexLast = data.length;
        int numRes = 0;
        int numChk = 1;
        boolean flag = false;
        // �ε��� ã��
        for (int i : data) {
            if (numUser == i) {
                flag = true;
                numRes = numChk;
            }
            numChk++;
        }
        Arrays.sort(data); // �������� ����
        // ���
        for (int i : data) {
            System.out.print(i + "\t");
        }
        System.out.println("�˻��� ������ : " + numUser);
        if (flag) {
            System.out.println("�˻� ��� : " + numUser + "��(��) "
                    + numRes + "�� ��ġ���� �߰��߽��ϴ�.");
        }else{
            System.out.println("�˻� ��� : ã�� ���߽��ϴ�.");
        }
    }
}
