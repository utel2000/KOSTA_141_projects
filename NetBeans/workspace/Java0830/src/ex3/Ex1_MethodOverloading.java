package ex3;

public class Ex1_MethodOverloading {
    // Method Overloading 하나의 클래스 내에서 같은 이름을 가지는 메서드가
    // 여러개 정의 되어 있는 것을 말한다.
    // 일관성있는 작업이기 때문에 프로그램의 신뢰성을 높인다.
    // 매개변수의 타입, 순서, 개수 3가지 모두 오버로딩의 규칙.
    public void getLength(int a) {
        String s = String.valueOf(a);
        System.out.println("입력한 길의 값 : " + s.length());
    }
    public void getLength(float f) {
        String s = String.valueOf(f);
        System.out.println("입력한 길의 값 : " + s.length());
    }
    public void getLength(char[] c) {
        String s = String.valueOf(c);
        System.out.println("입력한 길의 값 : " + s.length());
    }
    public void getLength(int a, float f) {
        String s = String.valueOf(a);
        System.out.println("입력한 길의 값 : " + s.length());
    }
    public void getLength(float f, int a) {
        String s = String.valueOf(a);
        System.out.println("입력한 길의 값 : " + s.length());
    }
    public static void main(String[] args) {
        Ex1_MethodOverloading em = new Ex1_MethodOverloading();
        em.getLength(1);
        em.getLength(3.14f);
        em.getLength('하');
        em.getLength(1, 3.14f);
        em.getLength(3.14f, 1);
    }
}
