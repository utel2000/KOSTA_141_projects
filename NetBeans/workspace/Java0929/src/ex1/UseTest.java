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
        System.out.print("�˻��� �μ� ��ȣ�� �Է� : ");
        String deptno = sc.nextLine();
        ArrayList<SawonVO> relist = SawonDao.getDao().sawonSearch(Integer.parseInt(deptno));
        StringBuffer sb = new StringBuffer();
        for (SawonVO e : relist) {
            sb.append(" ��ȣ :");
            sb.append(e.getSabun()).append("\n");
            sb.append(" �̸� :");
            sb.append(e.getSaname()).append("\n");
            sb.append(" ���� :");
            sb.append(e.getSajob()).append("\n");
            sb.append(" �μ���ȣ : ");
            sb.append(e.getDeptno()).append("\n");
            sb.append(" ��¥ ");
            sb.append(e.getSahire()).append("\n");
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) throws SQLException {
        UseTest u = new UseTest();
    }
}
