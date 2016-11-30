package ex1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex2_FileInOutStream {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        // 읽어올 파일의 경로
        String path1 = "C:\\Kosta141\\mytest\\resource\\test2.zip";
        // 읽어온 파일을 옮길 경로
        String path2 = "C:\\Kosta141\\mytest\\target\\my2.zip";
        //파일을 읽어 오는 스트림과 새로 작성하는 스트림을 생성하기 위해 선언
        // FileInOutStream은 파일에 연결되는 1차 바이트 스트림!
        FileInputStream fis = null;
        FileOutputStream fos = null;
        // 기능향상을 위해서 제공하는 스트림 : 2차 스트림
        // 장치에는 직접 연결될 수 없고, 반드시 1차 스트림에 의해서 연결됨
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            // 축약형으로 사용을 권장
            fis = new FileInputStream(path1);
            fos = new FileOutputStream(path2);
            // 바이트 스트림일 경우 파일의 끝(EOF) 반환값(-1)
            int readv = -1; // EOF 반환값 -1로 초기화
            while ((readv = fis.read()) != -1) {
                fos.write(readv);
            }
            // flush()는 버퍼일 때 사용, 버퍼를 비워주는 메서드.
            fos.flush();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(); // 예외 출력
        } catch (IOException ex) { // fis.read()일 경우 발생할 수 있는 예외 처리
            ex.printStackTrace(); // 예외 출력
        } finally {
            try {
                // 스트림이 열려 있을 때, 다 사용한 후 반드시 자원을 종료해야 함!
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("걸린 시간 : "+(end-start)+"초");
    }
}
