// ���� �� ���� ���� 1. ĸ��ȭ, JVM�޸��� ȿ������ �ڵ�� �����丵.
// Exam_WaffleMachineUse.java�� ���� ���� ����ڵ鿡�� �ֹ��� �ް�
// �� ����� ����ϴ� ���α׷����� �ϼ�. Scanner ����
// ���� ���� �߿� �ݵ�� �ݵ�� ������ ���� ��ǥ���Ѽ� ����� �Բ� ���� ������ �� �����Դϴ�.
// �ó����� : 
// �մ��� ������ ����� ����(��, ��, ����)
// �մ��� ������ ������ ��Ȯ�� �����Ѵ�.(�Ž����� ����� ����)
// �մ��� ������ �����ϰ� �ֹ��� �Ѵ�.
package team;

public class Exam_WaffleMachine {
    private int price;
    private int qty;
    private String shapeType;
    private String msg;
    public void setWaffle(int price, int qty, String shapeType) {
        this.price = price;
        this.qty = qty;
        this.shapeType = shapeType;
    }

    public String getWaffle() {
        return this.msg;
    }

    public void orderWaffle() {
        StringBuffer sb = new StringBuffer();
        int num = this.price * this.qty;
        if (qty != 0 || price != 0) {
            sb.append("�ֹ��Ͻ� ��ǰ�� ").append(this.shapeType).append(" �Դϴ�.\n");
            sb.append("���� : ").append(this.qty).append("\n");
            sb.append("���� : ").append(this.price).append("\n");
            sb.append("���� �ݾ� : ").append(num).append("�Դϴ�.\n");
            this.msg = sb.toString();
        } else {
            sb.append("�ֹ��Ͻ� ��ǰ�� ������ 0�̰ų� ������ �������� �ʾҽ��ϴ�.\n");
            this.msg = sb.toString();
        }
    }
}
