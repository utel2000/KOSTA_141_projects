package ex2;

public class Ex1_Thread implements Runnable {
    private int value1;
    @Override
    public void run() {
        int i = 0;
        String name = Thread.currentThread().getName();
        while(i<3){
            System.out.println(name+" 지역변수 : "+(++i));
            System.out.println(name+" 멤버필드 : "+(++value1)+""
            + " <=============S");
            System.out.println("Thread Active Cnt : " + Thread.activeCount());
        }
    }
    public static void main(String[] args) {
        Ex1_Thread ref = new Ex1_Thread();
        new Thread(ref).start();
        new Thread(ref).start();
        System.out.println("End!");
        
    }
}
