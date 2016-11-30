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
// BridgeStream : ����Ʈ ��Ʈ���� ���� ��Ʈ������ ���� ���� �ִ� ��Ʈ��
// InputStream���� ���� �� �� �̰��� ���� ��Ʈ������ ��ȯ �ؼ� ����Ϸ��� �� ��.
// InputStreamReader, OutputStreamWriter Ŭ�����̴�.
// ������ �ᱹ ���߿� ����ϴ°� Scanner�� PrintWriter ���� ���̴�?!

public class Ex2_BridgeStream {

    private static String path = "C:\\Kosta141\\mytest\\resource\\data1.txt";

    public static void inputBridge() {
        // Ű���� : ǥ�� �Է� ����Ʈ ��Ʈ��
        // InputStream is = System.in; // Ű����� �о���� ����
        // ���Ϸ� �о���� ����
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
            bw.write("Test�Դϴ�.");
            bw.newLine();
            bw.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    // no �긴�� ��Ʈ�� !! ���� ����ϴ� ���´� �ſ� �߿�!! *****
    public static void useScanner() throws FileNotFoundException{
        // Scanner ����ؼ� �긴�� ��Ʈ�� ���� path�� ���ڿ� ȭ�鿡 ���.
        Scanner sc = new Scanner(new BufferedInputStream(new FileInputStream(path)));
        while (sc.hasNext()){
            String msg = sc.nextLine();
            System.out.println(msg);
        }
    }
    public static void usePrintWriter() throws FileNotFoundException {
        // PrintWriter Ư¡ : autoflush�� �����ϰ�
        // println()�޼��带 ����ؼ� �� �� ������ ���ڿ��� ����!
        // ���� ��Ʈ���� ������ ���(type1)
        // printWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path)), true);
        // ����Ʈ ��Ʈ���� ������ ���(type 2) // �긴�� ��Ʈ���� ������� �ʰ� ���� ����.
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream(path, true)),true);
        // ln�� �� �� ������ �����͸� ��Ʈ���� ���ؼ� ����.
        pw.println("������ ���ڿ�!");
    }
    public static void main(String[] args) throws FileNotFoundException {
//        inputBridge();
//        outputBridge();
//        useScanner();
        usePrintWriter();
    }
}
