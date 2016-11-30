package exam_my;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Exam1_UseMember {
    private Scanner sc;
    private Exam1_MemberInter inter;
    public Exam1_UseMember() {
        sc = new Scanner(System.in); 
        inter = new Exam1_Member();
    }
    private void addService() {
        MemberVO vo = new MemberVO();
        System.out.print("���̵� �Է� : ");
        vo.setId(sc.nextLine());
        System.out.print("�н����� �Է� : ");
        vo.setPwd(sc.nextLine());
        System.out.print("�̸� �Է� : ");
        vo.setName(sc.nextLine());
        System.out.print("���� �Է� : ");
        vo.setAge(sc.nextLine());
        inter.addMember(vo);
    }
    private String listService() {
        ArrayList<MemberVO> ar = inter.getMemberList();
        Iterator<MemberVO> it = ar.iterator();
        StringBuilder sb = new StringBuilder();
        sb.append("< ȸ�� ����Ʈ >").append("\n");
        while (it.hasNext()) {
            MemberVO v = it.next();
            sb.append("ȸ����ȣ : ").append(v.getNum()).append(" / ");
            sb.append("���̵� : ").append(v.getId()).append(" / ");
            sb.append("��й�ȣ : ").append(v.getPwd()).append(" / ");
            sb.append("�̸� : ").append(v.getName()).append(" / ");
            sb.append("���� : ").append(v.getAge()).append(" / ");
            sb.append("���Գ�¥ : ").append(v.getEdate()).append("\n");
        }
        return sb.toString();
    }
    public void execute() {
        while (true) {
            System.out.print("1:ȸ�� ����, 2:ȸ�� ����Ʈ, 3:���� :");
            String menu = sc.nextLine();
            if (menu.equals("1")) {
                addService();
            } else if (menu.equals("2")) {
                System.out.println(listService());
            } else if (menu.equals("3")) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Exam1_UseMember ref = new Exam1_UseMember();
        ref.execute();
    }
}
