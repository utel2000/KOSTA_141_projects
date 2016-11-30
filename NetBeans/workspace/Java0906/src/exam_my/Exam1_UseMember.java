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
        System.out.print("아이디 입력 : ");
        vo.setId(sc.nextLine());
        System.out.print("패스워드 입력 : ");
        vo.setPwd(sc.nextLine());
        System.out.print("이름 입력 : ");
        vo.setName(sc.nextLine());
        System.out.print("나이 입력 : ");
        vo.setAge(sc.nextLine());
        inter.addMember(vo);
    }
    private String listService() {
        ArrayList<MemberVO> ar = inter.getMemberList();
        Iterator<MemberVO> it = ar.iterator();
        StringBuilder sb = new StringBuilder();
        sb.append("< 회원 리스트 >").append("\n");
        while (it.hasNext()) {
            MemberVO v = it.next();
            sb.append("회원번호 : ").append(v.getNum()).append(" / ");
            sb.append("아이디 : ").append(v.getId()).append(" / ");
            sb.append("비밀번호 : ").append(v.getPwd()).append(" / ");
            sb.append("이름 : ").append(v.getName()).append(" / ");
            sb.append("나이 : ").append(v.getAge()).append(" / ");
            sb.append("가입날짜 : ").append(v.getEdate()).append("\n");
        }
        return sb.toString();
    }
    public void execute() {
        while (true) {
            System.out.print("1:회원 가입, 2:회원 리스트, 3:종료 :");
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
