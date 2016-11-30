package exam;
public class ChinaCook implements OrderMenu {
    private int price;
    private String[] menu;
    public ChinaCook() { // ������ �ʱ�ȭ
        price = 10000;
        menu = resourceTypeC();
    }
    private boolean checkMenu(String m) {
        // String[] menu = [0"¥���",1"«��",2"������"]
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
            return "������ �޴��� ���׿�!(�߱���)";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("���Ͽ�").append("\n");
        sb.append("�ֹ��Ͻ� �丮 ����").append("\n");
        sb.append("�ֹ��Ͻ� �丮 : ").append(menu).append("\n");
        sb.append("���� : ").append(price).append("��").append("\n");
        sb.append("��� : ").append(OrderMenu.seasoning()).append("�� ����մϴ�.");
        return sb.toString();
    }
}
