
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     
   <br/>
   <form action="searchstudentbyemailid">
       <input type="email" name="email" placeholder="ENTER EMAIL" required>
       <input type="submit" value="SEARCH">
   </form>
   
      <br/>
   <br/>
   ${msg}
   
   <table border="1">
       <tr>
         <th>Email</th>
         <th>Address</th>
         <th>Course</th> 	
         <th>Date Of Join</th>
         <th>Height</th>
         <th>Mobile No</th>
         <th>Name</th>
         <th>Password</th>
         <th>Weight</th>
      </tr>
      
      <tr>
      	<td>${info[0].email}</td>
         <td>${info[0].address}</td>
         <td>${info[0].course}</td>
         <td>${info[0].doj}</td>
         <td>${info[0].height}</td>
         <td>${info[0].mobileno}</td>
         <td>${info[0].name}</td>
         <td>${info[0].password}</td>
         <td>${info[0].weight}</td>
     </tr>
   </table>
  
</body>
</html>