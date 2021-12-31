/*Name: Om G. Panchwate
ID Code: 19CM044
Practical No: 14
AIM:  Write a Program to insert the data into database by using PreparedStatement 
Interface
*/
import java.sql.*;
class P14
{
	public static void main(String[] args) {
		try
		{
			String sql = " insert into employee(NAME, POST, SALARY) values ('Peter','Engineer',150000)";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "Compilers123");
			Statement st = con.createStatement();

			st.executeUpdate(sql);

			System.out.println("Data Inserted...");

			st.close();
			con.close();


		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}