package review0830_callbyref;

public class Review_UseDoorPaint {
    public static void main(String[] args) {
        Review_Home h = new Review_Home();
        // 2] Aȸ�翡�� �빮����� �ּҸ� ����
        Review_PaintOffice aOff = new Review_PaintOffice();
        // �ֹ��� �� �� �ּҸ� ���� ���� (�߿�)
        aOff.order(h, "�ݻ�", "A ����Ʈ ȸ��"); // CallByReference
        aOff.jobPaint();
        // 3] Bȸ�翡�� �빮����� �ּ� ����.
        Review_PaintOffice bOff = new Review_PaintOffice();
        bOff.order(h, "������", "B ����Ʈ ȸ��"); // CallByReference
        bOff.jobPaint();
        // ��� �� ��� Ȯ��
        System.out.println("��� �Ŀ� �Ͱ��ؼ� �빮�� Ȯ��.");
        System.out.println("�빮���� : " + h.getDoorColor());
        System.out.println("�ܰ� Ȯ�� �Ф� : " + h.getMySaving());
    }
}
