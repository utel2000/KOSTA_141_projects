package ex1;
public class Ex3_AnonyInner {

    // Member �͸� ����Ŭ������ �����ϱ�
    Ex3_TestInter ref = new Ex3_TestInter() {
        @Override
        public void printData() {
            System.out.println("�׽�Ʈ! ����Դϴ�.");
        }
    };
// local �ȿ� �ۼ��غ���
    public void test() {
        new Ex3_TestInter() { // �̷� ���� ����! ���� ö��.
            public void printData() {
                System.out.println("�׽�Ʈ! �����Դϴ�.");
            }
        }.printData();
    }
    
    public static void main(String[] args) {
        Ex3_AnonyInner r = new Ex3_AnonyInner();
        r.ref.printData();
        r.test();
    }
}
