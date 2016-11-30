package review_4;
public class Polymor {
    // int형 정수 값을 매개변수로 받는 a() 메서드
    public void a(int param1, int param2) { 
        System.out.println("int형을 받아 출력");
        System.out.println(param1+param2);
    }
    // String형 문자열을 매개변수로 받는 a() 메서드
    public void a(String param) { 
        System.out.println("String형을 받아 출력");
        System.out.println(param);
    }
    public static void main(String[] args) {
        Polymor poly = new Polymor();
        poly.a(10, 20); // 매개변수 타입에 따라 적합한 메서드가 있다면
        poly.a("one");  // 해당 메서드를 호출한다. (오버로딩)
    }
}
