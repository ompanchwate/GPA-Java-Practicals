import javax.servlet.*;
import java.io.*;
public class P16 extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse res)
	{
		PrintWriter out =null;
		try
		{
			out = res.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<font face =\"Gabriola\" size=\"30\" color=\"Red\">");
			out.println("Hello world</font>");
			out.println("</body>");
			out.println("</html>");
			out.close();
		}
		catch(Exception ex)
		{
			out.println(ex);
		}
		finally
		{
			out.close();
		}
	}
}