package ex1;

public class Ex5_Switch {

    // if�� ���ٴ� �������� ����ϴ�.
    public static void main(String[] args) {
        int num = 10;
        switch (num) {
            case 10:
                System.out.println("10�̴ϱ� ����.");
                break; // break�� ������ �Ʒ��� �ٸ� ������ ���๮���� ����.
                       // �� ��� break�� �����ų� ������ �ٱ��� ����.
            case 20:
                System.out.println("20�̴ϱ� ����.");
                break;
            default:
                System.out.println("10, 20�� �ƴϴϱ� ����.");
        }
    }
}
