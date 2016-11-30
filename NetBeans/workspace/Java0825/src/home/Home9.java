package home;
//   1   2   3   4   5   6   7   8   9   10
//   2   4   6   8  10  12  14  16  18   20
//   3   6   9   .   .   .   .   .   .    .
//   4   8   .  16   .   .   .   .   .    .
//   5  10   .   .  25   .   .   .   .    .
//   6  12   .   .   .  36   .   .   .    .
//   7  14   .   .   .   .  49   .   .    .
//   8  16   .   .   .   .   .  64   .    .
//   9  18   .   .   .   .   .   .  81    .
//  10  20   .   .   .   .   .   .   .  100
public class Home9 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i * j < 10) {
                    System.out.print("  ");
                }else if(i * j < 100){
                    System.out.print(" ");
                }
                System.out.print(i * j + " ");

            }
            System.out.println();
        }
    }
}
