package exam;

import java.util.Scanner;

public class Exam2_B {
    // �� ���� ������ ��� ����(n1, n2)�� �����ϰ�
    int n1;
    int n2;
    // �� ���� �Է¹޴� printNum() �޼��带 ����ؼ�
    // ȭ�鿡 ����ϴ� ������ ����
    public void printNum(){
        System.out.println("n1 + n2 : " + (n1 + n2));
    }
    // ���� ����
    // Exam2_B�� ���� �� ��
    // ��������� ���� ���� ���Խ�Ų��.(Scanner�� ����ϸ� ��)
    // printNum() ȣ���ؼ� n1 + n2�� ���� ���� ����Ͻÿ�.
    public static void main(String[] args) {
        Exam2_B eb = new Exam2_B();
        Scanner sc = new Scanner(System.in);
        System.out.print("n1���� �Է��Ͻÿ� : ");
        eb.n1 = Integer.parseInt(sc.nextLine());
        System.out.print("n2���� �Է��Ͻÿ� : ");
        eb.n2 = Integer.parseInt(sc.nextLine());
        eb.printNum();
    }
}
