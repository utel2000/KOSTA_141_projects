package model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cont.ActionForward;
import dao.UserDao;

public class LoginIDChkAction implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// log start
		StringBuffer log = new StringBuffer();
		System.out.println("<LoginIDCheckAction> - public ActionForward execute(HttpServletRequest request, HttpServletResponse response)");
		// log end

		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");

		// log start
		log.append("[Log] id : ").append(id).append("\n");
		System.out.println(log);
		log.delete(0, log.length());
		// log end

		int res = UserDao.getDao().idChk(id);
		String msg = "";
		if (res > 0) {
			msg = "<h2 style='color: blue;'>올바른 아이디입니다.</h2>";
		} else {
			msg = "<h2 style='color: red;'>올바른 아이디를 입력해주세요.</h2>";
		}
		request.setAttribute("msg", msg);
		return new ActionForward("idchkresult.jsp", false);
	}
}
