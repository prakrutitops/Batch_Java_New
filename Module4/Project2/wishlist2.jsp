<%@page import="com.dao.UserDao"%>
<%@page import="com.model.ProductModel"%>
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
			
			String id = request.getParameter("id");
			int id2 = Integer.parseInt(id);
			System.out.print(id2);
			ProductModel p = UserDao.getdetailbyid(id2);
		
		%>
	
	
		<center>
		
		<form action="mywishlist.jsp">
		<p>
			<%-- <img alt="image1" src="<%=p.getPimage()%>" width="250" height="250" name="pimage"/> --%>
		
			<input type="text" name="pimage" value="<%=p.getPimage()%>">
		</p>
		
		<p>
			
			<input type="hidden" name="pid" value="<%=p.getPid()%>">
		
		</p>
		
		<p>
			
			<input type="text" name="pname" value="<%=p.getPname()%>">
		
		</p>
		
		<p>
		<input type="text" name="pprice" value="<%=p.getPprice()%>">
		</p>
		
		<p>
		<input type="text" name="email" value="<%=session.getAttribute("email")%>">
		</p>
		
		<p>
			<!-- <a class="swd-button" href="mywishlist.jsp">Add to Wishlist </a> -->
			<input type="submit" value="Add to wishlist">
			<br>
			<br>
		</p>
		</form>
		</center>
	


<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>