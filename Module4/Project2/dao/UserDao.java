package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.CartModel;
import com.model.ProductModel;
import com.model.SignupModel;
import com.model.WishlistModel;

public class UserDao 
{
	//Connection
	public static Connection getconnect()
	{
		Connection con = null;
		
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		return con;
	}
	
	//Signup
	public static int signupdetail(SignupModel m)
	{
		int status =0;
		
		Connection con = UserDao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into register (fullname,email,phone,password) values (?,?,?,?)");
			ps.setString(1,m.getFullname());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPhone());
			ps.setString(4,m.getPassword());
			status = ps.executeUpdate();
		
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return status;
	}
	
	//Login
	public static SignupModel LoginCustomer(SignupModel model) {
		boolean flag = false;

		SignupModel obj = null;

		try {
			Connection con = UserDao.getconnect();
			PreparedStatement ps = con.prepareStatement("select * from register where email=? and password=?");
			
			ps.setString(1, model.getEmail());
			ps.setString(2, model.getPassword());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				obj = new SignupModel();
				obj.setFullname(rs.getString("fullname"));
				obj.setEmail(rs.getString("email"));
				obj.setPhone(rs.getString("phone"));
				obj.setPassword(rs.getString("password"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return obj;
	}
	
	//Product View
	public static List<ProductModel> viewdata()
	{
		Connection con = UserDao.getconnect();
		ArrayList<ProductModel> list = new ArrayList<>();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from products");
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int pid = set.getInt(1);
				String pname = set.getString(2);
				String pprice= set.getString(3);
				String pimage = set.getString(4);
				
				
				ProductModel m =new ProductModel();
				m.setPid(pid);
				m.setPname(pname);
				m.setPprice(pprice);
				m.setPimage(pimage);
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
	//get single product
	public static ProductModel getdetailbyid(int id)
	{
		ProductModel m = null;
		
		Connection con = UserDao.getconnect();
		
		try
		{
			
			PreparedStatement ps = con.prepareStatement("select * from products where pid =?");
			ps.setInt(1,id);
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int pid = set.getInt(1);
				String pname = set.getString(2);
				String pprice = set.getString(3);
				String pimage = set.getString(4);
				
				
				m =new ProductModel();
				m.setPid(pid);
				m.setPname(pname);
				m.setPprice(pprice);
				m.setPimage(pimage);
			
			}
			
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	
	
	
	//add to wishlist
		public static int wishadddetail(WishlistModel m)
		{
			int status =0;
			
			Connection con = UserDao.getconnect();
			try 
			{
				PreparedStatement ps = con.prepareStatement("insert into wishlist (pname,pprice,pimage,email) values (?,?,?,?)");
				ps.setString(1,m.getPname());
				ps.setString(2,m.getPprice());
				ps.setString(3,m.getPimage());
				ps.setString(4,m.getEmail());
				
				status = ps.executeUpdate();
			
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			return status;
		}
		
		
		
		//Wishlist View User Wise
		public static List<WishlistModel> getwishbyemail(SignupModel m2)
		{
			List<WishlistModel> i2 = new ArrayList<WishlistModel>();
			
			
			
			try {
				
				
				SignupModel s=new SignupModel();
				Connection con = UserDao.getconnect();
				PreparedStatement ps= con.prepareStatement("Select * from wishlist where email=?");
				System.out.println(m2.getEmail());
				ps.setString(1, m2.getEmail());
				ResultSet rs = (ResultSet) ps.executeQuery();
				
				while(rs.next())
				{
					WishlistModel d1 = new WishlistModel();
					//d1 = new ImageModel();
					
				
					d1.setPid(rs.getInt(1));
					d1.setPname(rs.getString(2));
					d1.setPprice(rs.getString(3));
					d1.setPimage(rs.getString(4));
					d1.setEmail(rs.getString(5));
					i2.add(d1);
					
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			return i2;
		}
		
		
		
		
		//add to Cart
				public static int cartadddetail(CartModel m)
				{
					int status =0;
					
					Connection con = UserDao.getconnect();
					try 
					{
						PreparedStatement ps = con.prepareStatement("insert into cart (pname,pprice,pimage,email) values (?,?,?,?)");
						ps.setString(1,m.getPname());
						ps.setString(2,m.getPprice());
						ps.setString(3,m.getPimage());
						ps.setString(4,m.getEmail());
						
						status = ps.executeUpdate();
					
					} 
					catch (SQLException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					
					return status;
				}
				
				
				
				//Wishlist View User Wise
				public static List<CartModel> getwishbycart(SignupModel m2)
				{
					List<CartModel> i2 = new ArrayList<CartModel>();
					
					
					
					try {
						
						
						SignupModel s=new SignupModel();
						Connection con = UserDao.getconnect();
						PreparedStatement ps= con.prepareStatement("Select * from cart where email=?");
						System.out.println(m2.getEmail());
						ps.setString(1, m2.getEmail());
						ResultSet rs = (ResultSet) ps.executeQuery();
						
						while(rs.next())
						{
							CartModel d1 = new CartModel();
							//d1 = new ImageModel();
							
						
							d1.setPid(rs.getInt(1));
							d1.setPname(rs.getString(2));
							d1.setPprice(rs.getString(3));
							d1.setPimage(rs.getString(4));
							d1.setEmail(rs.getString(5));
							i2.add(d1);
							
						}
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					return i2;
				}
				
				
				public static int deletefromwishlist(int id)
				{
					int status =0;
					
					Connection con = UserDao.getconnect();
					try 
					{
						PreparedStatement ps = con.prepareStatement("delete from wishlist where pid =?");
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
