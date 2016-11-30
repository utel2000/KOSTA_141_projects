package ex1;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter(urlPatterns="/*")
public class TestFilter implements Filter{
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// filter초기화
		System.out.println("Filter 초기화");
	}
	@Override
	public void destroy() {
		// 필터가 반납할 자원
		System.out.println("Filter가 반납할 지원");
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("Start!");
		filterChain.doFilter(request, response);
		System.out.println("End!");
		System.out.println("--------------------");
		filterChain.doFilter(request, response);
		System.out.println("으아아아아");
		System.out.println("히이이이잉");
		
	}
}
