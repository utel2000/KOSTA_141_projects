package ex1;

public class Ex1_FirstClass {

    // 멤버 필드, 멤버 변수, 속성 => 아는 것
    String msg; // 초기화가 되어 있음. (null)
    String msg1 = "하이"; // 멤버변수를 초기화. -> 불필요.
    int num; // 초기값 0
    int num1 = 10; // 10으로 임의로 초기화. -> 불필요.
    //-----------------------------------------

    // 멤버 메서드, 동작 => 하는 것, 연산정의, 비지니스 로직 정의
    // 가독성있게 식별자를 정의한다.
    // 메서드 안에 지정된 String msg는 지역변수로 선언.
    public void printMessage(String msg) {
        // msg = msg; // 문제점1 : 멤버변수와 지역변수명이 같음.(우선순위 지역변수가 높음)
        // int num = 20; // 문제점2 : 멤버변수와 지역변수명이 같음
        this.msg = msg;
        System.out.println("message : "+msg);
        System.out.println("num : "+num);
    }
    //-------------------------------------------
    //main메서드를 작성한 사례 (단일 책임의 원칙에 위배)
    public static void main(String[] args) {
        // 최초의 클래스를 간단하게 정의 해보았고
        // 이제 Ex1_FirstClass를 Heap에 올려놓고
        // 참조해서 사용하기 위해서 new연산자로 생성한다.
        // 1. 스택에 참조변수를 선언.
        Ex1_FirstClass ef=null;
        // 2. 선언한 참조 변수에 new연산자로 생성한
        // 객체의 주소를 대입한다.
        ef = new Ex1_FirstClass();
        // 3. 참조변수를 통해서 해당 자원(멤버변수, 메서드)을 사용한다.
        // 생성된 객체의 자원 중에 멤버 필드를 참조하는 것 (캡슐화 위배)
        // 좋지 않으나 연습으로 사용. (메인에서 멤버변수 나오면 은닉성이 x)
        System.out.println("msg1 문자열을 가진 멤버변수값 : " + ef.msg1); 
        ef.msg1 = "반가워요.";
        // 메서드를 사용해봅시다. printMessage()를 호출해서 결과 출력하기.
        ef.printMessage(ef.msg1);
    }
}
