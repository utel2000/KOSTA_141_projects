package ex1;
public class Ex4_Inner_Lambda {
    private int mynum;
    public Ex4_Inner_Lambda() {
        mynum = 10000;
    }
    class Ex4_Inner {
        private int mynum =20;
        public void innerMethod(){
            MyInter2 myInter2 = (mynum)->{
                System.out.println("mynum : "+mynum); // R: 100
                System.out.println("mynum :" + Ex4_Inner_Lambda.this.mynum); // R: 10000
            };
            myInter2.myMethod(100);
        }
    }
    public static void main(String[] args) {
        Ex4_Inner_Lambda.Ex4_Inner ref = new Ex4_Inner_Lambda().new Ex4_Inner();
        ref.innerMethod();
    }
}
