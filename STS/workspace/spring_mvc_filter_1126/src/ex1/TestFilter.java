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
		// filter�ʱ�ȭ
		System.out.println("Filter �ʱ�ȭ");
	}
	@Override
	public void destroy() {
		// ���Ͱ� �ݳ��� �ڿ�
		System.out.println("Filter�� �ݳ��� ����");
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("Start!");
		filterChain.doFilter(request, response);
		System.out.println("End!");
		System.out.println("--------------------");
		filterChain.doFilter(request, response);
		System.out.println("���ƾƾƾ�");
		System.out.println("����������");
		
	}
}