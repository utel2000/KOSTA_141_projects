package ex1.vo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ex1_ObjectStream {

    public static void main(String[] args) {
        String path = "C:\\Kosta141\\mytest\\resource\\obj.txt";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            // ������ ��ü�� ����
            MemberVO v = new MemberVO();
            v.setName("��浿");
            v.setPay(5000);
            v.setAddr("�Ǳ�");
            // ����ȭ, implements Serializable
            oos.writeObject(v);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
