<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add new employee</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h3>
			Employees list
		</h3>
		<hr/>
		
		<div>
			<form method="post" action="/EmployeeManagment/add">
			  <div class="mb-3">
			    <label for="exampleInputEmail1" class="form-label">Full name</label>
			    <input type="text" class="form-control" name="fullname"  aria-describedby="emailHelp">
		
			  </div>
			  
			  <div class="mb-3">
			    <label for="exampleInputEmail1" class="form-label">Salary</label>
			    <input type="number" class="form-control" name="salary"  aria-describedby="emailHelp">
		
			  </div>
			  
			  <div class="mb-3">
			    <label for="exampleInputEmail1" class="form-label">Add date</label>
			    <input type="date" class="form-control" name="adddate"  aria-describedby="emailHelp">
		
			  </div>
			  
			  
			  <button type="submit" class="btn btn-primary">Submit</button>
			</form>

		</div>
		
		
	</div>
	
	
	

	
	
	
	
</body>
</html>