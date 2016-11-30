package review_1;
public class Main {
    private Tire[] interTire = {new HankookTire(), new KumhoTire()};
    public void useTire() {
        for (Tire e : interTire) {
            e.roll();
        }
    }
    public static void main(String[] args) {
        Main ref = new Main();
        ref.useTire();
    }
}
