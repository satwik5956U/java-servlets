import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Servlet4 extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,FileNotFoundException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		File f=new File("C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\ServletDemo\\Details.txt");
		BufferedReader bf=new BufferedReader(new FileReader(f));
		String s;
		String str="";
		while((s=bf.readLine())!=null){
			str+=s;
		}
		String amt=req.getParameter("amt");
		int curamt=Integer.parseInt(amt)*(-1)+Integer.parseInt(str);
		out.println("new amount is "+curamt);
		bf.close();
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		bw.write(""+curamt);
		bw.close();
	}
}