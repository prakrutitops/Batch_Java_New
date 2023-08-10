import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud1","root","");
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		return con;
	}
	
	public static int savedata(Model m)
	{
		int status =0;
		
		Connection con = Dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into details (name,surname,email) values (?,?,?)");
			ps.setString(1,m.getName());
			ps.setString(2,m.getSurname());
			ps.setString(3,m.getEmail());
			
			status = ps.executeUpdate();
		
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return status;
	}
	
	public static List<Model> viewdata()
	{
		Connection con = Dao.getconnect();
		ArrayList<Model> list = new ArrayList<>();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from details");
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String surname = set.getString(3);
				String email = set.getString(4);
				
				Model m =new Model();
				m.setId(id);
				m.setName(name);
				m.setSurname(surname);
				m.setEmail(email);
				list.add(m);
			}
			
			
		
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	
	}
	
	public static int deletedata(int id)
	{
		int status =0;
		
		Connection con = Dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("delete from details where id =?");
			ps.setInt(1,id);
		
			status = ps.executeUpdate();
		
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return status;
	}
	
	
	
	
}
