package ex1;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import vo.SawonVO;
public class UseTest {
    Scanner sc = new Scanner(System.in);
    public UseTest() throws SQLException {
        menu();
    }
    private void menu() throws SQLException {
        System.out.print("검색할 부서 번호를 입력 : ");
        String deptno = sc.nextLine();
        ArrayList<SawonVO> relist = SawonDao.getDao().sawonSearch(Integer.parseInt(deptno));
        StringBuffer sb = new StringBuffer();
        for (SawonVO e : relist) {
            sb.append(" 번호 :");
            sb.append(e.getSabun()).append("\n");
            sb.append(" 이름 :");
            sb.append(e.getSaname()).append("\n");
            sb.append(" 직업 :");
            sb.append(e.getSajob()).append("\n");
            sb.append(" 부서번호 : ");
            sb.append(e.getDeptno()).append("\n");
            sb.append(" 날짜 ");
            sb.append(e.getSahire()).append("\n");
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) throws SQLException {
        UseTest u = new UseTest();
    }
}
