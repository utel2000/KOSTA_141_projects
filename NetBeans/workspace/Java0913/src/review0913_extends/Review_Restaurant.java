package review0913_extends;
public class Review_Restaurant implements Review_InterKor{
    @Override
    public void cookKor() {
        System.out.println("����� ���Խ��ϴ�.");
    }
    @Override
    public void cookJpn() {
        System.out.println("�ʹ� ���Խ��ϴ�.");
    }
    @Override
    public void cookChn() {
        System.out.println("������ ���Խ��ϴ�.");
    }
}
