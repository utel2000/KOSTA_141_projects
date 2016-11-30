package ex2;
import java.util.ArrayList;
import java.util.Iterator;
public class Ex2_Generic {
    public static void main(String[] args) {
        // JDK 7 ���� ���� ������ <>�� ��� ����!
        // ArrayList<String> ar = new ArrayList<String>();
        ArrayList<String> ar = new ArrayList<>();
        // Generic : ��ü�� cast�� �������μ� ���ʿ��� �޸� ���� ����.
        // JDK 5���� ����
        // ar.add(new Integer(1000)); // ����. String�� �ƴϴ� ���� �� ����.
        ar.add("Test");
        ar.add("Test");
        ar.add("Ok");
        for (String e : ar) {
            System.out.println(e);
        }
        System.out.println("-------------------------");
        // ��� Collection�� �ݺ��ڸ� ��������.
        Iterator<String> it = ar.iterator();
        while (it.hasNext()) { // �ݺ��� ������ ���� ������ true
            String next = it.next(); // ����� ��
            System.out.println(next);
        }
        // ��������) Integer�� ArrayList�� �����
        // ������ ���� ������ �� ���� for, Iterator�� ����ؼ� ���
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
