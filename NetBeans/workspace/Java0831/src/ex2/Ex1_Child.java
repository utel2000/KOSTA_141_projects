package ex2;
// �߻�޼��带 ���� �߻�Ŭ������ �ڽ��� ��ӹ��� ��
// �ݵ�� ������ �ؾ� ��Ӱ��踦 �̷� �� �ִ�.
public class Ex1_Child extends Ex1_Abstract {
    // �߻�Ŭ������ �ݵ�� extends Ex1_Absract�� ����ϰų�,
    // �͸� ����Ŭ������ ���ǰ� ���� ������ �ȵȴ�.
    // Ex1_Abstract ref = new Ex1_Abstract(); // => ����
    
    @Override
    public void moveMountain() {
        System.out.println("��������� ���� �Ű��!");
        System.out.println("���� ����� : " + getMoney());
    }
    public static void main(String[] args) {
        Ex1_Child ref = new Ex1_Child();
        ref.moveMountain();
    }
}
