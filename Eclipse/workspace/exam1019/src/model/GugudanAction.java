package model;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cont.ActionForward;

public class GugudanAction implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		StringBuffer sb = new StringBuffer();
		ArrayList<String> gugudanList = new ArrayList<>();
		for(int i=0; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i==0){
					sb.append(j).append("´Ü\t");
				}else{
					sb.append(j).append(" x ").append(i).append(" = ").append(j*i).append("\t");
				}
			}
			sb.append("\n");
			gugudanList.add(sb.toString());
			sb.delete(0, sb.length());
		}
		request.setAttribute("gugudan", gugudanList);
		return new ActionForward("gugudan.jsp", false);
	}
}
