package ex2;

public class Ex4_ATMTwo implements Runnable {

    private long dMoney;

    public Ex4_ATMTwo(long dMoney) {
        this.dMoney = dMoney;
    }

    @Override
    public void run() {
            synchronized (this) { // 동기화 블록으로 동기화 적용 영역을 지정할 수 있음.
            for (int i = 0; i < 10; i++) {
                if (dMoney < 0) {
                    break;
                }
                withDraw(1000);
                if (dMoney == 2000 || dMoney == 4000 || dMoney == 6000 || dMoney == 8000) {
                    try {
                        // WaitPool로 이동.
                        // wait() : 동기화에만 사용하는 메서드.
                        this.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    // LockPool로 이동.
                    this.notify();
                }
            }
        }
    }

    // 엄마/아들 스레드가 각각  여기 메서드를 호출하는 형태.
    private void withDraw(int howMuch) {
        if (dMoney > 0) {
            dMoney -= howMuch;
            System.out.println("----------------------------------");
            System.out.println(Thread.currentThread().getName());
            System.out.println("잔액 : " + dMoney);
        } else {
            System.out.println("----------------------------------");
            System.out.println(Thread.currentThread().getName());
            System.out.println("잔액이 부족합니다.");
        }
    }

}
