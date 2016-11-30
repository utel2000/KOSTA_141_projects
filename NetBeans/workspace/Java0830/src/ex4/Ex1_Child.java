package ex4;
// Ex1_Super를 확장한 자식클래스.
// 부모클래스와 자식클래스는 컴파일단계에서 extends라는 키워드로 묶어진다.(*중요)
public class Ex1_Child extends Ex1_Super{
    private String msg;
    private int number1;
    int number2=20;
    public void childMethod(){
        parentMethod(); // 부모의 메서드가 자식의 것이 되었다.
        System.out.println("부모의 자원 : "+num2);
    }
    public static void main(String[] args) {
        Ex1_Child ec = new Ex1_Child();
        ec.childMethod();
        ec.parentMethod(); // 자식의 레퍼런스로 부모의 자원을 호출.
    }
}
