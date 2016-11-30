package review0826;

import java.util.StringTokenizer;

public class Review_StringTokenizer {

    public static void main(String[] args) {
        // �����ڸ� �������� ���ڿ��� �и��Ͽ�
        // String��ü�� ��ȯ.
        String msgStr = "��浿�پ������ٱ��϶�";
        StringTokenizer stz1 = new StringTokenizer(msgStr, "��");
        System.out.println("��ū�� �� : " + stz1.countTokens());
        // �ʱ��;
        // while(���ǽ�) { �����; ������; }
        // stz1.hasMoreTokens() : while�� �������� �����ϸ�
        // ����(ȣ��)�� �Ǹ鼭 �ش� ��ū�� ���� ��� true�� ��ȯ.
        while (stz1.hasMoreTokens()) {
            System.out.println(stz1.nextToken());
        }
        System.out.println();
        // Ȯ��] �ǹ̾��� ���� : whitespace�� StringTokenizer�� ��ū����
        //                      ������� �ʴ´�.
        String testStr = "02--1211";
        StringTokenizer stz2 = new StringTokenizer(testStr, "-");
        System.out.println("��ū�� �� : " + stz2.countTokens());
        while (stz2.hasMoreTokens()) {
            System.out.println(stz2.nextToken());
        }
    }
}
