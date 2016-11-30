package ex1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/lifetest")
public class Ex1_LifeCycle extends HttpServlet {

    // ��ü ������ ���� 1�� ����.
    public Ex1_LifeCycle() {
        System.out.println("�� ������ ȣ�� ��");
    }

    // �����尡 �����ϸ� ��û�� �� ������ ����.
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("�� service ��");
    }

    // ���� �ʱ�ȭ �޼���
    @Override
    public void init() throws ServletException {
        System.out.println("�� init ��");
    }

    // init�� ������ ��
    @Override
    public void destroy() {
        System.out.println("�� destroy ��");
    }
    
}
