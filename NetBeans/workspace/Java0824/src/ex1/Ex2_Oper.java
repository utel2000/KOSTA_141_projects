package ex1;

public class Ex2_Oper {
//     == 비교가 중요하다.
    public static void main(String[] args) {
//         변수의 종류
//         멤버변수, 지역변수
//         - 참조변수 : 참조 자료형으로 선언된 변수, 일반변수 *****
        int num1 = 10;
        int num2 = 10;
        System.out.println("result : "+(num1==num2));
        
//         String은 문자열, 클래스 -> 객체임을 알 수 있었다.
//         객체는 주소 값을 가진다.
//         String 클래스라고 이야기할 때는 객체로 생성되지 않은 구조를 설명할 때
//         사용할 때는 원칙 객체로 생성해서 사용한다.
//         예) 클래스를 설계도면, 객체는 설계도면에 따른 결과물.
//         String 클래스를 객체로 생성 해보자. new는 클래스를 객체로 생성하기 위한 키워드.
//         // 참조자료형 참조 변수; // 참조변수를 선언
        String str;
        str = new String("Kosta");
        
    }
}
