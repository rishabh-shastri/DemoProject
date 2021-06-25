package abc;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4939510584106524120L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		int i = Integer.parseInt(req.getParameter("num1")) ;
		int j = Integer.parseInt(req.getParameter("num2")) ;
		int k = i+j;
		res.getWriter().println("output is : " +k);
	}
	

}
