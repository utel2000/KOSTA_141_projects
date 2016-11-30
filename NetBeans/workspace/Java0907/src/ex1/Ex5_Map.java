package ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex5_Map {

    public static void main(String[] args) {
        String[] msg = {"AA", "BB", "CC", "AA", "DD", "EE", "FF"};
        // key와 value로 저장할 수 있는 자료구조.
        HashMap<Integer, String> map = new HashMap<>(); // <키, 값>
        int cnt = 0;
        for (String i : msg) {
            // put이란 메서드를 사용해서 Map저장한다.
            map.put(cnt + 1, i);
            cnt++;
        }
        System.out.println("Size : " + map.size());
        // key는 set구조이기 때문에 중복을 허용하지 않는다.
        Set<Integer> keys = map.keySet();
        for (Integer i : keys) {
            // map.get(Key) : Set으로 받아서 키를 추출!
            System.out.println(map.get(i));
        }
        // 축약형
        // map.entrySet() -> Key, Value 추출
        // Map.Entry<Integer, String> - key와 value를 받아올 인터페이스 자료형.
        for(Map.Entry<Integer, String> i : map.entrySet()){
            System.out.println("Key : " + i.getKey());
            System.out.println("Value : " + i.getValue());
        }
    }
}
