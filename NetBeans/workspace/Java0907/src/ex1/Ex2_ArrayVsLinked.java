package ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ex2_ArrayVsLinked {

    private ArrayList<String> arlist;
    private LinkedList<String> linklist;

    public Ex2_ArrayVsLinked() { // 생성자로 초기화
        arlist = new ArrayList<>();
        linklist = new LinkedList<>();
    }
    
    public long testTime(String type1){ // 1, 2번에 따른 분류, 소요시간.
        long start = System.currentTimeMillis();
        if(type1.equals("1")){
            exe(arlist);
        }else{
            exe(linklist);
        }
        long end = System.currentTimeMillis();
        return(end-start);
    }
    // 리스트 계열의 객체만 인자로 받을 수 있도록 정의
    private void exe(List<String> list){
        for(int i=0; i<10000000; i++){
            list.add(String.valueOf(i));
        }
        System.out.println("list : "+list.size());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. ArrayList, 2. LinkedList");
        String type = sc.nextLine();
        Ex2_ArrayVsLinked eavl = new Ex2_ArrayVsLinked();
        System.out.println("걸린시간 : "+eavl.testTime(type)+"초");
        // long startTime;
        // long endTime;
        // startTime = System.nanoTime();
        // for (int i = 0; i < 10000; i++) {
        //     list1.add(0, String.valueOf(i));
        // }
        // endTime = System.nanoTime();
        // System.out.println("ArrayList 걸린시간 : " + (endTime - startTime) + " ns");
        // startTime = System.nanoTime();
        // for (int i = 0; i < 10000; i++) {
        //     list2.add(0, String.valueOf(i));
        // }
        // endTime = System.nanoTime();
        // System.out.println("LinkedList 걸린시간 : " + (endTime - startTime) + " ns");
    }
}
