package ex2;
// ���� ����Ŭ��� ����Ǵ��� �����ϴ� ���� ����!
public class Ex8_MyFileInputStream implements AutoCloseable{
    private String file;
    public Ex8_MyFileInputStream(String file){
        this.file = file;
    }
    public void read(){
        System.out.println(file + "�� �о����ϴ�.");
    }
    @Override
    public void close() throws Exception {
        System.out.println(file + "�� �ݾҽ��ϴ�.");
    }
}
