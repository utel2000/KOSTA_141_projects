package ex4;

public class Ex3_Sub extends  Ex3_Super{
    public void childMethod(){
        System.out.println("�ڽ� Ŭ������ �޼���!");
    }
    public static void main(String[] args) {
        // �ڽ��� ������ �ڽİ�ü�� ������ ���.
        Ex3_Sub ref1 = new Ex3_Sub();
        // ���� ������?
        ref1.parentMethod();
        ref1.childMethod();
        // �θ� �����ؼ� �ڽİ�ü�� ������ ���
        Ex3_Super ref2 = new Ex3_Sub(); // �ڽ� ��ü�� ���������� 
        ref2.parentMethod();
        // ref2.childMethod(); �ڽ��� �޼���� ȣ�� �� �� ����.
    }
}
