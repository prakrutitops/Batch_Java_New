<%@page import="com.model.CartModel"%>
<%@page import="com.model.SignupModel"%>
<%@page import="com.model.WishlistModel"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.UserDao"%>
<%@page import="com.model.ProductModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>


	<%
		
	
	SignupModel m2 =new SignupModel();
	String email = (String)request.getSession().getAttribute("email");
	m2.setEmail(email);
	
	
		List<CartModel>listview = UserDao.getwishbycart(m2);
		request.setAttribute("i",listview);
		
	%>
	
	<c:forEach items="${i}" var="m">
	
		<center>
			
			
				<br>
				<br>
				
				<p>
					<h2>${m.getPname()}</h2>
				</p>
				
				<p>
					<h2>${m.getPprice()}</h2>
				</p>
				
						
				<p>
					<img width="500px" height="200px" src="${m.getPimage()}">
				</p>
				
				
			
				
			</center>
	
	
	
	
	</c:forEach>
	
	
	
	


<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>