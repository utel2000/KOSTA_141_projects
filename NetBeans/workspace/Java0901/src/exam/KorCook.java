package exam;
public class KorCook implements OrderMenu {
    private int price;
    private String[] menu;
    public KorCook() { // 생성자 초기화
        price = 100000;
        menu = resourceTypeA();
    }
    // 사용자가 입력한 값과 상수 값을 비교해서 맞으면 true
    private boolean checkMenu(String m) { // 외부에 호출 할 필요가 없으므로 private
        // String[] menu = [0"된장찌개",1"백반",2"김치찌개"]
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
            return "선택한 메뉴는 없네요!";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("안녕하세요 ^^").append("\n");
        sb.append("주문하신 요리 정보").append("\n");
        sb.append("주문하신 요리 : ").append(menu).append("\n");
        sb.append("가격 : ").append(price).append("원").append("\n");
        sb.append("재료 : ").append(OrderMenu.seasoning()).append("을 사용합니다.");
        return sb.toString();
    }
}
