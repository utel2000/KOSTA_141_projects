package ex1.vo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex1_ObjectStream2 {
    public static void main(String[] args) {
        String path = "C:\\Kosta141\\mytest\\resource\\obj.txt";
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){
            // readObject() 호출해서 직렬화 된 객체를 조립하는 메서드(역직렬화)
            MemberVO v = (MemberVO) ois.readObject();
            System.out.println("이름 : "+v.getName());
            System.out.println("주소 : "+v.getAddr());
            System.out.println("연봉 : "+v.getPay());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
