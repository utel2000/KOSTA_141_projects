package ex1;

public class TestCode {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = null;
        for (int i = 0; i < 100000; i++) {
            str += i + ""; // 나쁜 코드 : 가비지에게 무리한 일을 시킴.
        }
        long end = System.currentTimeMillis();
        System.out.println("시간 : " + (end - start));
    }
}
