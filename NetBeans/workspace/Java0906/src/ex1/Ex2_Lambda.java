package ex1;
public class Ex2_Lambda {
    public static void main(String[] args) {
        MyInter2 myInter2 = new MyInter2() {
            @Override
            public void myMethod(int argNum) {
                int res = argNum * 2;
                System.out.println("Result1 : " + res);
            }
        };
        myInter2.myMethod(1000);
        System.out.println("----------------------------");
        MyInter2 myInter3 = (argNum) -> {
            int res = argNum * 2;
            System.out.println("Result2 : " + res);
        };
        myInter3.myMethod(1000);
        System.out.println("----------------------------");

        // 연습문제) 매개변수가 하나일 때 간소화 시킨
        // 람다 표현식으로 변경해서 출력해보기
        MyInter2 myInter23 = argNum -> System.out.println("Result3 : " + argNum * 3);
        myInter23.myMethod(1000);
    }
}
