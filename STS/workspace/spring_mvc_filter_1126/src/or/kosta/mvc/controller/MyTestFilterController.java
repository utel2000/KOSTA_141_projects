package or.kosta.mvc.controller;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import or.kosta.mvc.dao.MyTesterBean;
//@WebFilter(filterName="springSecurityFilterChain", urlPatterns={"/admin/*"})
@Service("springSecurityFilterChain")
public class MyTestFilterController implements Filter{
	// DelegatingFilterProxy�� ����ϱ� ������
	// Spring Container�� �ڿ��� DI���� �� ������.
	@Autowired
	private MyTesterBean myTesterBean;
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("Start!");
		System.out.println("MyTesterBean�� ���Թ���: " + myTesterBean.testerMsg());
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		System.out.println("UID1: " + session.getAttribute("uid"));
		if(session.getAttribute("uid") == null) {
			resp.sendRedirect(req.getContextPath() + "/error");
			return;
		}else {
			System.out.println("UID: " + session.getAttribute("uid"));
			if(session.getAttribute("uid").equals("javabook")) {
				System.out.println("�����ڴ� ȯ���մϴ�.");
			}else {
				resp.sendRedirect(req.getContextPath() + "/error");
				return;
			}
		}
		filterChain.doFilter(request, response);
	}
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}
	@Override
	public void destroy() {
	}
}