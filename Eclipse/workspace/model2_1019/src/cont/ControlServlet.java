package cont;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Action;

@WebServlet("*.kosta")
public class ControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// log start
		StringBuffer log = new StringBuffer();
		System.out.println("<ControllServlet>-void process(HttpServletRequest request, HttpServletResponse response)");
		// log end
		
		request.setCharacterEncoding("euc-kr");;
		String cmd = request.getParameter("cmd");

		// log start
		log.append("[log] 컨트롤 서블릿 실행.\n")
		.append("[log] cmd : ").append(cmd).append("\n");
		System.out.println(log);
		log.delete(0, log.length());
		// log end

		if(cmd != null) {
			ActionFactory factory = ActionFactory.getFactory();
			Action menu = factory.getAction(cmd);
			// 결정
			ActionForward af = menu.execute(request, response);
			if(af.isRedirect()){
				response.sendRedirect(af.getUrl());
			}else{
				RequestDispatcher rd = request.getRequestDispatcher(af.getUrl());
						rd.forward(request, response);
			}
		}
	}

}
