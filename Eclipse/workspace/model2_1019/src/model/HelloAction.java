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
		// ����Ͻ� ������ ���� �Ѵ�.
		String msg = "Hello! ���� ù��° MVC!";
		request.setAttribute("msg",  msg);
		// false�� ���� forward�ϰڴ�.
		return new ActionForward("hello.jsp", false);
	}
}
