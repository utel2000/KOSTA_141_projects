package ex2;

public class Ex4_ATMTwoMain {
    public static void main(String[] args) {
        Ex4_ATMTwo atm = new Ex4_ATMTwo(10000);
        Thread mother = new Thread(atm, "mother");
        Thread son = new Thread(atm, "son");
        mother.start();
        son.start();
    }
}
