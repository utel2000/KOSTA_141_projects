package review0830_callbyref;

public class Review_PaintOffice {
    private String pofficeName; // ����Ʈ ȸ��
    private String orderColor; // �ֹ�����
    private Review_Home address; // CallByReference : �ּ� ���� ����.
    // �ֹ��� �޴� �޼���
    public void order(Review_Home address, String orderColor, String pofficeName) {
        this.orderColor = orderColor;
        this.pofficeName = pofficeName;
        this.address = address;
    }
    public void jobPaint() {
        address.setDoorColor(orderColor);
        System.out.println(pofficeName + "ȸ�翡�� �۾��� ���ƽ��ϴ�.");
        address.setMySaving(address.getMySaving() - 10000);
    }
}
