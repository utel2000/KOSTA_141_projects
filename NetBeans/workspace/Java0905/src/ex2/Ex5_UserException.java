package ex2;
// 사용자 정의 예외처리 extends Exception 상속받아서 예외를 처리 할 수도 있다.
public class Ex5_UserException extends Exception{
    private int port = 772;
    public Ex5_UserException(String message) {
        super(message); // 부모의 생성자를 호출!
    }
    public Ex5_UserException(String msg, int port) {
        super(msg);
        this.port = port;
    }
    public int getPort() {
        return port;
    }
}
