package arrays;
import java.util.Arrays;
public class Ex2_Array {
    // �迭�� ����� ������ �ʱ�ȭ�� �� ����
    String[] msg = {"Hi!", "Hi2", "Hi3"};
    int[] num = {1, 5, 3, 2, 4, 6};
    int[] num2 = {7, 5, 9, 2, 4, 6, 1, 8, 3};
    public void useArraySort(){
        Arrays.sort(num2);
        for(int e : num2){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public void useArray1() {
        // ���� for������ ��� �غ��� String
        for (String s : msg) {
            System.out.print(s + " ");
        }
        System.out.println("");
    }
    public void useArray2() {
        // �������� ���� �˰���(�����Ʈ)
        int n = num.length; // 
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;
                }
            }
        }
        // for������ ��� �غ��� int������
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
            System.out.println();
    }
    public static void main(String[] args) {
        Ex2_Array ea = new Ex2_Array();
        ea.useArray1();
        ea.useArray2();
        ea.useArraySort();
    }
}
