package ex1;

public class Ex4_Long {

    public static void main(String[] args) {
        // promotion : 작은 데이터 타입의 자료 -> 큰 데이터 타입의 자료로 이동

        // long타입의 표기법인 L, l을 정수의 뒷부분에 붙이면
        // 8byte long형으로 저장 *****
        // 예) long e = 100; -> 프로모션 정수형 int로 저장한 100을 다시 long으로 프로모션
        // 바로 저장 => long e = 100L;
        int num = 100; // 1 (정상)
        // int형 자료형 변수 num에 100값을 저장했고
        // 그것을 다시 long형으로 저장했다
        long num2 = num; // 2 (프로모션)
        long num3 = num + 10; // 3 (프로모션)
        long number = 100; // 4 (프로모션)
        long number2 = 100L; // 5 (정상)
        int number3 = (int) number2; // 6 (디모션)
        int mynum = (int) 100l; // 7 (디모션)

        // 정답: 프로모션 번호 = 2, 3, 4
        // 정답: 디모션: 6, 7
        
        // long의 사례
        // long형 데이터를 작은 자료형으로 저장했을 때 자료의 손실이 생길 수 있다.
        int start = (int) System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        System.out.println("start: " + start);
        System.out.println("start2: " + start2);
    }
}
