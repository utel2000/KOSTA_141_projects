package review0824;

public class Review_Oper4 {
    public static void main(String[] args) {
        int charCode = 'A';

        if ((charCode >= 65) & (charCode <= 90)) { // &나 |는 참, 거짓이 결정되어도
            System.out.println("대문자 이군요.");   // 항상 양쪽 조건을 다 확인한다.(비효율적)
        }
        if ((charCode >= 97) && (charCode <= 22)) { // 반면 &&나 ||는 참, 거짓이 결정되면
            System.out.println("소문자 이군요."); // 나머지 쪽을 확인하지 않고 넘어간다.(효율적)
        }
        if (!(charCode < 48) && !(charCode > 57)) {
            System.out.println("0~9 숫자 이군요.");
        }
        int value = 6;
        if ((value%2== 0) | (value%3== 0)) {
            System.out.println("2 또는 3의 배수 이군요.");
        }
        if ((value%2== 0) || (value%3== 0)) {
            System.out.println("2 또는 3의 배수 이군요.");
        }
    }
}
