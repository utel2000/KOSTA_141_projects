package review_2;
public class Main {
    public static void main(String[] args) {
        Abstract_Class ac = new Abstract_Class() {
            @Override //Ŭ���� ���� �� ������
            public void print_msg() {
                System.out.println("�츮�� C���Դϴ�.");
            }
        };
        ac.print_msg();
    }
}
