package exam2;
import java.util.Scanner;
public class Member {
    private String[][] member = new String[5][5];
    public void joinMember(int cnt) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[ȸ������]");
        System.out.print("���̵�: ");
        member[cnt][0] = sc.nextLine();
        System.out.print("�̸�: ");
        member[cnt][1] = sc.nextLine();
        System.out.print("��й�ȣ: ");
        member[cnt][2] = sc.nextLine();
        System.out.print("����: ");
        member[cnt][3] = sc.nextLine();
        System.out.print("��ȭ��ȣ: ");
        member[cnt][4] = sc.nextLine();
    }
    public String PrintList(int cnt) {
        System.out.println("[����Ʈ]");
        StringBuffer sb = new StringBuffer();
        String age;
        for (int i = 0; i <= cnt; i++) {
            if (Integer.parseInt(member[i][3]) < 20) {
                age = "�̼���";
            } else {
                age = "����";
            }
            String tel_num;
            if (member[i][4].substring(0, 2).equals("02")) {
                tel_num = "����";
            } else if (member[i][4].substring(0, 3).equals("031")) {
                tel_num = "���";
            } else if (member[i][4].substring(0, 3).equals("051")) {
                tel_num = "�λ�";
            } else if (member[i][4].substring(0, 3).equals("053")) {
                tel_num = "�뱸";
            } else if (member[i][4].substring(0, 3).equals("062")) {
                tel_num = "����";
            } else {
                tel_num = "�ٸ�����";
            }
            sb.append("���̵�:").append(member[i][0]).append(" / ");
            sb.append("��й�ȣ:").append(member[i][2]).append(" / ");
            sb.append("�̸�:").append(member[i][1]).append(" / ");
            sb.append(member[i][3]).append("�̸� ").append(age).append(" / ");
            if (member[i][4].substring(0, 2).equals("02")) {
                sb.append(member[i][4].substring(0, 2)).append("�� ").append(tel_num).append("\n");
            } else {
                sb.append(member[i][4].substring(0, 3)).append("�� ").append(tel_num).append("\n");
            }
        }
        return sb.toString();
    }
}
