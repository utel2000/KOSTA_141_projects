package model;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cont.ActionForward;
import dao.UserDao;
import vo.UserVO;

public class LoginAction implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// log start
		StringBuffer log = new StringBuffer();
		System.out.println("<LoginAction> - public ActionForward execute(HttpServletRequest request, HttpServletResponse response)");
		// log end
		
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		// log start
		log.append("[Log] id : ").append(id).append("\n")
		.append("[Log] pwd : ").append(pwd).append("\n");
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		String url = null;
		Map<String, String> m = new HashMap<>();
		m.put("id", id);
		m.put("pwd", pwd);
		UserVO vo = new UserVO();
		vo = UserDao.getDao().loginProcess(m);
		
		// log start
		log.append("<LoginAction> - public ActionForward execute(HttpServletRequest request, HttpServletResponse response)\n")
		.append("[Log] vo.getNum() : ").append(vo.getNum()).append("\n")
		.append("[Log] vo.getId() : ").append(vo.getId()).append("\n");
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		if(vo.getNum() != 0) {
			url = "survey.kosta?cmd=survey";
			HttpSession session = request.getSession();
			session.setAttribute("num", vo.getNum());
			session.setAttribute("id", vo.getId());
		} else {
			url = "login.kosta?cmd=loginForm";
		}
		
		// log start
		log.append("[Log] url : ").append(url).append("\n");
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		return new ActionForward(url, false);
	}
}
