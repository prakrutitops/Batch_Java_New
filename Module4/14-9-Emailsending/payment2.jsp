<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
		
		String a = request.getParameter("cash");
	
		if(a.equals("cash"))
		{
			
			
			
			
			
%>


<form action="order.jsp">
	
	<p>
		<input type="text" name="address">
	</p>
	
	<p>
		<input type="submit" value="submit">
	</p>
	</form>
<%

		}
		
		else
		{
			//
		}
%>


			
		<%-- <%
		
		}
		else
		{
			
				//Online
			
		}
	
		
		
	%>

	 --%>
</body>
</html>