package ex1;
public class Ex2_LocalInner {
    int a = 100; // 멤버영역
    // 로컬내부클래스는 지역변수를 참조 할 수 없다. **(중요)**
    // 상수만 참조 가능하다. **(중요)**
    // jdk 8버전 이상부터는 'final'을 입력하지 않아도 상수다.
    // 메서드가 스택에서 존재 할 때 까지만 생명 범위를 가진다.
    public void innerTest(int k) { // k는 로컬변수지만 내부 클래스 때문에 상수가 됨.
        int b = 200; // b는 로컬변수지만 내부 클래스 때문에 상수가 됨.
        // 상수로 내부 클래스에서 쓰려고 하는데 변수처럼 값을 바꾸려고 해서 getData()에서 오류 발생.
        // b = 500; // 이렇게 하면 b가 변수처럼 값을 변경하려 하므로 문제가 됨.
        // 상수로 내부 클래스에서 쓰려고 하는데 변수처럼 값을 바꾸려고 해서 getData()에서 오류 발생.
        // k = 1000; // 이렇게 하면 k가 변수처럼 값을 변경하려 하므로 문제가 됨.
        class Inner { // 로컬내부클래스
            public void getData() {
                System.out.println("int a : " + a);
                System.out.println("int b : " + b);
                System.out.println("int k : " + k);
            }
        }
        Inner i = new Inner(); // 로컬영역에서 생성되고 참조.
        i.getData();
    }
    public static void main(String[] args) {
        Ex2_LocalInner el = new Ex2_LocalInner();
        el.innerTest(1000);
    }
}
