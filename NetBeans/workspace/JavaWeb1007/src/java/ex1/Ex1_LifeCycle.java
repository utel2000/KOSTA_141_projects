package ex1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/lifetest")
public class Ex1_LifeCycle extends HttpServlet {

    // 객체 생성시 최초 1번 실행.
    public Ex1_LifeCycle() {
        System.out.println("★ 생성자 호출 ★");
    }

    // 쓰레드가 관리하며 요청이 올 때마다 생성.
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("★ service ★");
    }

    // 서블릿 초기화 메서드
    @Override
    public void init() throws ServletException {
        System.out.println("★ init ★");
    }

    // init을 해제할 때
    @Override
    public void destroy() {
        System.out.println("★ destroy ★");
    }
    
}
