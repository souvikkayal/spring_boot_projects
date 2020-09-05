<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Course</title>
</head>
<body>
<% String sname = (String)session.getAttribute("adminstudname");
	if(sname == null)
		response.sendRedirect("adminlogin.jsp");
		%>
	<div class="container">
<jsp:include page="menu.jsp"></jsp:include>

<div class="row">
      <div class="col-md-6 col-sm-8 mx-auto">
           <div class="card">
               <div class="card-body" style="background-color: #ee0fff">
                    <div class="mt-2 text-center">
                         <h3 style="color: pink;">ADD COURSE</h3>
                         <h3 style="color: red;">${msg}</h3>
                     </div>
                       <div class="mt-4 text-left">
                       	<form action="adminaddcourse" method="post">
                       	
                       	 <div class="form-group">
                             <label for="email" class="text-uppercase font-weight-bold text-primary">Course *:</label>
                             <input type="text" name="coursename" class="form-control" placeholder="Enter New Course" required >
                         </div>
                         
                         <div class="form-group">
                             <label class="text-uppercase font-weight-bold text-primary">Duration *:</label>
                            <input type="text" name="duration" placeholder="How Many Months or Year" class="form-control" required>
                         </div>
                         
                         <div class="form-group">
                             <label class="text-uppercase font-weight-bold text-primary">Description *:</label>
                             <input type="text" name="description" placeholder="SOMETHING ABOUT THAT COURSE" class="form-control" required>
                         </div>
                         
                         <div class="form-group">
                             <label class="text-uppercase font-weight-bold text-primary">Date of Addition *:</label>
                             <input type="text" name="date" placeholder="dd/mm/yyyy" class="form-control" required>
                         </div>
							
							<input type="submit" class="btn btn-success btn-block" value="ADD">

                     </form>
                   </div> <!-- Form tag div -->
              </div> <!-- Card Body End -->
          </div> <!-- Card End -->
       </div> <!-- Col alignment end -->
     </div> <!-- Row End -->
 </div> <!-- Container End -->
</body>
</html>