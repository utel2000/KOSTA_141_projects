package study_exam_encapsulation;
public class Exam_Vendor {
    private int stock = 20;
    public void setStock(int stock){
        this.stock = this.stock - stock;
    }
    public int getStock(){
        return stock;
    }
}
