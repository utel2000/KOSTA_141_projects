package ex1;

public class Ex11_CountDown {

    public static void main(String[] args) throws InterruptedException {
        int i = 10;
        /*
        while (i<=10) {
            Thread.sleep(1000);
            System.out.println(i);
            i++;
        }
         */

        // ��������: do while�� start! ���� �־ �������� ���ڰ� �����ϴ� ī��Ʈ�ٿ� ������.
        do {
            if (i == 11) {
                System.out.println("Start!");
            } else {
                Thread.sleep(1000);
                System.out.println(i);
            }
            i--;
        } while (i >= 0);
    }
}
