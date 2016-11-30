package ex1;

public class Ex1_Thread implements Runnable {
    @Override
    public void run() {
        // Runnable�� ��� ���� �����带 ���� ���.
        Thread t = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.println("���� ������ : " + t.getName());
            System.out.println("Status : " + t.isAlive()+", i : "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Ex1_Thread ref = new Ex1_Thread();
        Thread t = new Thread(ref);
        t.start();
//        t.join(); // t�� �۾��� �Ϸ�Ǳ� ������ main �޼����� �۾� ����.
        t.join(2000); // n�� ���ȸ� join���¸� ����.
        Thread t1 = new Thread(ref);
        t1.start();
    }
}
