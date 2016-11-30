
package ex1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex1_HashSet2 {
    // set구조는 중복을 허용하지 않는다.
    // 중복을 제거하면서 반복자, 향상된 for문에 TreeSet 오름차순 정렬을 보장함.
    public static void main(String[] args) {
         HashSet<Integer> h1 = new HashSet<>(); // 정렬 보장이 안됨.
        // TreeSet<Integer> h1 = new TreeSet<>(); // 정렬 보장 됨.
        h1.add(10);
        h1.add(55);
        h1.add(19);
        h1.add(8);
        h1.add(11);
        h1.add(1);
        h1.add(19);
        Iterator<Integer> it1 = h1.iterator();
        // Iterator<Integer> it1 = h1.descendingIterator(); // 내림차순(TreeSet)
        while(it1.hasNext()){
            Integer next = it1.next();
            System.out.println(next);
        }
        // 향상된 for문으로 해보자.
        for(Integer i : h1){
            System.out.println(i);
        }
    }
}
