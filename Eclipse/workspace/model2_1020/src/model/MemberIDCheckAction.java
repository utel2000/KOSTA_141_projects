package model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cont.ActionForward;
import dao.MemberDAO;

public class MemberIDCheckAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// log start
		StringBuffer log = new StringBuffer();
		System.out.println("<MemberIDCheckAction> - public ActionForward execute(HttpServletRequest request, HttpServletResponse response)");
		// log end
		
		request.setCharacterEncoding("euc-kr");
		String idv = request.getParameter("id");
		
		System.out.println("[Log] Log : " + idv);
		
		int res = MemberDAO.getDao().checkId(idv);
		String msg = "";
		if (res > 0) {
			msg = "<h2 style='color: red;'>��� ���� ���̵��Դϴ�.</h2>";
		} else {
			msg = "<h2 style='color: blue;'>��� ������ ���̵��Դϴ�.</h2>";
		}
		request.setAttribute("msg", msg);
		return new ActionForward("idCheckResult.jsp", false);
	}
}