package study_exam_encapsulation;
public class Exam_Customer {
    private int money = 10000;
    public void setCusMoney(int money) {
        this.money = this.money - money;
    }
    public int getCusMoney() {
        return money;
    }
}
