package ex1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 최초의 서블렛 작성하기
HttpServlet 상속받아서 서블릿컨테이너(톰캣)에게 관리되는
자바객체가 된다.
특징, 제어역행(IoC), main으로부터 실행되는 것이 아니라,
요청을 대기 하고 있다가 요청이 왔을 때 WAS에 의해서
service메서드가 실행(호출)된다. 
*/
@WebServlet("/hello") // hello란 요청이 들어오면 Ex0_HelloServlet을 꺼내서 호출.
public class Ex0_HelloServlet extends HttpServlet {
    // 요청과 응답은 standalone형식의 데몬으로 관리 된다.    
    // Tomcat이 호출 할 때, 요청, 응답객체를 생성해서
    // 서비스의 인자로 전달합니다.(Socket의 주소에 해당)
    // HttpServletRequest : 요청을 처리할 객체(도구)
    // HttpServletResponse : 응답을 처리할 객체
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 간단한 요청을 받기 위한 함수
        // get방식으로 test=hello란 메세지를 전달.
        String msg = req.getParameter("test");
        System.out.println("Msg : "+msg);
        // 이제 할 일은 요청이 hello라면 WAS가 현재 객체를 실행해서
        // SERVICE 메서드를 호출하도록 매핑해야 한다.
        // web.xml...............
    }
}
