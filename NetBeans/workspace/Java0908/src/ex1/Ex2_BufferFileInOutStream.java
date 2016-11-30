package ex1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex2_BufferFileInOutStream {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        // �о�� ������ ���
        String path1 = "C:\\Kosta141\\mytest\\resource\\test1.zip";
        // �о�� ������ �ű� ���
        String path2 = "C:\\Kosta141\\mytest\\target\\my1.zip";
        //������ �о� ���� ��Ʈ���� ���� �ۼ��ϴ� ��Ʈ���� �����ϱ� ���� ����
        // FileInOutStream�� ���Ͽ� ����Ǵ� 1�� ����Ʈ ��Ʈ��!
        FileInputStream fis = null;
        FileOutputStream fos = null;
        // �������� ���ؼ� �����ϴ� ��Ʈ�� : 2�� ��Ʈ��
        // ��ġ���� ���� ����� �� ����, �ݵ�� 1�� ��Ʈ���� ���ؼ� �����
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            // ���� : ������ ������ �����ε��� API �� ���� �����ϱ�
            // fis = new FileInputStream(path1);
            // fos = new FileOutputStream(path2);
            // bis = new BufferedInputStream(fis);
            // bos = new BufferedOutputStream(fos);
            // ��������� ����� ����
            bis = new BufferedInputStream(new FileInputStream(path1));
            bos = new BufferedOutputStream(new FileOutputStream(path2));
            // fis�� ����ؼ� 1����Ʈ�� �ݺ��ؼ� �о� ���鼭
            // fos�� ���ؼ� 1����Ʈ�� �ش� ��ο� �ۼ��ϵ��� �Ѵ�.
            // ����Ʈ ��Ʈ���� ��� ������ ��(EOF) ��ȯ��(-1)
            // bis.read() : 1����Ʈ�� �о�� �޼���, buffer����
            // bos.write() : 1����Ʈ�� �ۼ��ϴ� �޼���, buffer����
            int readv = -1; // �ʱ�ȭ
            while ((readv = bis.read()) != -1) {
                bos.write(readv);
            }
            // flush()�� ������ �� ���, ���۸� ����ִ� �޼���.
            bos.flush();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(); // ���� ���
        } catch (IOException ex) { // fis.read()�� ��� �߻��� �� �ִ� ���� ó��
            ex.printStackTrace(); // ���� ���
        } finally {
            try {
                // ��Ʈ���� ���� ���� ��, �� ����� �� �ݵ�� �ڿ��� �����ؾ� ��!
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("�ɸ� �ð� : "+(end-start)+"��");
    }
}
