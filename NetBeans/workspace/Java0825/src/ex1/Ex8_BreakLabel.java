package ex1;

public class Ex8_BreakLabel {

    public static void main(String[] args) {
        // breaklabel: jdk 5�������� ����. break�� ���������� ���� ������ ��ġ�� ���� �����Ѵ�.
        ex:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break ex;
                }
                System.out.println(i + ":" + j + " ");
            }
            System.out.println("--------------");
        }
        // Exam4_Menu.java�� �ҽ� �߿� ���Ḧ break label������ ����.
    }
}
