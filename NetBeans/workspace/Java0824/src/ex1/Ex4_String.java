package ex1;

public class Ex4_String {
    public static void main(String[] args) {
        String str1 = new String("Test");
        String str2 = new String("Test");
        System.out.println("�ּҰ� �� : "+(str1 == str2)); // R: false => String�� == ��� �� �ּҸ� ��
        
        char ch = str1.charAt(0);
        // String Ŭ������ ���� ������ �ִ�.
        // String�� ���� ���� ������ Ŭ�������� �� �񱳸� �� �� API equals�޼ҵ� ���.(��ҹ��� ����.)
        // ��ҹ��� ���ô� equalsIgnoreCase ���.
        // ���ڿ��� �񱳸� ��ȯ
        System.out.println("�� �� : "+str1.equals(str2)); // R: true
        System.out.println("�� �� / ��ҹ��� ���� �� : "+str1.equalsIgnoreCase(str2)); // R: true
    }
}
