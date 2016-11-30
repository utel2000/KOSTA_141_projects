package exam2;
import java.util.Scanner;
public class Member {
    private String[][] member = new String[5][5];
    public void joinMember(int cnt) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[회원가입]");
        System.out.print("아이디: ");
        member[cnt][0] = sc.nextLine();
        System.out.print("이름: ");
        member[cnt][1] = sc.nextLine();
        System.out.print("비밀번호: ");
        member[cnt][2] = sc.nextLine();
        System.out.print("나이: ");
        member[cnt][3] = sc.nextLine();
        System.out.print("전화번호: ");
        member[cnt][4] = sc.nextLine();
    }
    public String PrintList(int cnt) {
        System.out.println("[리스트]");
        StringBuffer sb = new StringBuffer();
        String age;
        for (int i = 0; i <= cnt; i++) {
            if (Integer.parseInt(member[i][3]) < 20) {
                age = "미성년";
            } else {
                age = "성년";
            }
            String tel_num;
            if (member[i][4].substring(0, 2).equals("02")) {
                tel_num = "서울";
            } else if (member[i][4].substring(0, 3).equals("031")) {
                tel_num = "경기";
            } else if (member[i][4].substring(0, 3).equals("051")) {
                tel_num = "부산";
            } else if (member[i][4].substring(0, 3).equals("053")) {
                tel_num = "대구";
            } else if (member[i][4].substring(0, 3).equals("062")) {
                tel_num = "광주";
            } else {
                tel_num = "다른나라";
            }
            sb.append("아이디:").append(member[i][0]).append(" / ");
            sb.append("비밀번호:").append(member[i][2]).append(" / ");
            sb.append("이름:").append(member[i][1]).append(" / ");
            sb.append(member[i][3]).append("이면 ").append(age).append(" / ");
            if (member[i][4].substring(0, 2).equals("02")) {
                sb.append(member[i][4].substring(0, 2)).append("면 ").append(tel_num).append("\n");
            } else {
                sb.append(member[i][4].substring(0, 3)).append("면 ").append(tel_num).append("\n");
            }
        }
        return sb.toString();
    }
}
