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
        // ���̹��� url�� �������ִ� URLŬ������ ���� �غ���.
        URL urlv = new URL(url);
        // ������ �� ���̹��� ���� ������ ��Ʈ������ �о� ����
        InputStream is = urlv.openStream();
        // MIMETYPE��......
        // ���� ������ ������� �ڵ��� Ŭ���̾�Ʈ�� ���߾�� �Ѵ�.
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
