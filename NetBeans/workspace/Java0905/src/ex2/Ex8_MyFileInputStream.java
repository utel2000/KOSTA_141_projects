package ex2;
// 실제 오토클로즈가 실행되는지 점검하는 것이 취지!
public class Ex8_MyFileInputStream implements AutoCloseable{
    private String file;
    public Ex8_MyFileInputStream(String file){
        this.file = file;
    }
    public void read(){
        System.out.println(file + "을 읽었습니다.");
    }
    @Override
    public void close() throws Exception {
        System.out.println(file + "을 닫았습니다.");
    }
}
