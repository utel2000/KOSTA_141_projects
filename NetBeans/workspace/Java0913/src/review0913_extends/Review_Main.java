package review0913_extends;
public class Review_Main {
    private Review_InterKor inter;
    public Review_Main() {
        inter = new Review_Restaurant();
    }
    public void cook() {
        inter.cookKor();
        inter.cookJpn();
        inter.cookChn();
    }
    public static void main(String[] args) {
        Review_Main ref = new Review_Main();
        ref.cook();
    }
}
