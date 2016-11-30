package ex2;
import java.util.ArrayList;
public class Ex1_ArrayList {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        System.out.println("������1 : "+ar.size());
        // ArrayList�� ���� �����غ���
        ar.add("Test"); // 0
        ar.add("Test"); // 1
        int num = 200;
        ar.add(num); // 2... // AutoBoxing
        Character ch = 'A';
        ar.add(ch);
        ar.add(3.11f); // AutoBoxing
        ar.add(100L); // AutoBoxing
        System.out.println("������2 : "+ar.size());
        // �迭�� ���������� ù��° ����� �ε����� 0�̴�.
        // ������ �ݺ��ϴ� Ƚ����ŭ ar.size()�� ���� �����ǹǷ� ������ ��.
        for(int i=0; i<ar.size(); i++){ 
            // get(index)�޼��带 ����ؼ� ����� �� ��������.
            System.out.println(ar.get(i));
        }
        // ���� for������ �����غ���
        System.out.println("------------------");
        for(Object e : ar){
            System.out.println(e + " : " + e.getClass().getTypeName()
                    .substring(e.getClass().getTypeName().lastIndexOf(".")+1));
        }
    }
}
