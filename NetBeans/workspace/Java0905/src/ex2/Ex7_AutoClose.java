package ex2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ex7_AutoClose {
    public static void main(String[] args) {              
        // try - with - resources JDK 7버전 이상부터 autoClose를 구현!
        // implements Closeable 구현된 클래스만 가능하다.
        try (FileInputStream fis = new FileInputStream("c:/www/a.txt")) {
            fis.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
