package ex2;

public class Ex1_Thread extends Thread{
    // �����忡�� ��ų ���� ���� (run�޼���)
    @Override
    public void run(){
        System.out.println("Thread ����!");
        for(int i=0; i<5; i++){
            System.out.println("Current Thread : " + getName());
        }
//        try{
//            throw new InterruptedException();
//        }catch(InterruptedException ex){
//            ex.printStackTrace(); // ���� �߻� �޼����� main�� ����!(������ ����)
//        }
    }
    public static void main(String[] args) {
        System.out.println("���� �޼��� ����");
        Ex1_Thread ref = new Ex1_Thread();
//        ref.run(); // Thread���� ���� ��Ų �޼��尡 �ƴ�
        ref.start(); // �����忡�� ���� ��Ű�� ���� �޼���
        System.out.println("���� �޼��� ����!");
        // ref.start(); // �ȵ�! ������� �����ֱ⸦ ������ �ֱ� ����.
        // �� �� ���� -> ���� -> ���� �Ǹ� �ٽ� ���� �� �� ����.
    }
}
