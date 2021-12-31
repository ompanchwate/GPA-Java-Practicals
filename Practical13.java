/*Name: Om G. Panchwate
ID Code: 19CM044
Practical No: 13
AIM: Write a Program to display the data from database using JDBC 
*/
import java.sql.*;
class Practical13
{
	public static void main(String[] args) {
		try
		{
			String sql = " select * from employee";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "Compilers123");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			int rowCount = 0;
			while(rs.next()) 
			 {
				// int id = rs.getInt(1);
				String name = rs.getString(1);
				String post = rs.getString(2);
				Double salary = rs.getDouble(3);
				System.out.println(name+", "+post+", "+salary);
				++rowCount;
			}

			System.out.println("Total number of records = " + rowCount);

			rs.close();
			st.close();
			con.close();


		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}