package or.kosta.spring.inter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
public class MyHandlerInterceptor extends HandlerInterceptorAdapter{
	// Controller에 들어가기 전 접근
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle 동작!");
		HandlerMethod method = (HandlerMethod) handler;
		System.out.println("Bean: " + method.getBean());
		System.out.println("Method: " + method.getMethod());
		return true;
	}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("viewName: " + modelAndView.getViewName());
		modelAndView.addObject("today", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
	}
}
