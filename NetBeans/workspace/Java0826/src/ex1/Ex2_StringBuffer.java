package ex1;

import java.util.Scanner;

public class Ex2_StringBuffer {

    public static void main(String[] args) {
        // ����)-------------------------------------------------
        // java.lang�� �ִ� Ŭ�������� import�� �ʿ䰡 ����.
        // �ʹ� ���� ����ϴϱ� �ڹٿ����� java.lang ��Ű����
        // �⺻ ��Ű���� ����ϰ� ����. �� lang�� Ŭ������ �ڵ� import!
        // ��) StringBuffer, String, Math
        // ------------------------------------------------------
        // Scanner�� ������� �̸��� ���̸� �Է¹޾Ƽ�
        // StringBuffer�� �����ϰ� ���.
        // ���]
        // ���̵� : �ڽó�, ���� : 20
        Scanner sc = new Scanner(System.in);
        // ���ڿ��� ������ �ӽ� ����!
        StringBuffer mdata = new StringBuffer();
        System.out.print("�̸� : ");
        String nameStr = sc.nextLine();
        System.out.print("���� : ");
        int ageNum = Integer.parseInt(sc.nextLine());
        // ����ڰ� �Է��� �� nameStr, ageNum�� StringBuffer�� �����غ���.
        mdata.append("�̸� : ").append(nameStr);
        mdata.append(", ���� : ").append(ageNum);
        // ����� �� �ֵ��� ���ڿ� ��ü�� ��ȯ. (toString() �޼���)
        // ������ println()�� �ڵ����� String���� �ٲ��ִ� ������ ���ʿ�. 
        // String m = mdata.toString(); // ���� ���� toString()�� 2�� �Ǵ� ��.(��ȿ����)
        System.out.println(mdata);
    }
}
