package ex1;
// ������ ������ �ۼ��սô� */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ex1_Server", urlPatterns = "/Ex1_Server")
public class Ex1_Server extends HttpServlet{

    // ���� �����͸� ���۹޾Ƽ� ó���Ѵ�.
    // service() : ��û�� �м��ϴ� ������ ����(�����Ͻ� ������ ����x)
    // get -> doGet(), post -> doPost()
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("euc-kr");
        resp.setContentType("text/html;charset=euc-kr");
        // ������ ���޵Ǿ���� �Ķ���͸� ó��
        String id=req.getParameter("id");
        String pwd=req.getParameter("pwd");
        String priv=req.getParameter("priv");
        PrintWriter pw = resp.getWriter();
        pw.println("<div style='width:300px; background:pink'>");
        pw.println("���̵� : "+id+"</div>");
        pw.println("<div style='width:300px; background:orange'>");
        pw.println("��й�ȣ : "+pwd+"</div>");
        pw.println("<div style='width:300px; background:green'>");
        pw.println("���� : "+priv+"</div>");
        pw.println("<a href='ex1_form.html'>�Է��ϱ�</a>");
    }
    
    
}
