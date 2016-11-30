package ex1.vo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ex1_ObjectStream {

    public static void main(String[] args) {
        String path = "C:\\Kosta141\\mytest\\resource\\obj.txt";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            // 전송할 객체를 생성
            MemberVO v = new MemberVO();
            v.setName("김길동");
            v.setPay(5000);
            v.setAddr("판교");
            // 직렬화, implements Serializable
            oos.writeObject(v);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
