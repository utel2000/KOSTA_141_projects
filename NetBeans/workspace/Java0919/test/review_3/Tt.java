package review_3;
public class Tt { // Ŭ����
    private int myMoney; // ��� �ʵ�(����)
    public Tt() { // ������(��ü ������ ���� ���� ����)
        myMoney = 10000;
    }
    int getMyMoney() { // �޼���(����)
        return myMoney;
    }
    public static void main(String[] args) { // ���� �޼���
        Tt yeji = new Tt(); // Ŭ���� ��üȭ
        System.out.println("���� ������ �ܱ��� "
                + yeji.getMyMoney() + "�� �Դϴ�.");
    }
}
