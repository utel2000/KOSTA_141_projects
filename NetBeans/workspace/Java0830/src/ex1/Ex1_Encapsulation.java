package ex1;

public class Ex1_Encapsulation {
    // ��� �ʵ�� �������ؼ� ������� ���� �����Ƿ� private�� ��κ� ���ȴ�.
    private int pay; // �ڿ��� ��������ȭ
    public int checkTeam(String pwd, int pay) {
        // ����ڿ��� ��й�ȣ(test12)�� �Է� �޾Ƽ� ������ pay�� ���� ����.
        if (!pwd.equals("test12")) {
            System.out.println("����� ������ �� ������!");
            System.exit(0); // ���α׷� ����
        } else { // ��й�ȣ�� ��Ȯ�ϰ� �Է��� ���
            System.out.println("�ݰ����ϴ�. A����!");
            this.pay = pay;
        }
        return this.pay;
    }
}
