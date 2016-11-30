package ex1;
public class Ex3_Arrays {
    public static void main(String[] args) {
        int[][] test = new int[][]{
            {1, 100},
            {20, 200, 2000, 20000}
        };
        for (int[] e : test) { // 2차원 배열
            for (int f : e) { // 1차원 배열
                System.out.println(f);
            }
        }
    }
}
