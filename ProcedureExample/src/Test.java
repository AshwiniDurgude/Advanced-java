import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;


public class Test 
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			System.out.println("connection establish");
			CallableStatement cs=con.prepareCall("{call Createtable()}");

			CallableStatement cs1=con.prepareCall("{call InsertData(?,?)}");
			//System.out.println("connection establish");
//			cs1.setInt(1,1);
//			cs1.setString(2,"zz");
//
//			cs1.setInt(1,2);
//			cs1.setString(2,"nn");
//			
//			cs1.setInt(1,3);
//			cs1.setString(2,"kk");

			cs1.setInt(1, 1);
			cs1.setString(2, "aaa");
			cs1.execute();
			System.out.println("row inserted");
			//CallableStatement cs1=con.prepareCall("{call SelectData()}");
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
