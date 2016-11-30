package ex2;
public class Ex5_UserExceptionTest {
//예외를 위임! 메인메서드
    public void test(String[] n) throws Ex5_UserException{
        System.out.println("Test1");
        if(n.length<3){
            // throw는 강제 예외를 생성해서 발생
            // 테스트할 때 자주 사용!
            throw new Ex5_UserException("없음");
        }else{
            throw new Ex5_UserException("최종예선", 703);
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
