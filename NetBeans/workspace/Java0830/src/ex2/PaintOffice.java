package ex2;

public class PaintOffice {

    private String pofficeName; // 페인트 회사
    private String orderColor; // 주문색상
    private Home address; // CallByReference : 주소 값을 가져야 한다.(인자전달방식)

    public void order(Home address, String orderColor, String pofficeName) {
        // 주문을 받는 메서드
        this.orderColor = orderColor;
        this.pofficeName = pofficeName;
        this.address = address;
    }

    public void jobPaint() {
        address.setDoorColor(orderColor);
        System.out.println(pofficeName + "회사에서 작업을 마쳤습니다.");
        address.setMySaving(address.getMySaving()-10000); // 중요! 프로그래머의 사고.

    }
}
