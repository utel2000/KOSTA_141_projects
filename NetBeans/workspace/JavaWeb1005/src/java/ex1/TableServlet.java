package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TableServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.println("<table style='border:1px solid;'>");
        for (int i = 1; i <= 9; i++) {
            pw.println("<tr>");
            for (int j = 2; j <= 9; j++) {
                pw.println("<td style='border:1px solid;'>");
                pw.println(j+"x"+i+"="+(j*i));
                pw.println("</td>");
            }
            System.out.println("</td>");
        }
        pw.println("</table>");
    }
}
