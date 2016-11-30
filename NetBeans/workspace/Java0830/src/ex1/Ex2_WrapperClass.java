package ex1;
// �ٽ�����Ʈ) �Ϲ� �ڷ����� ��üȭ ���Ѽ� �������ִ� API
// �Ϲ��ڷ����� ���õ� ����(���ҽ�, �޼���, �Ӽ�)�� ������ �����ν�
// ������, ������ ����. String Ŭ����ó�� ���� �����ϴ� ��ü�� ����
// WrapperClass�� �Ϲ��ڷ����� ������ �ִ� Ŭ�����̴�.(Integer, Boolean ��)
// ����!(�������ü�������, ������(�Ϲ���)��ü�������)
// AutoBoxing�� Stringó�� ��������ü��������� ���� ��.
// UnBoxing�� ��üȭ �� ���� �Ϲ� �ڷ������� �ٽ� �ǵ����� ��.
// jdk 5���� �̻���� �������ִ� ����� AutoBoxing, UnBoxing.

public class Ex2_WrapperClass {

    public void test() {
        Integer num1 = Integer.parseInt("10");
        System.out.println("num1 = " + num1);
        // ����� ��ü ���� (5 ���Ͽ��� ���)
        Integer num2v = new Integer("100");
        // AutoBoxing (5�̻󿡼� ���)
        Integer num3v = 1000;
    }

    public void test2() {
        // �����ؼ�
        // AutoBoxing���� �� �Ϲ� �ڷ����� Wrapper Ŭ������
        // ����ؼ� ���� ������ �� ����غ���.
        Boolean b = true;
        System.out.println(b);
        // WrapperClass�� -> �Ϲ��ڷ������� �ٲٴ� �� : UnBoxing
        boolean bb = b;
        // �ٸ� �ڷ��� �� �غ���
        Byte by = 10;
        System.out.println(by);
        byte byy = by;
        Short sh = 100;
        System.out.println(sh);
        short shh = sh;
        Long lo = 1000l;
        System.out.println(lo);
        long loo = lo;
        Float fl = 100.0f;
        System.out.println(fl);
        float fll = fl;
        Double dou = 1000.00;
        System.out.println(dou);
        double douu = dou;

    }

    public static void main(String[] args) {
        Ex2_WrapperClass ew = new Ex2_WrapperClass();
        ew.test();
        ew.test2();
    }
}
