package ex1;

public class Ex6_MathRandom {

    public static void main(String[] args) {
        // Math : ���а��� �ڿ��� ���� Ŭ����.
        // random() : ������ ��ȯ�ϴ� �޼���.
        // Math.random()�� 0 ~ 1.0�� double�� ��ȯ.
        // <���������� �ٲ��� ���> - �Ҽ��� ���� '����'
        // ���� : 0 (1���� ��), ���� * 2 : 0���� 1���� (2���� ��),
        // ���� * 3 : 0���� 2���� (3���� ��), ...,
        // ���� * 10 : 0���� 9���� (10���� ��)
        int rNum = (int) ((Math.random() * 3)+1); // ����.
        System.out.println("rNum : " + rNum); // R: 1~3 ������ ���.        
    }
}
