package ex2;
class Ex8_MyFileInputMain {
    // MyFileInputStream�� close�� ȣ��Ǵ��� ����!(autoClose)
    public static void main(String[] args) {
        try(Ex8_MyFileInputStream fis = new Ex8_MyFileInputStream("file1.txt")){
            fis.read();
            throw new Exception(); // ���� ���� �߻�
        }catch(Exception e){
            System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
        }
    }
}
