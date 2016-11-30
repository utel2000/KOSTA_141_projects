package ex4;

public class Ex3_Sub extends  Ex3_Super{
    public void childMethod(){
        System.out.println("자식 클래스의 메서드!");
    }
    public static void main(String[] args) {
        // 자식을 참조한 자식객체를 생성한 경우.
        Ex3_Sub ref1 = new Ex3_Sub();
        // 참조 범위는?
        ref1.parentMethod();
        ref1.childMethod();
        // 부모를 참조해서 자식객체를 생성한 경우
        Ex3_Super ref2 = new Ex3_Sub(); // 자식 객체는 생성했으나 
        ref2.parentMethod();
        // ref2.childMethod(); 자식의 메서드는 호출 할 수 없다.
    }
}
