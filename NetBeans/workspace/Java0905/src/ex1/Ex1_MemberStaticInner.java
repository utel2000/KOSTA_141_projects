package ex1;
public class Ex1_MemberStaticInner {
    int a = 10;
    private int b = 100;
    static int c = 200;
    static class Inner {
        // 어쩔 수 없이 내부 클래스 안에서 static 자원을 참조 하려고 할 때
        static int d = 1000;
        public void printData() {
            // a와 b의 출력에서 오류가 나는 것은, static이 붙은 것이
            // 제일 먼저 생성되어 static영역에 들어가기 때문에
            // 먼저 생성된 static 변수들은 static 클래스에서 사용할 수 있는 것과 달리
            // class보다 늦게 생성되어 외부 클래스를 참조해야만 사용할 수 있다. 
            // System.out.println("int a : "+a); // 오류
            // System.out.println("private int b : "+b); // 오류
            System.out.println("static int c : " + c); 
            System.out.println("static int d : " + d);
        }
    }
}
