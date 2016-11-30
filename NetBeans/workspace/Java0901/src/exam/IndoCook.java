package exam;
public class IndoCook implements OrderMenu {
    private int price;
    private String[] menu;
    public IndoCook() { // ������ �ʱ�ȭ
        price = 30000;
        menu = resourceTypeB();
    }
    private boolean checkMenu(String m) {
        // String[] menu = [0"ī��",1"���ī��",2"��"]
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
            return "������ �޴��� ���׿�!(�ε���)";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("��������").append("\n");
        sb.append("�ֹ��Ͻ� �丮 ����").append("\n");
        sb.append("�ֹ��Ͻ� �丮 : ").append(menu).append("\n");
        sb.append("���� : ").append(price).append("��").append("\n");
        sb.append("��� : ").append(OrderMenu.seasoning()).append("�� ����մϴ�.");
        return sb.toString();
    }
}
