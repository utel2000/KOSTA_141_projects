package ex1;

public class Ex1_Byte {

    // 메서드, 변수는 소문자로 시작하는 것이 문제가 될 때가 있다.
    // 예약어, if, for, break, ... 소문자로 이루어져 있는 것들.
    // (자바에선 괜찮아도 타 언어에 문제가 생길 수도)
    // 그러므로 정답은 소문자와 대문자 or 숫자로 혼용
    // 단축키: psvm[탭]
    public static void main(String[] args) {
        // 단축키: sout[탭]
        // System.out.println("");

        byte num3 = 10;
        byte num2 = 20;

        // 연산의 결과를 다시 변수에 기억
        // 자바에서는 모든 연산을 JVM이 한다.
        // int형 4byte이하의 자료형이 연산이 될 때는 JVM이 연산할 때 int형으로 승격 시켜서 연산을 수행.
        // 프로모션(promotion), 디모션(demotion) 모두 캐스팅이지만 프로모션은 별도의 표시가 없다.
        // 프로모션(promotion): 작은 자료형에서 큰 자료형으로 데이터를 이동할 경우 발생하는 상태.
        // 디모션(demotion): 큰 자료형에서 작은 자료형으로 데이터를 이동할 경우 발생하는 상태.
        // 이 경우 반드시 (캐스팅 할 자료형)으로 명시.
        // 예) 작은자료형 변수 = (캐스팅 할 자료형)(큰 자료형 연산)
        byte resNum = (byte) (num2 + num3);
        System.out.println("연산결과: " + resNum);
        // 한 번 해보기
        // short형 자료형 변수에 * 연산자를 사용해서 두 수를 저장하고 그 결과를 short란 XX변수에 저장한 후 출력.
        // 예) 50 * 2 = 100
        short testNum1 = 50;
        short testNum2 = 2;
        short testNumResult = (short) (testNum1 * testNum2);
        System.out.println(testNum1 + "x" + testNum2 + "=" + testNumResult);

    }
}
