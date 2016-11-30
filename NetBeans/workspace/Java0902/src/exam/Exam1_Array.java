package exam;
import java.util.Arrays;
public class Exam1_Array {
    private int[][] test;
    public Exam1_Array() {
        test = new int[][]{
            {1, 100}, {20, 200, 2000, 20000}
        };
    }
    public Exam1_Array(int num, int num2) {
        test = new int[][]{
            {num,num2}, {20, 200, 2000, 20000}  
        };
    }
    public Exam1_Array(int[] data) {
        test = new int[][]{
            {1, 100}, data
        };
    }
    public String viewArray() {
        StringBuffer sb = new StringBuffer();
        for (int[] i : test) {
            for (int j : i) {
                sb.append(j).append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Exam1_Array ref1 = new Exam1_Array();
        System.out.println("Type1 : " + ref1.viewArray());
        Exam1_Array ref2 = new Exam1_Array(100, 200);
        System.out.println("Type2 : " + ref2.viewArray());
        int[] data = {30, 300, 3000, 30000, 300000};
        Exam1_Array ref3 = new Exam1_Array(data);
        System.out.println("Type3 : " + ref3.viewArray());
    }
}
