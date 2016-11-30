package ex2;

public class Ex3_Account {

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // 동시성 문제 발생.
    // synchronized : 동기화
    // withdraw를 호출하는 스레드가 안전하게 lock pool에서
    // 작업을 끝날 때 까지 다른 스레드의 간섭을 받지 않는다.
    // 작업이 끝나면 당연히 다음 스레드가 이 일을 같은 방식으로 진행.
    // public synchronized void withdraw(int money) {
    public void withdraw(int money) {
        synchronized (this) { // 동기화 블록.
            if (balance >= money) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                balance -= money;
            }
        }
    }

}
