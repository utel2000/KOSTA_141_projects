package exam;
public class KorCook implements OrderMenu {
    private int price;
    private String[] menu;
    public KorCook() { // ������ �ʱ�ȭ
        price = 100000;
        menu = resourceTypeA();
    }
    // ����ڰ� �Է��� ���� ��� ���� ���ؼ� ������ true
    private boolean checkMenu(String m) { // �ܺο� ȣ�� �� �ʿ䰡 �����Ƿ� private
        // String[] menu = [0"�����",1"���",2"��ġ�"]
        for (String e : menu) {
            if (m.equals(e)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String orderMenu(String menu) {
        if (!checkMenu(menu)) {
            return "������ �޴��� ���׿�!";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("�ȳ��ϼ��� ^^").append("\n");
        sb.append("�ֹ��Ͻ� �丮 ����").append("\n");
        sb.append("�ֹ��Ͻ� �丮 : ").append(menu).append("\n");
        sb.append("���� : ").append(price).append("��").append("\n");
        sb.append("��� : ").append(OrderMenu.seasoning()).append("�� ����մϴ�.");
        return sb.toString();
    }
}
