package exam;
// ���� �� ���� ���� 1. ĸ��ȭ, JVM�޸��� ȿ������ �ڵ�� �����丵.
// Exam_WaffleMachineUse.java�� ���� ���� ����ڵ鿡�� �ֹ��� �ް�
// �� ����� ����ϴ� ���α׷����� �ϼ�. Scanner ����
// ���� ���� �߿� �ݵ�� �ݵ�� ������ ���� ��ǥ���Ѽ� ����� �Բ� ���� ������ �� �����Դϴ�.

// �ó����� : 
// �մ��� ������ ����� ����(��, ��, ����)
// �մ��� ������ ������ ��Ȯ�� �����Ѵ�.(�Ž����� ����� ����)
// �մ��� ������ �����ϰ� �ֹ��� �Ѵ�.
public class Exam_WaffleMachine {

    int price; // private
    int qty; // private
    String shapeType; // private

    public String orderWaffle(int qty) {
        int num = 0;
        String msg = null;
        if (qty != 0 || price != 0) {
            msg += "�ֹ��Ͻ� ��ǰ�� " + shapeType + " �Դϴ�.";
            msg += "���� : " + qty;
            msg += "���� : " + price;
            msg += "���� �ݾ� : " + num + "�Դϴ�.";
        } else {
            msg += "�ֹ��Ͻ� ��ǰ�� ������ 0�̰ų�";
            msg += "������ �������� �ʾҽ��ϴ�.";
        }
        return msg;
    }
}
