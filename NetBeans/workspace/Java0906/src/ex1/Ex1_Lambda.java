package ex1;
public class Ex1_Lambda {
    public static void main(String[] args) {
        MyInter1 myInter1 = new MyInter1() {
            @Override
            public void myMethod() {
                System.out.println("Print Test1");
            }
//    @Override 
//    public void secondMethod() { / 람다식은 하나의 추상메서드만 돼!
//        System.out.println("Print Test2");
//    }
        };
        myInter1.myMethod();
        //myInter1.secondMethod();
        // 람다 표현식
        MyInter1 myInter2 = () -> {
            String str = "Print Test2";
            System.out.println(str);
        };
        myInter2.myMethod();
    }
}
