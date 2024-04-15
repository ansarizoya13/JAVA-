import java.sql.*;
public class JdbcDemo2
{
	public static void main(String args[])
	{
		Connection con;
		Statement stmt;
		String url,sqlstat;
		ResultSet rset;

		try
		{
			//Class.forName(oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.jdbc.Driver");			


			sqlstat="insert into jeni values(18001,'aaa',40)";

			url="jdbc:odbc:syitdsn";
			con=DriverManager.getConnection(url);
			stmt=con.createStatement();
			stmt.execute(sqlstat);
			rset=stmt.executeQuery(sqlstat);

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