package arrays;
public class Ex1_Array {
    // �迭�� ��� ��ü�̴�.
    // �迭�� ������ �� ũ�Ⱑ �����Ǿ�� �Ѵ�.
    // �Ϲ��ڷ���, ���� �ڷ���
    // �������迭, �������迭
    // ��������, �������� �迭
    // �迭�� ����, �����ϰ�, �ʱ�ȭ �ؾ� �Ѵ�.
    private int[] score = {75, 80, 90, 95, 100};
    public void execute(){
        // �迭�� ����
        System.out.println("�迭�� ���� : " + score.length);
        // �迭�� for������ ���
        for(int i=0; i<score.length; i++){
                //i���� ���� 0~4 ������ �迭�� �ε��� ���� ������
                System.out.println("score[" + i + "] : " + score[i]);    
        }
    }
    public void execute2(){
        // �迭�� ����
        System.out.println("�迭�� ���� : " + score.length);
        // �迭�� ���� for������ ���
        // jdk 5���ʹ� �迭, �÷��� ��� ���� for���� ����.
        for(int i : score){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Ex1_Array ref = new Ex1_Array();
        ref.execute();
        ref.execute2();
    }
}
