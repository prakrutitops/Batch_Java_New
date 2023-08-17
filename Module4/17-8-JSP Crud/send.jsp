<%@page import="java.util.Calendar"%>
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
		
		String myurl = request.getParameter("link");
		out.print(myurl);
	
	%>
	
	<br>

	<%= Calendar.getInstance().getTime() %>
	
	<%!
		int cube(int n)
		{
			return n*n*n;
		}
	
		
	%>
	
	<%=cube(3) %>

	

</body>
</html>