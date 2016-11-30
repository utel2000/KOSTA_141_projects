package ex2.exam;
public class Exam2_Exception {
    public static void test() {
        System.out.println(6 / 0);
        System.out.println("냠냠! ");
    }
    public static void main(String[] args) {
        Exam2_Exception ref = new Exam2_Exception();
        try {
            ref.test();
        }catch(ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }catch(Exception e){
            System.out.println("기타 예외 발생!");
        }finally{
            System.out.println("--------------------------");
        }
    }
    public void takeException() throws ArithmeticException{
        System.out.println("호잇!");
    }
}
