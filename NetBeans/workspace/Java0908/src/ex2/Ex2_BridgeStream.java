package ex2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
// BridgeStream : 바이트 스트림을 문자 스트림으로 연결 시켜 주는 스트림
// InputStream으로 연결 될 때 이것을 문자 스트림으로 변환 해서 사용하려고 할 때.
// InputStreamReader, OutputStreamWriter 클래스이다.
// 하지만 결국 나중에 사용하는건 Scanner와 PrintWriter 뿐일 것이다?!

public class Ex2_BridgeStream {

    private static String path = "C:\\Kosta141\\mytest\\resource\\data1.txt";

    public static void inputBridge() {
        // 키보드 : 표준 입력 바이트 스트림
        // InputStream is = System.in; // 키보드로 읽어들인 예제
        // 파일로 읽어들인 예제
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            String msg = null;
            while ((msg = br.readLine()) != null) {
                System.out.println("Msg : " + msg);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void outputBridge() {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)))) {
            bw.write("Test입니다.");
            bw.newLine();
            bw.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    // no 브릿지 스트림 !! 많이 사용하는 형태니 매우 중요!! *****
    public static void useScanner() throws FileNotFoundException{
        // Scanner 사용해서 브릿지 스트림 없이 path의 문자열 화면에 출력.
        Scanner sc = new Scanner(new BufferedInputStream(new FileInputStream(path)));
        while (sc.hasNext()){
            String msg = sc.nextLine();
            System.out.println(msg);
        }
    }
    public static void usePrintWriter() throws FileNotFoundException {
        // PrintWriter 특징 : autoflush를 제공하고
        // println()메서드를 사용해서 한 줄 단위로 문자열을 전송!
        // 문자 스트림을 연결한 경우(type1)
        // printWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path)), true);
        // 바이트 스트림을 연결한 경우(type 2) // 브릿지 스트림을 사용하지 않고 직접 연결.
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream(path, true)),true);
        // ln은 한 줄 단위로 데이터를 스트림을 통해서 전송.
        pw.println("전송할 문자열!");
    }
    public static void main(String[] args) throws FileNotFoundException {
//        inputBridge();
//        outputBridge();
//        useScanner();
        usePrintWriter();
    }
}
