package ex1;
import exam.Exam_SuperB;
public class Ex1_MemberInner {
    // ���������ڿ� ���� ����
    int a = 10;
    private int b = 200;
    static int c = 300;
    // �������
    class Inner extends Exam_SuperB { // �������Ŭ����
        public void printData(){
            System.out.println("int a : " + a);
            // ����Ŭ������ �ܺ�Ŭ������ private�� ���� ����.
            // (��ӵ� Ŭ���������� ���ϴ� ��.)
            System.out.println("private int b : "+b);
        }
    }
    public static void main(String[] args) {
        // �ܺ� Ŭ������ ���� �����ϰ�
        // Ex1_MemberInner out = new Ex1_MemberInner();
        // ���� Ŭ������ �����Ѵ�.
        // Ex1_MemberInner.Inner inner = out.new Inner();
        // inner.printData();
        // �ܺ� Ŭ���� �������� �ʰ� �� �ٷ� ���� Ŭ���� ���� �غ���
        Ex1_MemberInner.Inner inner = new Ex1_MemberInner().new Inner();
        inner.printData();
    }
}
