package ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex5_Map {

    public static void main(String[] args) {
        String[] msg = {"AA", "BB", "CC", "AA", "DD", "EE", "FF"};
        // key�� value�� ������ �� �ִ� �ڷᱸ��.
        HashMap<Integer, String> map = new HashMap<>(); // <Ű, ��>
        int cnt = 0;
        for (String i : msg) {
            // put�̶� �޼��带 ����ؼ� Map�����Ѵ�.
            map.put(cnt + 1, i);
            cnt++;
        }
        System.out.println("Size : " + map.size());
        // key�� set�����̱� ������ �ߺ��� ������� �ʴ´�.
        Set<Integer> keys = map.keySet();
        for (Integer i : keys) {
            // map.get(Key) : Set���� �޾Ƽ� Ű�� ����!
            System.out.println(map.get(i));
        }
        // �����
        // map.entrySet() -> Key, Value ����
        // Map.Entry<Integer, String> - key�� value�� �޾ƿ� �������̽� �ڷ���.
        for(Map.Entry<Integer, String> i : map.entrySet()){
            System.out.println("Key : " + i.getKey());
            System.out.println("Value : " + i.getValue());
        }
    }
}
