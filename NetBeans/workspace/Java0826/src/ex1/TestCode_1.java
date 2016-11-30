package ex1;

public class TestCode_1 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // StringBuffer클래스를 생성하여 Buffer공간에 문자열을 적재하여(append())
        // 저장 한다.
        // TestCode는 가비지가 사용하지 않는 스트링 객체를
        // 청소 했었지만, 여기서는 유실되는 스트링 객체의 주소가
        // 없기 때문에 가비지의 부담이 줄어든다. *****
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            str.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("시간 : " + (end - start));
    }
}
