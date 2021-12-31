/*Name: Om G. Panchwate
ID Code: 19CM044
Practical No: 15
AIM: Write a Program to Update and Delete record from a Database Table.
*/
import java.sql.*;
class P15
{
	public static void main(String[] args) {
		try
		{
			String sql = " UPDATE employee SET name = 'Ratan', post='Clerk' WHERE salary= 10000";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "Compilers123");
			Statement st = con.createStatement();

			st.executeUpdate(sql);

			System.out.println("Data Updated...");
			
			st.close();
			con.close();


		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}