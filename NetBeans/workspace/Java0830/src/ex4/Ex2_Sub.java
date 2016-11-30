package ex4;

public class Ex2_Sub extends Ex2_Super {
    public Ex2_Sub() {
        // 자식의 기본 생성자에서 부모의 기본 생성자를 호출하도록 생략이 되어 있다.
        // super();는 부모의 기본 생성자 호출. (정의 안해도 기본적으로 된다.)
        // super.~~도 this.~~처럼 변수의 구분을 위해 사용 가능.
        System.out.println("자식 클래스의 기본 생성자 호출!");
    }
    public static void main(String[] args) {
        // Heap에서는 하나의 객체가 생성된다.(new가 1개다!)
        // 같은 번지에 부모가 '먼저' 들어오고 후에
        // 자식 역시 같은 번지에 들어온다.
        // * 부모를 참조하는 중엔 자식의 내용을 보지 못한다.
        // Super a = new Sub(); 은 자식은 생성되지만 부모만 참조하겠다는 뜻이므로
        // 자식의 내용을 볼 수가 없다.
        Ex2_Sub es = new Ex2_Sub();
    }
}
