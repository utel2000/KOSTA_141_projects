package exam;
public interface OrderMenu {
    // �߻�޼���
    public String orderMenu(String menu);
    // ���
    public String[] aType = new String[]{"�����", "���", "��ġ�"};
    public String[] bType = new String[]{"ī��", "���ī��", "��"};
    public String[] cType = new String[]{"¥���", "«��", "������"};
    // static �޼��带 ����. => JDK 8���� �̻󿡼��� ��� ����.
    static String seasoning() {
        return "���� Ư�� ���";
    }
    // default �޼��带 ����. => JDK 8���� �̻󿡼��� ��� ����.
    default String[] resourceTypeA() {
        return aType;
    }
    default String[] resourceTypeB() {
        return bType;
    }
    default String[] resourceTypeC() {
        return cType;
    }
}
