package review0830;
// WrapperClass�� �Ϲ� �ڷ����� ��üȭ ���Ѽ� �������ִ� API.
// �Ϲ��ڷ����� ���õ� ����(���ҽ�, �޼���, �Ӽ�)�� ������ �����ν�
// ������, ������ ����. String Ŭ����ó�� ���� �����ϴ� ��ü�� ����.
// WrapperClass�� �Ϲ��ڷ����� ������ �ִ� Ŭ����.(Integer, Boolean ��)
// AutoBoxing�� Stringó�� ��������ü��������� ���� ��.
// UnBoxing�� ��üȭ �� ���� �Ϲ� �ڷ������� �ٽ� �ǵ����� ��.
// jdk 5���� �̻���� �������ִ� ����� AutoBoxing, UnBoxing.
public class Review_WrapperClass {
    public void test() {
        Integer num1 = Integer.parseInt("10");
        System.out.println("num1 = " + num1);
        Integer num2v = new Integer("100"); // �������ü���� (5���� �̸� ���)
        Integer num3v = 1000; // AutoBoxing (5���� �̻� ���)
        int num = num3v; // UnBoxing
        Boolean b = true; // AutoBoxing
        System.out.println(b);        
        boolean bb = b; // UnBoxing        
        System.out.println(bb);        
        Double dou = 1000.00; // AutoBoxing
        System.out.println(dou);
        double douu = dou; // UnBoxing
        System.out.println(douu);
        Character ch = '��'; // AutoBoxing
        System.out.println(ch);
        char chh = ch; // UnBoxing
        System.out.println(chh);
    }
    public static void main(String[] args) {
        Review_WrapperClass ew = new Review_WrapperClass();
        ew.test();
    }
}
