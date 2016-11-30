package ex2;

public class Ex2_MyThread1 extends Thread{
    private int value1;

    @Override
    public void run() {
        int i=0;
        // 현재 스레드의 이름을 저장
        String name = Thread.currentThread().getName();
        while(i<3){
            System.out.println(name+" 지역변수 : "+(++i));
            System.out.println(name+" 멤버필드 : "+(++value1));
            System.out.println("Thread Active Cnt : "+Thread.activeCount());
        }
    }
    
}
