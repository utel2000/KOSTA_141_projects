package exam;
public class ChinaCook implements OrderMenu {
    private int price;
    private String[] menu;
    public ChinaCook() { // 생성자 초기화
        price = 10000;
        menu = resourceTypeC();
    }
    private boolean checkMenu(String m) {
        // String[] menu = [0"짜장면",1"짬뽕",2"탕수육"]
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
            return "선택한 메뉴는 없네요!(중국어)";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("니하오").append("\n");
        sb.append("주문하신 요리 정보").append("\n");
        sb.append("주문하신 요리 : ").append(menu).append("\n");
        sb.append("가격 : ").append(price).append("원").append("\n");
        sb.append("재료 : ").append(OrderMenu.seasoning()).append("을 사용합니다.");
        return sb.toString();
    }
}
