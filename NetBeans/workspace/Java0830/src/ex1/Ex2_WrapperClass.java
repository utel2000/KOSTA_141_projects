package ex1;
// 핵심포인트) 일반 자료형을 객체화 시켜서 제공해주는 API
// 일반자료형과 관련된 도구(리소스, 메서드, 속성)를 제공해 줌으로써
// 가독성, 편리성을 제공. String 클래스처럼 값을 저장하는 객체의 역할
// WrapperClass은 일반자료형을 가지고 있는 클래스이다.(Integer, Boolean 등)
// 수행!(명시적객체생성방법, 묵시적(암묵적)객체생성방법)
// AutoBoxing은 String처럼 묵시적객체생성방법과 닮은 것.
// UnBoxing은 객체화 된 것을 일반 자료형으로 다시 되돌리는 것.
// jdk 5버전 이상부터 지원해주는 기능이 AutoBoxing, UnBoxing.

public class Ex2_WrapperClass {

    public void test() {
        Integer num1 = Integer.parseInt("10");
        System.out.println("num1 = " + num1);
        // 명시적 객체 생성 (5 이하에서 사용)
        Integer num2v = new Integer("100");
        // AutoBoxing (5이상에서 사용)
        Integer num3v = 1000;
    }

    public void test2() {
        // 연습해서
        // AutoBoxing으로 각 일반 자료형의 Wrapper 클래스를
        // 사용해서 값을 저장한 후 출력해보자.
        Boolean b = true;
        System.out.println(b);
        // WrapperClass을 -> 일반자료형으로 바꾸는 것 : UnBoxing
        boolean bb = b;
        // 다른 자료형 다 해보기
        Byte by = 10;
        System.out.println(by);
        byte byy = by;
        Short sh = 100;
        System.out.println(sh);
        short shh = sh;
        Long lo = 1000l;
        System.out.println(lo);
        long loo = lo;
        Float fl = 100.0f;
        System.out.println(fl);
        float fll = fl;
        Double dou = 1000.00;
        System.out.println(dou);
        double douu = dou;

    }

    public static void main(String[] args) {
        Ex2_WrapperClass ew = new Ex2_WrapperClass();
        ew.test();
        ew.test2();
    }
}
