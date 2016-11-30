package review_5;
public class Main {
    public static void main(String[] args) {
        Parent pp = new Parent();
        Child c = new Child();
        Parent pc = new Child();
        
        pp.printParent();
        c.printParent();  // 재정의 된 메서드 호출.
        pc.printParent(); // 재정의 된 메서드 호출.
    }                     // 부모 클래스의 정보 은닉.
}
