import java.io.*;
import java.sql.*;
import javax.servlet.ServletException; 
import javax.servlet.http.*;
import javax.servlet.annotation.*;
public class P24 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, 
	ServletException 
	{
		response.setContentType("text/html"); PrintWriter out = response.getWriter();
		String name = request.getParameter("uname"); 
		String email = request.getParameter("uemail"); 
		String address = request.getParameter("uaddress"); 
		String mobileno = request.getParameter("unumber"); 
		out.print("<html>");
		out.print("<head> <title>Customers_Registration</title></head>");
		out.print("<body><table>"); 
try{
	String sql = "INSERT INTO P24 values(?,?,?,?)";
Class.forName("oracle.jdbc.driver.OracleDriver");

      Connection con = DriverManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:xe",
        "system",
        "Compilers123"
      );

      PreparedStatement ps = con.prepareStatement(sql);
      ps.setString(1, name);
      ps.setString(2, email);
      ps.setString(3, address);
      ps.setString(4, mobileno);

      int n = ps.executeUpdate();

      if (n == 1) {
        System.out.println("Data Inserted!");
      } else {
        System.out.println("Data Insertion Failed!");
      }

      ps.close();
      con.close();
}
catch(Exception ex)
		{
		 	System.out.println(ex.getMessage());
		 }
		
		

		// try
		// {
		// 	String sql = "INSERT INTO P24(name,email,address,mobile) VALUES('name','email','address','mobileno)";
		// 	Class.forName("oracle.jdbc.driver.OracleDriver");
		// 	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "Compilers123");
		// 	Statement st = con.createStatement();

		// 	st.executeUpdate(sql);

		// 	System.out.println("Data Inserted...");
			
		// 	st.close();
		// 	con.close();


	
		 
	} 
}