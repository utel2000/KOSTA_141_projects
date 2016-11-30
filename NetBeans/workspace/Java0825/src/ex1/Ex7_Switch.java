package ex1;

public class Ex7_Switch {
    public static void main(String[] args) {
        String strPosition = "과장";
        
        switch(strPosition){
            case "부장":
                System.out.println("700만원");
                break;
            case "과장":
                System.out.println("500만원");
            break;
            default:
                System.out.println("300만원");
        }
        
        // boolean은 switch문에서 사용불가(모든 버전)
        // String은 6이하 버전에서는 안되고 7이상 버전에서는 가능.
        // swtich문에서는 정수값을 산출하는 연산식 또는 정수형 변수가 올 수 있다.
        
        // 연습문제: Exam2_Menu.java에
        // Ex4_Menu.java 코드를 복사하여 if else 를 switch로 고쳐서
        // 기능이 완벽하도록 구현하시오.
    }
}
