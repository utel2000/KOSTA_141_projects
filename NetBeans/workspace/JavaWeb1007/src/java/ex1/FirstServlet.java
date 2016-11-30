package ex1;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// RequestScope에 대해서 학습
// request객체는 이미 이해한 것과 동일
// -- 핵심 포인트 --
// 이동방식 : 첫번째 서블릿으로 요청이 왔을 때 다른 서블릿으로 이동시키는 방법
@WebServlet("/first")
public class FirstServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 사용자의 아이피를 출력
        System.out.println("아이피"+req.getRemoteAddr());
        System.out.println("첫번째 서블릿 호출!");
        // redirect방식
        // 요청된 브라우저에게 지정된 서블릿으로 강제 이동.
        // 사용자에게 강제로 '다시 요청'하게 만들기 때문에 WAS(톰캣)를 2번 거쳐간다.
        // 다시 말해 이동되기 전에 설정한 값이 이동된 후의 서블릿에서 이어지지 않는다.
        // sendRedirect의 주체는 request가 아니고 response 객체다.
        // RequestScope에 msg란 이름으로 hi라는 값을 저장!
        req.setAttribute("msg","hi");
        
//        resp.sendRedirect("second"); // 1. response 되어서 강제로 이동.
        
        // -----------------------------------
        // forward
        // -----------------------------------
        // 주체는 request이며, 서버 관점에서는 요청이 한 번만 일어 나는 것.
        // url이 변경이 없다.
        // 포워딩 될 때 RequestDispatcher에 의해서 실행되며
        // forward메서드를 통해서 동일한 객체를 전달 해주기 때문에
        // A -> B는 같은 RequestScope 영역을 공유한다.
        RequestDispatcher rd = req.getRequestDispatcher("second");
        rd.forward(req,resp);
    }
}
