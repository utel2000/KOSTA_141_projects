package ex2;
import java.util.ArrayList;
import java.util.Iterator;
public class Ex2_Generic {
    public static void main(String[] args) {
        // JDK 7 버전 부터 생성자 <>로 축약 가능!
        // ArrayList<String> ar = new ArrayList<String>();
        ArrayList<String> ar = new ArrayList<>();
        // Generic : 객체의 cast를 줄임으로서 불필요한 메모리 낭비를 방지.
        // JDK 5부터 지원
        // ar.add(new Integer(1000)); // 오류. String이 아니니 넣을 수 없다.
        ar.add("Test");
        ar.add("Test");
        ar.add("Ok");
        for (String e : ar) {
            System.out.println(e);
        }
        System.out.println("-------------------------");
        // 모든 Collection은 반복자를 제공해줌.
        Iterator<String> it = ar.iterator();
        while (it.hasNext()) { // 반복할 데이터 값이 있으면 true
            String next = it.next(); // 요소의 값
            System.out.println(next);
        }
        // 연습문제) Integer용 ArrayList를 만들고
        // 적절한 값을 저장한 후 향상된 for, Iterator를 사용해서 출력
        ArrayList<Integer> ar2 = new ArrayList<>();
        ar2.add(50);
        ar2.add(100);
        ar2.add(5000);
        Iterator<Integer> it2 = ar2.iterator();
        for (Integer i : ar2) {
            System.out.println(i);
            System.out.println(it2.next());
        }
    }
}
