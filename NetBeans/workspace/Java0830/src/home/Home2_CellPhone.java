package home;

public class Home2_CellPhone {

    String model;
    String color;

    void poweron() {
        System.out.println("������ �մϴ�.");
    }

    void poweroff() {
        System.out.println("������ ���ϴ�.");
    }

    void bell() {
        System.out.println("���� �︳�ϴ�.");
    }

    void sendVoice(String message) {
        System.out.println("�ڱ� : " + message);
    }

    void receiveVoice(String message) {
        System.out.println("���� : " + message);
    }

    void hangUp() {
        System.out.println("��ȭ�� �����ϴ�.");
    }
}
