package ex2;

import java.util.Scanner;

public class Home {

    private int mySaving = 50000; // 연습문제를 위한 변수
    // 대문의 색상을 저장할 멤버변수
    private String doorColor;

    // 멤버에 기억된 대문의 색상을 확인하기 위한 메서드 정의
    public String getDoorColor() {
        return doorColor;
    }

    // 대문의 색상을 설정하기 위한 메서드를 정의
    public void setDoorColor(String doorColor) {
        this.doorColor = doorColor;
    }
    // mySaving을 저장할 수 있는 메서드를 정의
    public void setMySaving(int mySaving) {
        this.mySaving = mySaving;
    }
    // mySaving을 확인할 수 있는 메서드를 정의
    public int getMySaving() {
        return mySaving;
    }

    public static void main(String[] args) {

        String doorColor = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("대문의 색상을 입력하세요 : ");
        doorColor = sc.nextLine();
    }
}
