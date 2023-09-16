<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">

	var request=new XMLHttpRequest();  
	function searchInfo()
	{
		
		
		var name = document.vinform.name.value;  

		var url = "AjaxSearch2.jsp?val="+name;

		try
		{
			//send detail in ajaxsearch2

			request.onreadystatechange=
				function()
			{  
				if(request.readyState==4)
				{  
					var val=request.responseText;  
					document.getElementById('tops').innerHTML=val;  
				}  
			}  
			request.open("GET",url,true);  
			request.send();  
				


			
		}
		catch(e)
		{
			alert("Unable to connect to server");
		}
		
	}


</script>

</head>
<body>


<h1>Search Employee</h1>  
<form name="vinform">
Enter Email For Registration <input type="email" name="name" onblur="searchInfo()">  
</form>  
<span id="tops"></span> 

</body>
</html> 
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script> 
/*

onblur event this function will be called searchInfo()

document.vinform.name.value is get value and stored into variable
whis is passed to AjaxSearch2.jsp

XMLHttpRequest
For asynchronous communication between client and server

It performs following operations:
Sends data from the client in the background
Receives the data from the server
Updates the webpage without reloading it.

onReadyStateChange
It is called whenever readystate attribute changes. It must not be used with synchronous requests
readyState
represents the state of the request. It ranges from 0 to 4.
0 UNOPENED open() is not called.
1 OPENED open is called but send() is not called.
2 send() is called
3 LOADING Downloading data; responseText holds the data.
4 DONE The operation is completed fully.
reponseText
returns response as text.

*/
 
var request=new XMLHttpRequest();  
function searchInfo()
{  
	var name=document.vinform.name.value;  
	var url="AjaxSearch2.jsp?val="+name;  
  	try
  	{  
		request.onreadystatechange=function()
		{  
			if(request.readyState==4)
			{  
				var val=request.responseText;  
				document.getElementById('tops').innerHTML=val;  
			}  
		}  
		request.open("GET",url,true);  
		request.send();  
	}
  	catch(e)
  	{
  		alert("Unable to connect to server");
  	}  
}  
</script>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajax Search Example</title>
</head>
<body>
<h1>Search Employee</h1>  
<form name="vinform">
Enter Email For Registration <input type="text" name="name" onblur="searchInfo()">  
</form>  
<span id="tops"></span>  
</body>  
</body>
</html> --%>