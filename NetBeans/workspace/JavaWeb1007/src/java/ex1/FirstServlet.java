package ex1;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// RequestScope�� ���ؼ� �н�
// request��ü�� �̹� ������ �Ͱ� ����
// -- �ٽ� ����Ʈ --
// �̵���� : ù��° �������� ��û�� ���� �� �ٸ� �������� �̵���Ű�� ���
@WebServlet("/first")
public class FirstServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // ������� �����Ǹ� ���
        System.out.println("������"+req.getRemoteAddr());
        System.out.println("ù��° ���� ȣ��!");
        // redirect���
        // ��û�� ���������� ������ �������� ���� �̵�.
        // ����ڿ��� ������ '�ٽ� ��û'�ϰ� ����� ������ WAS(��Ĺ)�� 2�� ���İ���.
        // �ٽ� ���� �̵��Ǳ� ���� ������ ���� �̵��� ���� �������� �̾����� �ʴ´�.
        // sendRedirect�� ��ü�� request�� �ƴϰ� response ��ü��.
        // RequestScope�� msg�� �̸����� hi��� ���� ����!
        req.setAttribute("msg","hi");
        
//        resp.sendRedirect("second"); // 1. response �Ǿ ������ �̵�.
        
        // -----------------------------------
        // forward
        // -----------------------------------
        // ��ü�� request�̸�, ���� ���������� ��û�� �� ���� �Ͼ� ���� ��.
        // url�� ������ ����.
        // ������ �� �� RequestDispatcher�� ���ؼ� ����Ǹ�
        // forward�޼��带 ���ؼ� ������ ��ü�� ���� ���ֱ� ������
        // A -> B�� ���� RequestScope ������ �����Ѵ�.
        RequestDispatcher rd = req.getRequestDispatcher("second");
        rd.forward(req,resp);
    }
}
