package ex2;

public class PaintOffice {

    private String pofficeName; // ����Ʈ ȸ��
    private String orderColor; // �ֹ�����
    private Home address; // CallByReference : �ּ� ���� ������ �Ѵ�.(�������޹��)

    public void order(Home address, String orderColor, String pofficeName) {
        // �ֹ��� �޴� �޼���
        this.orderColor = orderColor;
        this.pofficeName = pofficeName;
        this.address = address;
    }

    public void jobPaint() {
        address.setDoorColor(orderColor);
        System.out.println(pofficeName + "ȸ�翡�� �۾��� ���ƽ��ϴ�.");
        address.setMySaving(address.getMySaving()-10000); // �߿�! ���α׷����� ���.

    }
}
