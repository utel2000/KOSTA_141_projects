package ex1;
// 핵심포인트 : 메서드 안에서 사용되는 지역변수는 익명내부클래스나 람다식에서
// 참조하려고 할 때 final 특성으로 변경되어서 중간에 값을 다시 설정할 수 없다.
public class Ex5_LocalInner_Lambda {
    private int memNum = 18;
    public void innerMethod(int arg) {
        int localVar = 50;
        memNum = 200;
        MyInter1 myInter0 = new MyInter1() {
            @Override
            public void myMethod() {
                System.out.println(arg); // 19
                System.out.println(localVar); // 50
                System.out.println(memNum); // 200
            }
        };
        myInter0.myMethod();
        System.out.println("---------------------------");
        // [연습문제] 위의 익명내부클래스를 람다식으로 변경한 후테스트
        MyInter1 myInter02 = () -> {
            // local변수에 값을 읽어 보기 - 중간에 변수들을 주석을 해제하고
            // 실행하면 오류가 남, 멤버인 memNum은 상관없음.
            System.out.println(arg);
            System.out.println(localVar);
            System.out.println(memNum);
        };
        myInter02.myMethod();
        System.out.println("-----------------------------");
    }
    public static void main(String[] args) {
        Ex5_LocalInner_Lambda ell = new Ex5_LocalInner_Lambda();
        ell.innerMethod(19);
    }
}
