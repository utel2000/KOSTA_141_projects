package home;

public class Home1_KoreanExample {
    public static void main(String[] args) {
        Home1_Korean k1 = new Home1_Korean("박자바", "011225-1234567");
        System.out.println("k1.name : " + k1.getKoreanName());
        System.out.println("k1.ssn : " + k1.getKoreanSsn());
        
        Home1_Korean k2 = new Home1_Korean("김자바", "930525-0654321");
        System.out.println("k2.name : " + k2.getKoreanName());
        System.out.println("k2.ssn : " + k2.getKoreanSsn());
    }
}
