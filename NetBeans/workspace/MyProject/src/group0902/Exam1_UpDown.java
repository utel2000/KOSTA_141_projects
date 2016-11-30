package group0902;
import java.util.Scanner;
public class Exam1_UpDown {
    // CPU�� 1~100���� ���� �� ����.
    private int numCpu = (int) (Math.random() * 100 + 1);
    private int numUser;
    private int chk;
    Scanner sc = new Scanner(System.in);

    public void startGame() {
        System.out.println("[UP & DOWN ����]");
        while (chk < 5) {
            System.out.print((chk + 1) + "��° ��ȸ! \n5ȸ �ȿ� 1~100���� �� ��ǻ���� ���ڸ� ���纸���� : ");
            numUser = Integer.parseInt(sc.nextLine()); // ���� ���� �Է�
            if (numUser < 1 || numUser > 100) {
                System.out.println("CPU : �ùٸ� ���ڸ� �Է����ּ���.(1~100) \n��ȸ�� �������� �ʾҽ��ϴ�.");
                continue;
            } else if (numUser == numCpu) {
                System.out.println("CPU : ����! ����� �̰���ϴ�! (" + numCpu + ")");
                System.exit(0);
                break;
            } else if (numUser > numCpu) {
                System.out.println("CPU : DOWN!");
            } else if (numUser < numCpu) {
                System.out.println("CPU : UP!");
            } else {
                System.out.println("CPU : ���۵��Դϴ�. ���α׷� ������ �ʿ��մϴ�.");
            }
            chk++;
        }
        System.out.println("CPU : �й�! 5���� ��ȸ�� ��� �����Ǿ����ϴ�. (" + numCpu + ")");
    }

    public static void main(String[] args) {
        Exam1_UpDown ud = new Exam1_UpDown();
        // ���� ����!
        ud.startGame();
        System.exit(0);
    }
}
