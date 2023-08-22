<%@page import="com.dao.Dao"%>
<%@page import="com.model.Model"%>
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
	
	String id = request.getParameter("id");
	int id2 = Integer.parseInt(id);
	int data = Dao.deletedata(id2);

	if(data>0)
	{
		response.sendRedirect("index.jsp");
	}
	else
	{
		out.print("Fail");
	}
	
%>

	

</body>
</html>