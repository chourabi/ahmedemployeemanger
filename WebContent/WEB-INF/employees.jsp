<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h3>
			Employees list 
		</h3>
		<p> <a href="/EmployeeManagment/add">add new employee</a> </p>
		<hr/>
		
		<table class="table">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">fullname</th>
      <th scope="col">salary</th>
      <th scope="col">add date</th>
    </tr>
  </thead>
  <tbody>
  	<c:forEach items="${ requestScope.employees }" var="emp">
		<tr>
			<td><c:out value="${emp.getId()}"></c:out></td>
			<td><c:out value="${emp.getFullname()}"></c:out></td>
			<td><c:out value="${emp.getSalary()}"></c:out></td>
			<td><c:out value="${emp.getAddDate()}"></c:out></td>
			
		</tr>
	</c:forEach>
	

  </tbody>
</table>
		
		
	</div>
	
	
	

	
	
	
	
</body>
</html>