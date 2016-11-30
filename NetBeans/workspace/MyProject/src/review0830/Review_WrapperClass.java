package review0830;
// WrapperClass는 일반 자료형을 객체화 시켜서 제공해주는 API.
// 일반자료형과 관련된 도구(리소스, 메서드, 속성)를 제공해 줌으로써
// 가독성, 편리성을 제공. String 클래스처럼 값을 저장하는 객체의 역할.
// WrapperClass은 일반자료형을 가지고 있는 클래스.(Integer, Boolean 등)
// AutoBoxing은 String처럼 묵시적객체생성방법과 닮은 것.
// UnBoxing은 객체화 된 것을 일반 자료형으로 다시 되돌리는 것.
// jdk 5버전 이상부터 지원해주는 기능이 AutoBoxing, UnBoxing.
public class Review_WrapperClass {
    public void test() {
        Integer num1 = Integer.parseInt("10");
        System.out.println("num1 = " + num1);
        Integer num2v = new Integer("100"); // 명시적객체생성 (5버전 미만 사용)
        Integer num3v = 1000; // AutoBoxing (5버전 이상 사용)
        int num = num3v; // UnBoxing
        Boolean b = true; // AutoBoxing
        System.out.println(b);        
        boolean bb = b; // UnBoxing        
        System.out.println(bb);        
        Double dou = 1000.00; // AutoBoxing
        System.out.println(dou);
        double douu = dou; // UnBoxing
        System.out.println(douu);
        Character ch = '가'; // AutoBoxing
        System.out.println(ch);
        char chh = ch; // UnBoxing
        System.out.println(chh);
    }
    public static void main(String[] args) {
        Review_WrapperClass ew = new Review_WrapperClass();
        ew.test();
    }
}
