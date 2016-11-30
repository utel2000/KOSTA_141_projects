package review_3;
public class Tt { // 클래스
    private int myMoney; // 멤버 필드(변수)
    public Tt() { // 생성자(객체 생성시 제일 먼저 실행)
        myMoney = 10000;
    }
    int getMyMoney() { // 메서드(동작)
        return myMoney;
    }
    public static void main(String[] args) { // 메인 메서드
        Tt yeji = new Tt(); // 클래스 객체화
        System.out.println("예지 통장의 잔금은 "
                + yeji.getMyMoney() + "원 입니다.");
    }
}
