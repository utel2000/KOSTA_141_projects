package ex3;
// �����ڴ� �����̸�, �� ����ؾ� �ϴ´�?
// Ŭ������ ��üȭ �ϴ� ���. new�� �����ڿ� �Բ� ����Ͽ� ȣ��.
// �̷��� �Ǹ� Ŭ������ �����ڿ� ���ؼ� �ʱ�ȭ �Ǹ� heap ������ ����.
public class Ex2_Constructor {
    private int pay;
    private String name;
    public void printMsg() {
        System.out.println("�̸� : " + name);
        System.out.println("�޿� : " + pay);
    } // �����ڸ� �����ϸ� �����Ϸ��� �⺻�����ڸ� �����س��� ����!
    public Ex2_Constructor(int pay, String name) {
        this.name = name;
        this.pay = pay;
    }
// �ܺ�Ŭ�������� ����Ŭ������ ����ϱ� ���ؼ� ����.
    public static void main(String[] args) {
        Ex2_Constructor ec;
        ec = new Ex2_Constructor(0, "hi");
        ec.printMsg();
    }
}
