
package ex1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex1_HashSet2 {
    // set������ �ߺ��� ������� �ʴ´�.
    // �ߺ��� �����ϸ鼭 �ݺ���, ���� for���� TreeSet �������� ������ ������.
    public static void main(String[] args) {
         HashSet<Integer> h1 = new HashSet<>(); // ���� ������ �ȵ�.
        // TreeSet<Integer> h1 = new TreeSet<>(); // ���� ���� ��.
        h1.add(10);
        h1.add(55);
        h1.add(19);
        h1.add(8);
        h1.add(11);
        h1.add(1);
        h1.add(19);
        Iterator<Integer> it1 = h1.iterator();
        // Iterator<Integer> it1 = h1.descendingIterator(); // ��������(TreeSet)
        while(it1.hasNext()){
            Integer next = it1.next();
            System.out.println(next);
        }
        // ���� for������ �غ���.
        for(Integer i : h1){
            System.out.println(i);
        }
    }
}
