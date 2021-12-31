import javax.servlet.http.*;
import java.io.*;
public class P19 extends HttpServlet
{
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		PrintWriter out =null;
		try
		{
			out=res.getWriter();
			String nam= req.getParameter("username");
			Cookie co= new Cookie("Cookie",nam);
			res.addCookie(co);
			out.println("<html><body>");
			out.println("Cokkies set</body></html>");
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