package ex1;
// 최초의 서블릿을 작성합시다 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ex1_Server", urlPatterns = "/Ex1_Server")
public class Ex1_Server extends HttpServlet{

    // 폼의 데이터를 전송받아서 처리한다.
    // service() : 요청을 분석하는 역할을 수행(비지니스 로직을 수행x)
    // get -> doGet(), post -> doPost()
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("euc-kr");
        resp.setContentType("text/html;charset=euc-kr");
        // 폼에서 전달되어오는 파라미터를 처리
        String id=req.getParameter("id");
        String pwd=req.getParameter("pwd");
        String priv=req.getParameter("priv");
        PrintWriter pw = resp.getWriter();
        pw.println("<div style='width:300px; background:pink'>");
        pw.println("아이디 : "+id+"</div>");
        pw.println("<div style='width:300px; background:orange'>");
        pw.println("비밀번호 : "+pwd+"</div>");
        pw.println("<div style='width:300px; background:green'>");
        pw.println("권한 : "+priv+"</div>");
        pw.println("<a href='ex1_form.html'>입력하기</a>");
    }
    
    
}
