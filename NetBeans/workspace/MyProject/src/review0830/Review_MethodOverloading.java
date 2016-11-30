package review0830;

public class Review_MethodOverloading {
    public void getLength(int a) {
        String s = String.valueOf(a);
        System.out.println("입력한 길의 값 : " + s.length());
    }
    public void getLength(float f) {
        String s = String.valueOf(f);
        System.out.println("입력한 길의 값 : " + s.length());
    }
    public void getLength(char[] c) {
        String s = String.valueOf(c);
        System.out.println("입력한 길의 값 : " + s.length());
    }
    public void getLength(int a, float f) {
        String s = String.valueOf(a);
        System.out.println("입력한 길의 값 : " + s.length());
    }
    public void getLength(float f, int a) {
        String s = String.valueOf(a);
        System.out.println("입력한 길의 값 : " + s.length());
    }
    public static void main(String[] args) {
        Review_MethodOverloading em = new Review_MethodOverloading();
        em.getLength(1);
        em.getLength(3.14f);
        em.getLength('하');
        em.getLength(1, 3.14f);
        em.getLength(3.14f, 1);
    }    
}
