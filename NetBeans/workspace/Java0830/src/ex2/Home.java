package ex2;

import java.util.Scanner;

public class Home {

    private int mySaving = 50000; // ���������� ���� ����
    // �빮�� ������ ������ �������
    private String doorColor;

    // ����� ���� �빮�� ������ Ȯ���ϱ� ���� �޼��� ����
    public String getDoorColor() {
        return doorColor;
    }

    // �빮�� ������ �����ϱ� ���� �޼��带 ����
    public void setDoorColor(String doorColor) {
        this.doorColor = doorColor;
    }
    // mySaving�� ������ �� �ִ� �޼��带 ����
    public void setMySaving(int mySaving) {
        this.mySaving = mySaving;
    }
    // mySaving�� Ȯ���� �� �ִ� �޼��带 ����
    public int getMySaving() {
        return mySaving;
    }

    public static void main(String[] args) {

        String doorColor = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("�빮�� ������ �Է��ϼ��� : ");
        doorColor = sc.nextLine();
    }
}
