package ex2;

import java.util.Scanner;

public class UseDoorPaint {

    public static void main(String[] args) {
        // 1. ù��° ȸ�翡�� Ȳ�ݻ� �빮�� ��û
        // 2. ���� ���� - �������� (�ڵ���ü)
        // 3. ������ �����غ��� ��! ���� ���� �ؾ߰ڴ�.
        // �ڽŵ� �𸣰� �ι�° ȸ�翡�� ������ �빮�� ��û
        // 4. ���� ���� - �������� (�ڵ���ü)
        // 5. ��� �� Ȯ�� (���������� ����)
        // CallByReference�� ��ü�� �ּҸ� ���� �ϴ� ���̸�
        // �� ��ü�� �ϳ��� ��ü�� �ּҸ� �����ؼ� ���.
        //Start
        // 1] Home��ü ����
        Home h = new Home();
        // 2] Aȸ�翡�� �빮����� �ּҸ� ����
        PaintOffice aOff = new PaintOffice();
        // �ֹ��� �� �� �ּҸ� ���� *****
        aOff.order(h, "�ݻ�", "A ����Ʈ ȸ��"); // CallByReference
        aOff.jobPaint();
        // 3] Bȸ�翡�� �빮����� �ּ� ����.
        PaintOffice bOff = new PaintOffice();
        bOff.order(h, "������", "B ����Ʈ ȸ��"); // CallByReference
        bOff.jobPaint();
        // ��� �� ��� Ȯ��
        System.out.println("��� �Ŀ� �Ͱ��ؼ� �빮�� Ȯ��.");
        System.out.println("�빮���� : " + h.getDoorColor());
        // ���� �غ���
        System.out.println("�ܰ� Ȯ�� �Ф� : " + h.getMySaving());
    }

}
