package home;

public class Home2_DmbCellPhone extends Home2_CellPhone {

    int channel;

    Home2_DmbCellPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb() {
        System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
    }

    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
    }
    void turnOffDmb(){
        System.out.println("DMB ��� ������ ����ϴ�.");
    }
}
