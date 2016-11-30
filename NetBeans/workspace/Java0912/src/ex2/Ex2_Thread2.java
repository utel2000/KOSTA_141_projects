package ex2;

public class Ex2_Thread2 extends Thread {

    private Ex2_MyData d;

    public Ex2_Thread2(Ex2_MyData d) {
        this.d = d;
    }

    @Override
    public void run() {
        int i = 0;
        // 현재 스레드의 이름을 저장
        String name = Thread.currentThread().getName();
        while (i < 3) {
            System.out.println(name + " 지역변수 : " + (++i));
            System.out.println(name + " 멤버필드 : " + (d.getValue()));
            System.out.println("Thread Active Cnt : " + Thread.activeCount());
        }
    }
    public static void main(String[] args) {
        // 하나의 객체를 공유하는 스레드!
        Ex2_MyData d = new Ex2_MyData();
        Ex2_Thread2 ref = new Ex2_Thread2(d);
        Ex2_Thread2 ref2 = new Ex2_Thread2(d);
        ref.start();
        ref2.start();
    }
}
