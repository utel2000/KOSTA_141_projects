package ex1;
import java.util.HashSet;
import java.util.Iterator;
public class Ex1_HashSet1 {
    // set구조는 중복을 허용하지 않는다.
    // 중복을 제거하면서 반복자, 향상된 for문에 TreeSet 오름차순 정렬을 보장함.
    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<>(); // 정렬 보장 안됨.
        // TreeSet<String> h1 = new TreeSet<>(); // 정렬 보장 됨.
        h1.add("C");
        h1.add("ATest");
        h1.add("ATest");
        h1.add("B");
        h1.add("D");
        h1.add("D");
        h1.add("A");
        h1.add("A");
        h1.add("A");
        System.out.println("크기 : " + h1.size());
        System.out.println("A문자 포함여부 : "+h1.contains("A"));
        // 이터레이터 + while 또는 향상된 for문
        Iterator<String> it1 = h1.iterator();
        while(it1.hasNext()){
            String next = it1.next();
            System.out.println(next);
        }
        // 향상된 for문으로 해보자.
        for(String i : h1){
            System.out.println(i);
        }
    }
}
