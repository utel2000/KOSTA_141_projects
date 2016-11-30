package review_5;
public class Child extends Parent {
    @Override
    public void printParent() {
        System.out.println("자식에서 오버라이딩했다!");
    }
    public void printChild(){
        System.out.println("자식이다!!");
    }
}
