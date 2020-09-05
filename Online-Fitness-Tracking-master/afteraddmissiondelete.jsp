<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADDMISSION CANCELED</title>
</head>
<body>
<% String sname = (String)session.getAttribute("adminstudname");
	if(sname == null)
		response.sendRedirect("adminshowaddmission.jsp");
		%>
		
	<div class="container">
       <jsp:include page="menu.jsp"></jsp:include>
       
     <h3> ADDMISSION CANCELED </h3>
    
	</div>

</body>
</html>