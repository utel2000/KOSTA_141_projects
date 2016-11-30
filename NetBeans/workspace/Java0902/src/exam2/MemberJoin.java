package exam2;
import java.util.Scanner;
public class MemberJoin {
    public static void main(String[] args) {
        int count = 0;
        Member mb = new Member();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("1.가입, 2.리스트, 3.종료 : ");
            int su = Integer.parseInt(sc.nextLine());
            switch (su) {
                case 1:
                    if (count > 4) {
                        System.out.println("\t회원가입 정원 초과");
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
                    System.out.println("\t값을 다시 입력해주세요^0^");
            }
        }
    }
}
