package ex2;

public class Ex2_Thread1 {
    // Ex1_Thread2.java를 만들고 MyData.java란 클래스를 사용해서
    // 아래의 문제를 동시성으로 동작하도록 MyData가 다른 스레드들이
    // 공유할 수 있도록 구현 해보세요. (동시성으로 구현)
    public static void main(String[] args) {
        Ex2_MyThread1 t1 = new Ex2_MyThread1();
        Ex2_MyThread1 t2 = new Ex2_MyThread1();
        t1.start();
        t2.start();
    }
}
