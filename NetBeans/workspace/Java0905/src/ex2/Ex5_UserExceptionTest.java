package ex2;
public class Ex5_UserExceptionTest {
//���ܸ� ����! ���θ޼���
    public void test(String[] n) throws Ex5_UserException{
        System.out.println("Test1");
        if(n.length<3){
            // throw�� ���� ���ܸ� �����ؼ� �߻�
            // �׽�Ʈ�� �� ���� ���!
            throw new Ex5_UserException("����");
        }else{
            throw new Ex5_UserException("��������", 703);
        }
    }
    public static void main(String[] args) {
        Ex5_UserExceptionTest ex = new Ex5_UserExceptionTest();
        try{
            String[] ar = "ok/aa/aaa/aaaa/".split("/");
            System.out.println("ar : length" + ar.length);
            ex.test(ar);
        }catch(Ex5_UserException e){
            e.printStackTrace();
        }
    }
}
