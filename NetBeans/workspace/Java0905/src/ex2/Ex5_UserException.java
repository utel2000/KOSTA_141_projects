package ex2;
// ����� ���� ����ó�� extends Exception ��ӹ޾Ƽ� ���ܸ� ó�� �� ���� �ִ�.
public class Ex5_UserException extends Exception{
    private int port = 772;
    public Ex5_UserException(String message) {
        super(message); // �θ��� �����ڸ� ȣ��!
    }
    public Ex5_UserException(String msg, int port) {
        super(msg);
        this.port = port;
    }
    public int getPort() {
        return port;
    }
}
