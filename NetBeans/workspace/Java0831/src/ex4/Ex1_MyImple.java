package ex4;
// �������̽��� �����ϴ� Ŭ������ implements Ű���带 ����ؼ� �����Ѵ�.
// Ŭ������, �߻�Ŭ������ ��� �޴� extends�ʹ� �����ȴ�.
// 1) ���� ���� ����. implements InterA, InterB
// 2) extends�� �Բ� ��� ���� extends Container implements MenuInter
// 3) �������̽� ������ ���� ��� ���� interface Sub_Inter extends InterA, InterB
public class Ex1_MyImple implements Ex1_MyInter{
    @Override
    public void test() {
    }
    @Override
    public String msg() {
        return "A";
    }
    public static void main(String[] args) {
        // �������̽��� ����ϴ� ������ �����ϱ��?
        // �������̽��� ��üȭ ���� (�޴��� ��üȭ �ϸ� ������ �ȴ�?)
        // �������̽��� �޴����� �Ǳ� ���ؼ��� ����.
        // �����⸦ �����ְ� ��üȭ. ����ڿ��� �����⸸ ����.
        // �������̽������� ���߻���� �ȴ�.
        // �������̽��� ���� : �߻�޼���, ��� (JDK 7����)
        // JDK 8�������� Default �޼���, ����ƽ �޼��� ��� ����.
        Ex1_MyInter menu = new Ex1_MyImple();
    }
}
