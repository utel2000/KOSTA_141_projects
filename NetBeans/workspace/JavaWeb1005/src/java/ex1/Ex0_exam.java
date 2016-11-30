package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/today")
public class Ex0_exam extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        System.out.println("��û��� �м� : "+req.getMethod());
        req.setCharacterEncoding("euc-kr");
        // �������� ����Ÿ��(MIMETYPE)����
        resp.setContentType("text/html;charset=euc-kr");
        System.out.println("�Է��� �̸� : " + name);
        String todate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        System.out.println("������ ��¥ : "+ todate);
        // Web���������� html�� ���� ����
        PrintWriter pw = resp.getWriter();
        pw.println("<p style='color:red'>���� ��¥");
        pw.println(todate);
        pw.println("</p>");
        pw.println("<h1>");
        pw.println(name);
        pw.println("</h1>");
    }
}
