package model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cont.ActionForward;
import dao.SBoardDao;
import vo.SBoardVO;

public class SBoardListAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			ArrayList<SBoardVO> arlist = SBoardDao.getDao().list();
			request.setAttribute("slist", arlist);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return new ActionForward("list.jsp", false);
	}
}
