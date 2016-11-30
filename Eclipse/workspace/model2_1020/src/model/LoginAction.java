package model;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cont.ActionForward;
import dao.LoginDemoDao;

public class LoginAction implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		Map<String, String> m = new HashMap<>();
		m.put("uid", id);
		m.put("pwd", pwd);
		String res = LoginDemoDao.getDao().loginProcess(m);
		String url = "";
		if (res != null) {
			HttpSession session = request.getSession();
			session.setAttribute("uid", id);
			session.setAttribute("name", res);
			url = "index.kosta?cmd=index";
		} else {
			url = "index.kosta?cmd=index";
		}
		return new ActionForward(url, true);
	}
}
