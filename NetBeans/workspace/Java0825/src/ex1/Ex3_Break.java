package ex1;

public class Ex3_Break {
    public static void main(String[] args) {
        // break�� : �ݺ���, switch������ Ư�� ������ �����ϸ� �� ������ ���������� ���.
        for(int i=0; i<=10; i++){ // 0 ���� 10���� ���
            // if(i == 5) break; // ���⼭ ����
            System.out.println(i); // 5�� ������� �ʰ�
            if (i == 5) break; // ���⼭�� i�� 5�� ����� ����.
        }
        
        // �� �� �غ��� Exam1_WhileBreak.java
        // 1���� 100���� ����ϴ� ���α׷��� �����  while
        // ����ڰ� �Է��� ���ڿ��� break�� �ۼ��ؼ� ����ϱ�.
    }
}
