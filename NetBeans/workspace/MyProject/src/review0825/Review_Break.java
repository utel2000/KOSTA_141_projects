package review0825;

public class Review_Break {

    public static void main(String[] args) {
        // break
        System.out.println("�극��ũ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break;
                }
                System.out.println("i : " + i + " // " + "j : " + j);
            }
            System.out.println("--------------");
        }
        // breaklabel
        System.out.println("�극��ũ ��");
        exit:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break exit;
                }
                System.out.println("i : " + i + " // " + "j : " + j);
            }
            System.out.println("--------------");
        }
    }
}
