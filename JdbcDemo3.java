import java.util.*;
import java.sql.*;
public class JdbcDemo3
{

	Connection con;
	Statement stmt;
	String connurl,sqlstr;
	ResultSet rset;
	
	JdbcDemo3()
	{

	}

	public void connect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("jdbc:oracle://localhost.1521/"system","manager"");


		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();

		}
		
	}
	public void insert() 
	{
		try
		{
			connurl="jdbc:odbc:syitdsn";
			con=DriverManager.getConnection(connurl);
			sqlstr="insert into student values(18001,'bbb',30)";
			stmt=con.createStatement();
			int b=stmt.executeUpdate(sqlstr);
			System.out.println(b);
			stmt.close();
			con.close();

		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}

	}

	public void retrieveRecords() 
	{
		try
		{	
			connurl="jdbc:odbc:syitdsn";
			con=DriverManager.getConnection(connurl);

			sqlstr="select * from student";
			stmt=con.createStatement();
			rset=stmt.executeQuery(sqlstr);
			

			while(rset.next())
			{
				int srno,smarks;

				srno=rset.getInt(1);
				String strname=rset.getString("sname");
				smarks=rset.getInt(3);
				System.out.println(srno+"\t"+strname+"\t"+smarks);
	
			}

			stmt.close();
			con.close();

		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}

	}

	public static void main(String args[])
	{
		JdbcDemo3 obj = new JdbcDemo3();
		obj.connect();
		System.out.println("Select an option : \n 1 - Insert \n 2 - Display");
		Scanner scin=new Scanner(System.in);
		int option=scin.nextInt();
		switch(option)
		{
			case 1:
				obj.insert();
				break;
			case 2:
				obj.retrieveRecords();
				break;
			default:
				System.out.println("Select an option : \n 1 - Insert \n 2 - Display");
		}

	}
}