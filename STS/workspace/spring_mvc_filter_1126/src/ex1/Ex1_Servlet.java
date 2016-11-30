package ex1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Ex1_Servlet")
public class Ex1_Servlet extends HttpServlet{
	public Ex1_Servlet() {
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	protected void process(HttpServletRequest requuest, HttpServletResponse response) throws IOException {
		PrintWriter pw = response.getWriter();
		pw.println("Test");
		System.out.println("Tester");
	}
}
