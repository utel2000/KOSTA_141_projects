package ex2;
public class Ex4_ThrowView {
    public static void main(String[] args) {
        try{
            findClass();
        }catch(ClassNotFoundException e){
            System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
        }
    }
    // throw�� ����ؼ� ȣ���� ������ ���� ó���� ����!
    // throws ClassNotFoundException
    public static void findClass() throws ClassNotFoundException{
        // Class.forName("") : ���ڿ��� ������ ����� Ŭ������ �ҷ��´�.
        Class clazz = Class.forName("java.lang.String2");
    }
}
