package review0830_callbyref;

public class Review_UseDoorPaint {
    public static void main(String[] args) {
        Review_Home h = new Review_Home();
        // 2] A회사에게 대문색상과 주소를 전달
        Review_PaintOffice aOff = new Review_PaintOffice();
        // 주문을 할 때 주소를 같이 전달 (중요)
        aOff.order(h, "금색", "A 페인트 회사"); // CallByReference
        aOff.jobPaint();
        // 3] B회사에게 대문색상과 주소 전달.
        Review_PaintOffice bOff = new Review_PaintOffice();
        bOff.order(h, "빨간색", "B 페인트 회사"); // CallByReference
        bOff.jobPaint();
        // 퇴근 후 결과 확인
        System.out.println("퇴근 후에 귀가해서 대문색 확인.");
        System.out.println("대문색상 : " + h.getDoorColor());
        System.out.println("잔고 확인 ㅠㅠ : " + h.getMySaving());
    }
}
