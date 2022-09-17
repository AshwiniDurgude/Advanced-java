import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test 
{

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "root");
			String sql="select * from student";
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery(sql);
			while(rs.next())
			{
				int rollno=rs.getInt(1);
				String name=rs.getString(2);
				System.out.println("Rollno:"+rollno+ "  Name:" +name);
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
