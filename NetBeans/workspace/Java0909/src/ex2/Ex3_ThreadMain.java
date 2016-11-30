package ex2;

public class Ex3_ThreadMain {

    public static void main(String[] args) {
        Ex3_ThreadSleep ref = new Ex3_ThreadSleep();
        Thread t = new Thread(ref);
        t.start();
    }   
}