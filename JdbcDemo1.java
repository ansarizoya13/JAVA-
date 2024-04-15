import java.sql.*;
public class JdbcDemo1
{
	public static void main(String args[])
	{
		Connection con;
		Statement stmt;
		String url,sqlstat;
		//ResultSet rset;

		try
		{
			//Class.forName(oracle.jdbc.driver.OracleDriver");
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");			


			sqlstat="insert into student values(18003,'tejal',80)";

			url="jdbc:odbc:syitdsn";
			con=DriverManager.getConnection(url);
			stmt=con.createStatement();
			boolean b = stmt.execute(sqlstat);
	             	System.out.println(b);
			//rset=stmt.executeQuery(sqlstat);

			stmt.close();
			con.close();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class Not Found");
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		
	}
}