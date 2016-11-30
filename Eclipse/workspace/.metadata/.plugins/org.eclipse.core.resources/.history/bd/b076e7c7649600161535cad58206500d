package model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cont.ActionForward;
import dao.SBoardDao;
import vo.SBoardVO;

public class SBoardAddAction implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// VO값을 저장.
		SBoardVO vo = new SBoardVO();
		vo.setSub(request.getParameter("sub"));
		vo.setWriter(request.getParameter("writer"));
		vo.setPwd(request.getParameter("pwd"));
		vo.setCont(request.getParameter("cont"));
		vo.setReip(request.getParameter("reip"));
		vo.setImg(request.getParameter("upfile"));
		SBoardDao.getDao().save(vo);
		// DAO 연결.
		return new ActionForward("list.kosta?cmd=slist", true);
	}
}
