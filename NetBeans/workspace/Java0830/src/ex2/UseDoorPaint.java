package ex2;

import java.util.Scanner;

public class UseDoorPaint {

    public static void main(String[] args) {
        // 1. 첫번째 회사에게 황금색 대문을 요청
        // 2. 돈을 지불 - 여러분이 (자동이체)
        // 3. 곰곰히 생각해보니 아! 색을 변경 해야겠다.
        // 자신도 모르게 두번째 회사에게 빨간색 대문을 요청
        // 4. 돈을 지불 - 여러분이 (자동이체)
        // 5. 퇴근 후 확인 (빨간색임을 만족)
        // CallByReference는 객체의 주소를 전달 하는 것이며
        // 두 객체가 하나의 객체의 주소를 공유해서 사용.
        //Start
        // 1] Home객체 생성
        Home h = new Home();
        // 2] A회사에게 대문색상과 주소를 전달
        PaintOffice aOff = new PaintOffice();
        // 주문을 할 때 주소를 전달 *****
        aOff.order(h, "금색", "A 페인트 회사"); // CallByReference
        aOff.jobPaint();
        // 3] B회사에게 대문색상과 주소 전달.
        PaintOffice bOff = new PaintOffice();
        bOff.order(h, "빨간색", "B 페인트 회사"); // CallByReference
        bOff.jobPaint();
        // 퇴근 후 결과 확인
        System.out.println("퇴근 후에 귀가해서 대문색 확인.");
        System.out.println("대문색상 : " + h.getDoorColor());
        // 구현 해보기
        System.out.println("잔고 확인 ㅠㅠ : " + h.getMySaving());
    }

}
