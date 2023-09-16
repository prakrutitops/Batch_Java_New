 <%@ page import="java.sql.*" %>  
    <%  
    String name=request.getParameter("val");  
    if(name==null||name.trim().equals(""))
    {  
    	out.print("<p>Please enter Email!</p>");  
    }
    else
    {  
    	
    	
    	 try
    	{  
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshit","root","");  
    		PreparedStatement ps=con.prepareStatement("select * from signup where email=?");  
    		ps.setString(1, name);
    		ResultSet rs=ps.executeQuery();  
      		if(rs.next()) 
      		{      
     			out.println("<p>Email Id Already Used</p>");   
    		}
      		else
      		{  
    			out.println("<p>This Email Id Is Available</p>"); 
    		}  
    		con.close();  
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}   
    }  
    %>  