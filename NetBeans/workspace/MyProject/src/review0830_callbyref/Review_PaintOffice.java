package review0830_callbyref;

public class Review_PaintOffice {
    private String pofficeName; // 페인트 회사
    private String orderColor; // 주문색상
    private Review_Home address; // CallByReference : 주소 값을 가짐.
    // 주문을 받는 메서드
    public void order(Review_Home address, String orderColor, String pofficeName) {
        this.orderColor = orderColor;
        this.pofficeName = pofficeName;
        this.address = address;
    }
    public void jobPaint() {
        address.setDoorColor(orderColor);
        System.out.println(pofficeName + "회사에서 작업을 마쳤습니다.");
        address.setMySaving(address.getMySaving() - 10000);
    }
}
