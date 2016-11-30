package group0902;
import java.util.Scanner;
public class Exam1_UpDown {
    // CPU가 1~100까지 숫자 중 선택.
    private int numCpu = (int) (Math.random() * 100 + 1);
    private int numUser;
    private int chk;
    Scanner sc = new Scanner(System.in);

    public void startGame() {
        System.out.println("[UP & DOWN 게임]");
        while (chk < 5) {
            System.out.print((chk + 1) + "번째 기회! \n5회 안에 1~100까지 중 컴퓨터의 숫자를 맞춰보세요 : ");
            numUser = Integer.parseInt(sc.nextLine()); // 유저 숫자 입력
            if (numUser < 1 || numUser > 100) {
                System.out.println("CPU : 올바른 숫자를 입력해주세요.(1~100) \n기회는 소진되지 않았습니다.");
                continue;
            } else if (numUser == numCpu) {
                System.out.println("CPU : 정답! 당신이 이겼습니다! (" + numCpu + ")");
                System.exit(0);
                break;
            } else if (numUser > numCpu) {
                System.out.println("CPU : DOWN!");
            } else if (numUser < numCpu) {
                System.out.println("CPU : UP!");
            } else {
                System.out.println("CPU : 오작동입니다. 프로그램 점검이 필요합니다.");
            }
            chk++;
        }
        System.out.println("CPU : 패배! 5번의 기회가 모두 소진되었습니다. (" + numCpu + ")");
    }

    public static void main(String[] args) {
        Exam1_UpDown ud = new Exam1_UpDown();
        // 게임 시작!
        ud.startGame();
        System.exit(0);
    }
}
