package exam;

import java.util.Scanner;

public class Exam3_C {
    // ����ʵ� ���ڿ�
    // Exam3_C r = new Exam3_C();
    // r.������� = "eodl" ���� ���� ���Ѵٰ� �����ϰ�
    // �޼��带 ����ؼ� �����ϰ� ���� �Է��ϰ� �ϰ�
    // �� �ٸ� �޼��带 ����ؼ� ���� ��ȯ �޾Ƽ� ����ϵ���
    // ���� �غ���.
    // String msg;
    // public void saveMsg(String msg) { }
    // public String returnMsg(){ return msg; }
    // ---------------------------
    // main�޼��� ���� Exam3_C r = new Exam3_C();
    // saveMsg�� ȣ���ؼ� Exam3�� ��� �ʵ忡�� ���� ����
    // returnMsg()�� ȣ���ؼ� String ���� �����޾Ƽ� ���.
    String msg;
    public void saveMsg(String m){
        msg = m + "��";
    }
    public String returnMsg(){
        return msg;
    }
    public static void main(String[] args) {
        Exam3_C ec = new Exam3_C();
        Exam3_C fc = new Exam3_C();
        Scanner sc = new Scanner(System.in);
        System.out.print("�޼����� �Է��ϼ��� : ");
        ec.saveMsg(sc.nextLine());
        System.out.println(ec.returnMsg());        
    }
}
