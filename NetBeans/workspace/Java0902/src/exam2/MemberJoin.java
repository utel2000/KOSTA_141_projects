package exam2;
import java.util.Scanner;
public class MemberJoin {
    public static void main(String[] args) {
        int count = 0;
        Member mb = new Member();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("1.����, 2.����Ʈ, 3.���� : ");
            int su = Integer.parseInt(sc.nextLine());
            switch (su) {
                case 1:
                    if (count > 4) {
                        System.out.println("\tȸ������ ���� �ʰ�");
                        break;
                    } else {
                        mb.joinMember(count);
                        count++;
                        break;
                    }
                case 2:
                    System.out.println(mb.PrintList(count - 1));
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\t���� �ٽ� �Է����ּ���^0^");
            }
        }
    }
}
