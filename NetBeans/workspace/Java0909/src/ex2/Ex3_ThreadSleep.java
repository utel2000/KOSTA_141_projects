package ex2;

public class Ex3_ThreadSleep implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
                Thread.sleep(1000); // 1초 동안 지연!
                
                Thread cur = Thread.currentThread();
                System.out.println("Current Thread Cnt : " + Thread.activeCount());
                System.out.println("Current Thread Name : " + cur.getName());
                System.out.println("Current Thread Alive : " + cur.isAlive());
                System.out.println("Current Thread Daemon : " + cur.isDaemon());
                System.out.println("Current Thread Priority : " + cur.getPriority());
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
