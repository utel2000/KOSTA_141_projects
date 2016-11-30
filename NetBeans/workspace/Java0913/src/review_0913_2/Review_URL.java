package review_0913_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Review_URL {

    public static void main(String[] args) {
        try {
            String path = "c:/Kosta141/mytest/resource/reviewTest.txt";
            String url = "http://www.naver.com/";
            URL myUrl = new URL(url);
            InputStream is = myUrl.openStream();
//            File f = new File(path);
            PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream(path)),true);
            Scanner sc = new Scanner(new BufferedInputStream(is), "UTF-8");
            while(sc.hasNext()){
                pw.println(sc.nextLine());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
