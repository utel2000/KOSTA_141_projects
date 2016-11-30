package ex1;

public class Ex5_Float {
    public static void main(String[] args) {
        // 3.14는 double로 취급 (8byte) -> float(4byte) 으로 변경시 디모션이 발생한다.
        // 꼭 뒤에 f나 F가 붙어야만 double이 되지 않고 float이 된다.
        float n = (float) 3.14;
        // 정확한 float의 표기법은
        float n1 = 3.14F; // or 소문자 f로 표시한다.
        System.out.println(n);
        System.out.println(n1);
        // double
        double d1 = n; // promotion.
        System.out.println(d1);
    }
}
// 자료형에 대한 학습을 마쳤습니다.
// 참고) Int형 이하의 자료형 연산관련의 특징.
// long -> L, l
// Float -> f, F
// 디모션일 때 유의사항: 자료의 손실을 감안.