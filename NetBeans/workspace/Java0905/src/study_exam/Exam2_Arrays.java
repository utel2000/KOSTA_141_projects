package study_exam;

public class Exam2_Arrays {

    public static void main(String[] args) {
        int[][] num = new int[][]{
            {100, 200, 300},
            {400, 500, 600}
        };

        for (int[] i : num) {
            for (int j : i) {
                System.out.println(j);
            }
        }
    }
}
