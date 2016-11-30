package ex1;
public class Ex1_Test {
    public static void main(String[] args) {
        Ex1_Encapsulation ee = new Ex1_Encapsulation();       
        int resPay = ee.checkTeam("test12", 1000); // 비밀번호 test12 / 1000
        System.out.println(resPay);
    }
}
