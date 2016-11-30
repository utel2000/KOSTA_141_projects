package model;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cont.ActionForward;

public class HelloAction implements Action {
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 비즈니스 로직을 수행 한다.
		String msg = "Hello! 나의 첫번째 MVC!";
		request.setAttribute("msg",  msg);
		// false일 경우는 forward하겠다.
		return new ActionForward("hello.jsp", false);
	}
}
