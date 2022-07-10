import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Servlet1 extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body><form action='Servlet2' method='post'>Enter amount:<input type='text' name='amt' id='amt'/><br><input type='submit' value='credit'/></form></body></html>");
	}
}