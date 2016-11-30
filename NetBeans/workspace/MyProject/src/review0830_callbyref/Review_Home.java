package review0830_callbyref;

public class Review_Home {
    private int mySaving = 50000; 
    private String doorColor;
    public String getDoorColor() { // 멤버에 기억된 대문의 색상을 확인하는 메서드
        return doorColor;
    }
    public void setDoorColor(String doorColor) { // 대문의 색상을 설정하는 메서드
        this.doorColor = doorColor;
    }
    public void setMySaving(int mySaving) { // mySaving을 저장하는 메서드
        this.mySaving = mySaving;
    }
    public int getMySaving() { // mySaving을 확인하는 메서드
        return mySaving;
    }
}
