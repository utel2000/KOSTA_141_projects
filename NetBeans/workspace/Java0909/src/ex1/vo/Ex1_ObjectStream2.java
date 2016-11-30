package ex1.vo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex1_ObjectStream2 {
    public static void main(String[] args) {
        String path = "C:\\Kosta141\\mytest\\resource\\obj.txt";
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){
            // readObject() ȣ���ؼ� ����ȭ �� ��ü�� �����ϴ� �޼���(������ȭ)
            MemberVO v = (MemberVO) ois.readObject();
            System.out.println("�̸� : "+v.getName());
            System.out.println("�ּ� : "+v.getAddr());
            System.out.println("���� : "+v.getPay());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
