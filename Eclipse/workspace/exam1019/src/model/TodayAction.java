package model;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cont.ActionForward;

public class TodayAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String todate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		request.setAttribute("todate",  todate);
		return new ActionForward("today.jsp", false);
	}
}
