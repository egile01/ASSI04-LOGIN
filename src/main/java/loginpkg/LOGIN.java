package loginpkg;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class LOGIN extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String un= request.getParameter("uname");
		String ps = request.getParameter("pass");
		
		if(un.equals("akash") && ps.equals("aks")) {
			out.print("<h1>Login Successfully !!!!!!!</h1>");
		}else {
			out.print("<h1>Login Failed !!!!!!!</h1>");
		}
		out.close();
	}

}
