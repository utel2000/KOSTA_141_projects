package ex4;
// 메뉴판, 자격증
public interface Ex1_MyInter {
    // 인터페이스의 구성 : 상수와 추상메서드
    public static final int NUM = 1000; // 상수 
    int num2 = 200; // 컴파일 시 static final을 알아서 붙여준다.
    public abstract void test(); // 추상메서드
    public String msg(); // 컴파일러가 알아서 abstract 붙여줌.
}
