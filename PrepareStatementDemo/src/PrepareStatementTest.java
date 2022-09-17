import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareStatementTest
{

	public static void main(String[] args)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			String sql="insert into student (rollno,name) values (?,?)";
			String sql1="update student set name=? where rollno=?";
			String sql2="delete from student where name=?";

			//PreparedStatement ps=con.prepareStatement(sql);
			PreparedStatement ps1=con.prepareStatement(sql1);
			PreparedStatement ps2=con.prepareStatement(sql2);

			//ps.setInt(1, 2);
			//ps.setString(2,"aaa");
			
			//ps1.setString(1,"zzz");
			//ps1.setInt(2, 2);
			
			ps2.setString(1,"zzz");
			//ps2.setInt(2, 2);
			
			//int r=ps.executeUpdate();
			//int id=ps1.executeUpdate();
			int id=ps2.executeUpdate();

			System.out.println(id);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
