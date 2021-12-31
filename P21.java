import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class P21 extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
{
try{
PrintWriter pwriter = response.getWriter();
String name = request.getParameter("name");
String lang = request.getParameter("lang");
pwriter.println("<html><body>");
pwriter.println("Welcome "+name);
pwriter.println("<br>Here is your language: "+lang);
HttpSession session=request.getSession();
session.setAttribute("name",name);
session.setAttribute("lag",lang);
pwriter.println("<a href='show'>show</a></body></html>");
pwriter.close();
}catch(Exception exp)
{
System.out.println(exp);
}
}
}
