package ex2.exam;
public class Exam2_Exception {
    public static void test() {
        System.out.println(6 / 0);
        System.out.println("�ȳ�! ");
    }
    public static void main(String[] args) {
        Exam2_Exception ref = new Exam2_Exception();
        try {
            ref.test();
        }catch(ArithmeticException e){
            System.out.println("0���� ���� �� �����ϴ�.");
        }catch(Exception e){
            System.out.println("��Ÿ ���� �߻�!");
        }finally{
            System.out.println("--------------------------");
        }
    }
    public void takeException() throws ArithmeticException{
        System.out.println("ȣ��!");
    }
}
