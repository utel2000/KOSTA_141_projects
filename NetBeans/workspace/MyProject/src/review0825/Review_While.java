package review0825;

public class Review_While {

    public static void main(String[] args) {
        int i = 1; // 초기식
        while (i <= 5) { // 조건식
            System.out.print(i + " "); // 실행문, R: 1 2 3 4 5
            i++; // 증감식
        }
        System.out.println();
        System.out.println("i값 : " + i); // R: i값 : 6

        do {
            System.out.print(i + " ");
            i++;

        } while (i <= 5);
        System.out.println("");
        System.out.println("i값 : " + i);
    }
}
