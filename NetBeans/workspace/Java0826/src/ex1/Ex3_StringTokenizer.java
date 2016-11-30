package ex1;

import java.util.StringTokenizer;

public class Ex3_StringTokenizer {

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
        while (stz1.hasMoreTokens()){
        System.out.println(stz1.nextToken());
        }
        String dateStr = "2016-08-26";
        StringTokenizer stz2 = new StringTokenizer(dateStr, "-");
        System.out.println("��ū�� �� : " + stz2.countTokens());
        while (stz2.hasMoreTokens()) {
            System.out.println(stz2.nextToken());
        }
        String telStr = "02-1235-1211";
        StringTokenizer stz3 = new StringTokenizer(telStr, "-");
        System.out.println("��ū�� �� : " + stz3.countTokens());
        while (stz3.hasMoreTokens()) {
            System.out.println(stz3.nextToken());
        }
        // Ȯ��] �ǹ̾��� ���� : whitespace�� StringTokenizer�� ��ū����
        //                      ������� �ʴ´�.
        String testStr = "02--1211";
        StringTokenizer stz4 = new StringTokenizer(testStr, "-");
        System.out.println("��ū�� �� : " + stz4.countTokens());
        while (stz4.hasMoreTokens()) {
            System.out.println(stz4.nextToken());
        }
    }
}
