import javax.servlet.http.*;
import java.io.*;
public class P22show extends HttpServlet
{
@Override
public void doGet(HttpServletRequest req,HttpServletResponse res)
{
PrintWriter out =null;
try
{
HttpSession session=req.getSession();
String language=(String) session.getAttribute("lag");
if (language.equals("marathi")) 
{
out=res.getWriter();
out.println("<html><body><h1>Here is Marathi Books:</h1>");
out.println("Mulanche Ladke Janoos Korkchak ");
out.println("</body></html>");
}
if (language.equals("hindi")) 
{
out=res.getWriter();
out.println("<html><body><h1>Here is Hindi Books:</h1>");
out.println("<br>1857 Ka Sangram by V.S. Walimbe ");
out.println("</body></html>");
}
if (language.equals("english")) 
{
out=res.getWriter();
out.println("<html><body><h1>Here is English Books:</h1>");
out.println("<br>Charlotte’s Web – E.B. White");
out.println("</body></html>");
}
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