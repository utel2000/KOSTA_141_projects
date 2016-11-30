package exam;
public interface OrderMenu {
    // 추상메서드
    public String orderMenu(String menu);
    // 상수
    public String[] aType = new String[]{"된장찌개", "백반", "김치찌개"};
    public String[] bType = new String[]{"카레", "양념카레", "난"};
    public String[] cType = new String[]{"짜장면", "짬뽕", "탕수육"};
    // static 메서드를 정의. => JDK 8버전 이상에서만 사용 가능.
    static String seasoning() {
        return "본사 특제 양념";
    }
    // default 메서드를 정의. => JDK 8버전 이상에서만 사용 가능.
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
