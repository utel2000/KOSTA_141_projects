package review0830_callbyref;

public class Review_Home {
    private int mySaving = 50000; 
    private String doorColor;
    public String getDoorColor() { // ����� ���� �빮�� ������ Ȯ���ϴ� �޼���
        return doorColor;
    }
    public void setDoorColor(String doorColor) { // �빮�� ������ �����ϴ� �޼���
        this.doorColor = doorColor;
    }
    public void setMySaving(int mySaving) { // mySaving�� �����ϴ� �޼���
        this.mySaving = mySaving;
    }
    public int getMySaving() { // mySaving�� Ȯ���ϴ� �޼���
        return mySaving;
    }
}
