package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudan")
public class GuGuServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("euc-kr");
        resp.setContentType("text/html;charset=euc-kr");
        int dan = Integer.parseInt(req.getParameter("dan"));
        int limit = Integer.parseInt(req.getParameter("limit")) / 2;
        String dancol = req.getParameter("dancol");
        PrintWriter pw = resp.getWriter();
        pw.println("<table style='border:1px solid;'>");

        for (int i = 0; i <= 9; i++) {
            pw.println("<tr>");
            pw.println("</tr><tr>");
            for (int j = dan - (limit); j <= dan + limit; j++) {
                if (i == 0) { 
                    if (j == dan) { // if안에 if쓰지마!!!!!!!
                        pw.println("<td style='border:1px solid; background-color: " + dancol + ";'>");
                    } else {
                        pw.println("<td style='border:1px solid;'>");
                    }
                    pw.println(j + "단");
                    pw.println("</td>");
                } else { 
                    if (j == dan) { // if 안에 if 쓰지마!!!!!!!
                        pw.println("<td style='border:1px solid; background-color: " + dancol + ";'>");
                    } else {
                        pw.println("<td style='border:1px solid;'>");
                    }
                    pw.println(j + "x" + i + "=" + (j * i));
                    pw.println("</td>");
                }
            }
            System.out.println("</td>");
        }
        pw.println("</table>");
    }
}
