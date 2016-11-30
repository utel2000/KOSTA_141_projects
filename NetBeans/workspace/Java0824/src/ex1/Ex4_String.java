package ex1;

public class Ex4_String {
    public static void main(String[] args) {
        String str1 = new String("Test");
        String str2 = new String("Test");
        System.out.println("주소값 비교 : "+(str1 == str2)); // R: false => String은 == 사용 시 주소를 비교
        
        char ch = str1.charAt(0);
        // String 클래스는 값도 가지고 있다.
        // String과 같은 값을 가지는 클래스들은 값 비교를 할 때 API equals메소드 사용.(대소문자 구별.)
        // 대소문자 무시는 equalsIgnoreCase 사용.
        // 문자열의 비교를 반환
        System.out.println("값 비교 : "+str1.equals(str2)); // R: true
        System.out.println("값 비교 / 대소문자 무시 비교 : "+str1.equalsIgnoreCase(str2)); // R: true
    }
}
