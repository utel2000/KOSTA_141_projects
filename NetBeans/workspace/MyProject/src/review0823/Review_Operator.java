package review0823;

public class Review_Operator {

    public static void main(String[] args) {
        boolean chk = false;
        String str1 = "����";
        int num1 = 20;
        int num2 = 10;
        // +, -, *, / ������ (���)
        System.out.println(num1 + num2); // + ������: ���ϱ�, ���: 30
        System.out.println(num1 - num2); // - ������: ����, ���: 10
        System.out.println(num1 * num2); // * ������: ���ϱ�, ���: 200
        System.out.println(num1 / num2); // / ������: ������, ���: 2
        // + ������ (���ڿ�)
        System.out.println("+ ��������" + str1); // ���: + �������� ����
        // . ������ (����)
        System.out.println(str1.charAt(0) + "��"); // ���: ����
        // ! ������ (����)
        if (!chk) { // chk�� ���� �ƴ϶�� ���϶�.
            System.out.println("! �������� ����"); // ���: !�������� ����
        }
    }
}
