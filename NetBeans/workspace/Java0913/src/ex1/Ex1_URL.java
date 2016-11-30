package ex1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex1_URL {
    public static void main(String[] args) throws MalformedURLException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Host : ");
        String host = sc.nextLine();
        // 입력한 호스트로 URL을 생성하고 URLConnection을 생성.
        URL url = new URL(host);
        URLConnection urlCon = url.openConnection();
        urlCon.connect();
        // 헤더값을 알아보기 위해서 Map으로 반환
        Map<String, List<String>> map = urlCon.getHeaderFields();
        Set<String> s = map.keySet();
        Iterator<String> iterator = s.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next+" : ");
            List<String>value=map.get(next);
            for(String temp : value){
                System.out.println(temp);
            }// end while
        }
            int len = urlCon.getContentLength();
            System.out.println("문서의 길이 : " + len);
}}
