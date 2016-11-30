package ex3;
public class Ex2_Static {
    static int a; int b;
    public Ex2_Static(){
        a++; b++;
    }
    public static void main(String[] args) {
        Ex2_Static ref1 = new Ex2_Static();
        Ex2_Static ref2 = new Ex2_Static();
        System.out.println("Ref1_a : "+ref1.a); // R : 2 
        System.out.println("Ref1_b : "+ref1.b); // R : 1
        System.out.println("Ref2_a : "+ref2.a); // R : 2
        System.out.println("Ref2_b : "+ref2.b); // R : 1
        // static을 표현할 때는 Class.static자원으로 사용할 것.
        // static을 사용해서 외부 클래스에서 참조할 때 사용.
        System.out.println("Ex2_Static"+Ex2_Static.a);
        // 이렇게 해도 되지 않나요? => 안좋은 예.
        // 메인이 분리되어 있으면 사용할 수 없다.        
        System.out.println("이것은 왜 되나요?"+a);
    }
}
