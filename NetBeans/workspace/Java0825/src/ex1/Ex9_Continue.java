package ex1;

public class Ex9_Continue {

    public static void main(String[] args) {
        int i = 1;
        while (true) {
            i++;
            if (i % 2 != 0) {
                 continue; // Ȧ���� ��쿡�� �ϴ� �ڵ� skip.
            } else if (i == 10) {
                break;
            }
            System.out.println(i);
        }
    }
}
