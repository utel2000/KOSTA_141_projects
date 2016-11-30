package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("두번째 서플릿 호출!");
        String msg = (String) req.getAttribute("msg");
        System.out.println("MSG : "+msg);
        PrintWriter out = resp.getWriter();
        out.println("<body style='background:pink'>Second Page "+ msg + "</body>");
    }

}
