package ex1;

public class Ex7_Switch {
    public static void main(String[] args) {
        String strPosition = "����";
        
        switch(strPosition){
            case "����":
                System.out.println("700����");
                break;
            case "����":
                System.out.println("500����");
            break;
            default:
                System.out.println("300����");
        }
        
        // boolean�� switch������ ���Ұ�(��� ����)
        // String�� 6���� ���������� �ȵǰ� 7�̻� ���������� ����.
        // swtich�������� �������� �����ϴ� ����� �Ǵ� ������ ������ �� �� �ִ�.
        
        // ��������: Exam2_Menu.java��
        // Ex4_Menu.java �ڵ带 �����Ͽ� if else �� switch�� ���ļ�
        // ����� �Ϻ��ϵ��� �����Ͻÿ�.
    }
}
