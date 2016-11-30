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
        System.out.println("요청방식 분석 : "+req.getMethod());
        req.setCharacterEncoding("euc-kr");
        // 브라우저의 마임타입(MIMETYPE)지정
        resp.setContentType("text/html;charset=euc-kr");
        System.out.println("입력한 이름 : " + name);
        String todate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        System.out.println("오늘의 날짜 : "+ todate);
        // Web브라우저에게 html로 만들어서 전달
        PrintWriter pw = resp.getWriter();
        pw.println("<p style='color:red'>오늘 날짜");
        pw.println(todate);
        pw.println("</p>");
        pw.println("<h1>");
        pw.println(name);
        pw.println("</h1>");
    }
}
