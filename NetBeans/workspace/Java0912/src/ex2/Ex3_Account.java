package ex2;

public class Ex3_Account {

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // ���ü� ���� �߻�.
    // synchronized : ����ȭ
    // withdraw�� ȣ���ϴ� �����尡 �����ϰ� lock pool����
    // �۾��� ���� �� ���� �ٸ� �������� ������ ���� �ʴ´�.
    // �۾��� ������ �翬�� ���� �����尡 �� ���� ���� ������� ����.
    // public synchronized void withdraw(int money) {
    public void withdraw(int money) {
        synchronized (this) { // ����ȭ ���.
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
