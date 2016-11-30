package ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ex2_ArrayVsLinked {

    private ArrayList<String> arlist;
    private LinkedList<String> linklist;

    public Ex2_ArrayVsLinked() { // �����ڷ� �ʱ�ȭ
        arlist = new ArrayList<>();
        linklist = new LinkedList<>();
    }
    
    public long testTime(String type1){ // 1, 2���� ���� �з�, �ҿ�ð�.
        long start = System.currentTimeMillis();
        if(type1.equals("1")){
            exe(arlist);
        }else{
            exe(linklist);
        }
        long end = System.currentTimeMillis();
        return(end-start);
    }
    // ����Ʈ �迭�� ��ü�� ���ڷ� ���� �� �ֵ��� ����
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
        System.out.println("�ɸ��ð� : "+eavl.testTime(type)+"��");
        // long startTime;
        // long endTime;
        // startTime = System.nanoTime();
        // for (int i = 0; i < 10000; i++) {
        //     list1.add(0, String.valueOf(i));
        // }
        // endTime = System.nanoTime();
        // System.out.println("ArrayList �ɸ��ð� : " + (endTime - startTime) + " ns");
        // startTime = System.nanoTime();
        // for (int i = 0; i < 10000; i++) {
        //     list2.add(0, String.valueOf(i));
        // }
        // endTime = System.nanoTime();
        // System.out.println("LinkedList �ɸ��ð� : " + (endTime - startTime) + " ns");
    }
}
