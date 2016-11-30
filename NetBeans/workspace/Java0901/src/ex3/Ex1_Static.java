package ex3;
public class Ex1_Static {
    // static은 모든 객체들이 공유할 수 있으며,
    // 생성없이(new)없이 바로 참조 가능한 자원들...
    // 핵심포인트는 static초기화가 메인 메서드보다 먼저 호출이 된다.
    // 예) JDBC Driver Loading (서비스가 한 번만 로딩)
    static { // 스태틱 초기화 블럭
        System.out.println("초기화 !"); // 1
    }
    public static void main(String[] args) {
        System.out.println("메인 메서드 호출!"); // 2
    }
}
