package ex2;
class Ex8_MyFileInputMain {
    // MyFileInputStream의 close가 호출되는지 증명!(autoClose)
    public static void main(String[] args) {
        try(Ex8_MyFileInputStream fis = new Ex8_MyFileInputStream("file1.txt")){
            fis.read();
            throw new Exception(); // 강제 예외 발생
        }catch(Exception e){
            System.out.println("예외 처리 코드가 실행되었습니다.");
        }
    }
}
