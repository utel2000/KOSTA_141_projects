package ex1;

public class Ex1_Array {
    public static void main(String[] args) {
        String[] str = new String[3]; // 100���� ����! �迭!
        str[0] = "Test"; // 200���� ����. ������ ��ü ���� ���.
        str[1] = new String("Test"); // 300���� ����. ����� ��ü ���� ���.(new)
        // ���(C) Ǯ���� ���� ���� �� ���� ���� ������ 200���� �ּ� ���� �Ѱ���.
        str[2] = "Test"; 
        // ==�� �ּ� �� ��� [0]�� [2]�� ���� �ּҸ� ����Ų��.            
        System.out.println(str[0] == str[2]); 
    }
}
