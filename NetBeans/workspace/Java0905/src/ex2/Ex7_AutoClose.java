package ex2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ex7_AutoClose {
    public static void main(String[] args) {              
        // try - with - resources JDK 7���� �̻���� autoClose�� ����!
        // implements Closeable ������ Ŭ������ �����ϴ�.
        try (FileInputStream fis = new FileInputStream("c:/www/a.txt")) {
            fis.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
