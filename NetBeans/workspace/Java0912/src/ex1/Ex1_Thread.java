package ex1;

public class Ex1_Thread implements Runnable {
    @Override
    public void run() {
        // Runnable일 경우 현재 스레드를 얻어내는 방법.
        Thread t = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.println("현재 스레드 : " + t.getName());
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
//        t.join(); // t의 작업이 완료되기 전까지 main 메서드의 작업 정지.
        t.join(2000); // n초 동안만 join상태를 유지.
        Thread t1 = new Thread(ref);
        t1.start();
    }
}
