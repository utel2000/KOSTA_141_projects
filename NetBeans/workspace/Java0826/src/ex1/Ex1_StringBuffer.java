package ex1;

public class Ex1_StringBuffer {
    public static void main(String[] args) {
        // ������ ���̰� �þ�� ������ �⺻���� �������θ�
        // ���� �ϰ� ������ �ȴ�. ���� ������ ���ڿ��� �����صδ�
        // �� ������ �����ϰ� ������ �ȴ�.
        // ���� x���� �� ������ 'x + �⺻ �뷮(16)'�� �⺻ �뷮���� �ش�.
        // "new StringBuffer("��浿")���� �ϸ� sb.capacity()�� 19�� ���.
        StringBuffer sb = new StringBuffer("��浿"); 
        System.out.println("�뷮1 : "+sb.capacity()); // R: 19; �⺻: 16
        System.out.println("����1 : "+sb.length()); // R: 3; �⺻: 0
        for(int i=1;i<=17;i++){
            sb.append(i);
        }
        System.out.println("����2 : "+sb.length()); // R: 28
        System.out.println("�뷮1 : "+sb.capacity()); // R: 40
    }
}
