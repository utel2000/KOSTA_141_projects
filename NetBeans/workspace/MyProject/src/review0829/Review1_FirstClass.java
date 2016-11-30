package review0829;

public class Review1_FirstClass {
    // 멤버 필드, 멤버 변수, 속성 => 아는 것
    String msg; // 초기값 null
    int num; // 초기값 0
    //-----------------------------------------
    // 멤버 메서드, 동작 => 하는 것, 연산정의, 비지니스 로직 정의
    // 메서드 안에 지정된 String m, int n은 지역변수로 선언.
    public void printMessage(String m, int n) {
        msg = m;
        num = n; 
        System.out.println("msg : " + msg);
        System.out.println("num : " + num);
    }
    //-------------------------------------------
    //main메서드를 작성한 사례 (단일 책임의 원칙에 위배)
    public static void main(String[] args) {
        // 이제 Review1_FirstClass를 Heap에 올려놓고
        // 참조해서 사용하기 위해서 new 연산자로 생성.
        // 1. 스택에 참조변수를 선언.
        Review1_FirstClass ef = null;
        // 2. 선언한 참조 변수에 new연산자로 생성한 객체의 주소를 대입.
        ef = new Review1_FirstClass();
        // 3. 참조변수를 통해서 해당 자원(멤버변수, 메서드)을 사용.
        // 생성된 객체의 자원 중에 멤버 필드를 참조하는 것 (캡슐화 위배)
        // 좋지 않으나 연습으로 사용.
        System.out.println("msg 문자열을 가진 멤버변수값 : " + ef.msg);
        // 메서드를 사용해보자. printMessage()를 호출해서 결과 출력.
        ef.printMessage("호이짜", 20);
    }
}
