<%@page import="com.dao.UserDao"%>
<%@page import="com.model.ProductModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>


	<%
	
		List<ProductModel>list = UserDao.viewdata();
	
		for(ProductModel m : list)
		{
			
		
	
	%>
		<center>
		
		
		<p>
			<img alt="image1" src="<%=m.getPimage()%>" width="250" height="250"/>
		</p>
		
		<p>
			
			<input type="hidden" value="<%=m.getPid()%>">
		
		</p>
		
		<p>
			
			<h2><%=m.getPname() %></h2>
		
		</p>
		
		<p>
			<h4><%=m.getPprice() %></h4>
		</p>
		
		<p>
			<a class="swd-button" href="wishlist.jsp?id=<%=m.getPid()%>">Add to Wishlist </a>
			<a class="swd-button" href="cart.jsp?id=<%=m.getPid()%>">Add to Cart </a>
			<br>
			<br>
		</p>
		
		</center>
	
	<%
	
		}
	
	%>

	



<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>