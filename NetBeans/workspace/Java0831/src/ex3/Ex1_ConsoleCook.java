package ex3;

public class Ex1_ConsoleCook extends Ex1_CookAbstract {
    @Override
    public void korCook(String orderName) {
        System.out.println("�ѽ� ���Խ��ϴ�.");
    }
    @Override
    public void indoCook(String orderName) {
        System.out.println("�ε��� ���Խ��ϴ�.");
    }
    @Override
    public void jpCook(String orderName) {
        System.out.println("�Ͻ� ���Խ��ϴ�.");
    }
}
