<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<title>APPLY FOR ADDMISSION</title>
</head>
<body>
<div class="container">
 <jsp:include page="menu.jsp"></jsp:include>

 <div class="row">
      <div class="col-md-6 col-sm-8 mx-auto">
           <div class="card">
               <div class="card-body" style="background-color: #ee0fff">
                    <div class="mt-2 text-center">
                         <h3 style="color: pink;">NEW ADDMISSION</h3>
                         <h3 style="color: red;">${massage}</h3>
                     </div>
               
                     <div class="mt-4 text-left">
                       <form action="course" method="post">

				        <div class="form-group">
                           <label class="text-uppercase font-weight-bold text-primary">Courses Id*:</label>
                            <select  name="coursename" class="form-control" required>
                            	<option value="Not Choose Any Option">Choose Any Option</option>
							    <option value="best seller">best seller</option>
							    <option value="muscle building">muscle building</option>
							    <option value="fat burning">fat burning</option>
							    <option value="fat burning">fat burning</option>
							    <option value="muscle growth">muscle growth</option>
							    <option value="build muscle and burn fat">build muscle and burn fat</option>
							    <option value="complete athlete training">complete athlete training</option>
							    <option value="maximum muscle building">maximum muscle building</option>
							    <option value="maximum fat loss">maximum fat loss</option>
							    <option value="customizable mass building">customizable mass building</option>
							    <option value="ab training system">ab training system</option>
							    <option value="women's training system">women's training system</option>
							    <option value="body weight training system">body weight training system</option>
							    <option value="proffesional bodybuilding">profesional bodybuilding</option>
							    <option value="total body training focus on arm size">total body training focus on arm size</option>
							            
							  </select>
                         </div>
    
			             <div class="form-group">
                             <label for="email" class="text-uppercase font-weight-bold text-primary">E-mail Id *:</label>
                             <input type="text" name="email" class="form-control" placeholder="Enter E-mail Id" required >
                         </div>
			
			            <div class="form-group">
                             <label for="name" class="text-uppercase font-weight-bold text-primary">Name *:</label>
                             <input type="text" name="name" class="form-control" placeholder="Enter Name" required >
                         </div>
		
                         <div class="form-group">
			             <label class="text-uppercase font-weight-bold text-primary">HEIGHT OF STUDENT * :</label>
			             <input type="text"  name="height" class="form-control" placeholder="Enter Height" required>
			            </div>
			            <div class="form-group">
			             <label class="text-uppercase font-weight-bold text-primary">WEIGHT OF STUDENT * :</label>
			             <input type="number" name="weight" class="form-control" placeholder="Enter Weight" required>
			            </div>
			            
			            <input type="submit" class="btn btn-success btn-block" value="APPLY">

                     </form>
                   </div> <!-- Form tag div -->
              </div> <!-- Card Body End -->
          </div> <!-- Card End -->
       </div> <!-- Col alignment end -->
     </div> <!-- Row End -->
 </div> <!-- Container End -->
    
</body>
</html>