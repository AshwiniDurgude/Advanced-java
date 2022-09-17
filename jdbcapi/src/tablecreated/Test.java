package tablecreated;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test 
{
	public static void main(String[] args)
	{
		try 
		{
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//establish connection with DB
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			
			String sql="create table student(rollno int primary key,name varchar(20))";
			Statement smt=con.createStatement();
			smt.execute(sql);
			smt.close();
			con.close();
			System.out.println("table created");
			
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
