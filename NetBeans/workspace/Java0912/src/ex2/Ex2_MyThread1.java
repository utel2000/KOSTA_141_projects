package ex2;

public class Ex2_MyThread1 extends Thread{
    private int value1;

    @Override
    public void run() {
        int i=0;
        // ���� �������� �̸��� ����
        String name = Thread.currentThread().getName();
        while(i<3){
            System.out.println(name+" �������� : "+(++i));
            System.out.println(name+" ����ʵ� : "+(++value1));
            System.out.println("Thread Active Cnt : "+Thread.activeCount());
        }
    }
    
}
