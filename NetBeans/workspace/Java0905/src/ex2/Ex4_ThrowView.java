package ex2;
public class Ex4_ThrowView {
    public static void main(String[] args) {
        try{
            findClass();
        }catch(ClassNotFoundException e){
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }
    // throw를 사용해서 호출한 곳으로 예외 처리를 위임!
    // throws ClassNotFoundException
    public static void findClass() throws ClassNotFoundException{
        // Class.forName("") : 문자열로 지정된 경로의 클래스를 불러온다.
        Class clazz = Class.forName("java.lang.String2");
    }
}
