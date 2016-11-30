package ex2;
import java.util.Scanner;
public class Ex2_ArrayIndexException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력");
        String number = sc.nextLine();
        String[] argsv = {"10", number, "30"};
        try {
            for (int i = 0; i <= argsv.length; i++) { // 1
                int n = Integer.parseInt(argsv[i]);
                System.out.println(n); // 2
                System.out.println("----------------*****");
            }
        } catch (NumberFormatException e) {
            System.out.println("제대로 숫자를 입력하세요.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 범위를 넘었습니다.");
        } catch (Exception e) { // 다른 예외처리보다 위에 있을 수 없다.
            System.out.println("기타 예외 발생.");
        } finally { // 무조건 실행!
            System.out.println("여기는 예외와 상관없이 무조건 수행.");
        }
    }
}
