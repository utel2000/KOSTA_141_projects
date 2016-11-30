package ex1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* ������ ���� �ۼ��ϱ�
HttpServlet ��ӹ޾Ƽ� ���������̳�(��Ĺ)���� �����Ǵ�
�ڹٰ�ü�� �ȴ�.
Ư¡, �����(IoC), main���κ��� ����Ǵ� ���� �ƴ϶�,
��û�� ��� �ϰ� �ִٰ� ��û�� ���� �� WAS�� ���ؼ�
service�޼��尡 ����(ȣ��)�ȴ�. 
*/
@WebServlet("/hello") // hello�� ��û�� ������ Ex0_HelloServlet�� ������ ȣ��.
public class Ex0_HelloServlet extends HttpServlet {
    // ��û�� ������ standalone������ �������� ���� �ȴ�.    
    // Tomcat�� ȣ�� �� ��, ��û, ���䰴ü�� �����ؼ�
    // ������ ���ڷ� �����մϴ�.(Socket�� �ּҿ� �ش�)
    // HttpServletRequest : ��û�� ó���� ��ü(����)
    // HttpServletResponse : ������ ó���� ��ü
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // ������ ��û�� �ޱ� ���� �Լ�
        // get������� test=hello�� �޼����� ����.
        String msg = req.getParameter("test");
        System.out.println("Msg : "+msg);
        // ���� �� ���� ��û�� hello��� WAS�� ���� ��ü�� �����ؼ�
        // SERVICE �޼��带 ȣ���ϵ��� �����ؾ� �Ѵ�.
        // web.xml...............
    }
}
