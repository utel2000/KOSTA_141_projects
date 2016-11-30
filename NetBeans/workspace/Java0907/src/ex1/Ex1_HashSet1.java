package ex1;
import java.util.HashSet;
import java.util.Iterator;
public class Ex1_HashSet1 {
    // set������ �ߺ��� ������� �ʴ´�.
    // �ߺ��� �����ϸ鼭 �ݺ���, ���� for���� TreeSet �������� ������ ������.
    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<>(); // ���� ���� �ȵ�.
        // TreeSet<String> h1 = new TreeSet<>(); // ���� ���� ��.
        h1.add("C");
        h1.add("ATest");
        h1.add("ATest");
        h1.add("B");
        h1.add("D");
        h1.add("D");
        h1.add("A");
        h1.add("A");
        h1.add("A");
        System.out.println("ũ�� : " + h1.size());
        System.out.println("A���� ���Կ��� : "+h1.contains("A"));
        // ���ͷ����� + while �Ǵ� ���� for��
        Iterator<String> it1 = h1.iterator();
        while(it1.hasNext()){
            String next = it1.next();
            System.out.println(next);
        }
        // ���� for������ �غ���.
        for(String i : h1){
            System.out.println(i);
        }
    }
}
