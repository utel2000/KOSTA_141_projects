package ex1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Ex2_InputStreamURL {
    public static void main(String[] args) throws MalformedURLException, IOException {
        String url = "http://www.naver.com";
        // 네이버에 url로 접속해주는 URL클래스를 생성 해보자.
        URL urlv = new URL(url);
        // 접속한 후 네이버의 서버 문서를 스트림으로 읽어 오기
        InputStream is = urlv.openStream();
        // MIMETYPE중......
        // 서버 문서의 언어지원 코딩을 클라이언트도 맞추어야 한다.
        // BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        String str = null;
        // while ((str = br.readLine()) != null){
        //     System.out.println(str);
        // }
        Scanner sc = new Scanner(new BufferedInputStream(is), "UTF-8");
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}
