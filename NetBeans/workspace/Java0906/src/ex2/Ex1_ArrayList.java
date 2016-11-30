package ex2;
import java.util.ArrayList;
public class Ex1_ArrayList {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        System.out.println("사이즈1 : "+ar.size());
        // ArrayList에 값을 저장해보기
        ar.add("Test"); // 0
        ar.add("Test"); // 1
        int num = 200;
        ar.add(num); // 2... // AutoBoxing
        Character ch = 'A';
        ar.add(ch);
        ar.add(3.11f); // AutoBoxing
        ar.add(100L); // AutoBoxing
        System.out.println("사이즈2 : "+ar.size());
        // 배열과 마찬가지로 첫번째 요소의 인덱스는 0이다.
        // 조건을 반복하는 횟수만큼 ar.size()가 힙에 생성되므로 안좋은 예.
        for(int i=0; i<ar.size(); i++){ 
            // get(index)메서드를 사용해서 요소의 값 가져오기.
            System.out.println(ar.get(i));
        }
        // 향상된 for문으로 변경해보기
        System.out.println("------------------");
        for(Object e : ar){
            System.out.println(e + " : " + e.getClass().getTypeName()
                    .substring(e.getClass().getTypeName().lastIndexOf(".")+1));
        }
    }
}
