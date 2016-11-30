package review0825;

public class Review_ForFor {
    public static void main(String[] args) {
        // 구구단 2단부터 9단까지
        for (int i = 0; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                if(i==0)
                   System.out.print("    " + j + "단\t\t");
                else
                    System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.println("");
        }
    }
}
