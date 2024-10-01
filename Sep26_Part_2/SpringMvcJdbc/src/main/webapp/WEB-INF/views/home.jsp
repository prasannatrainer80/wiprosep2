<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
       <table border="3" align="center">
       	  <tr>
       	  	<th>Employ No</th>
       	  	<th>Employ Name</th>
       	  	<th>Gender</th>
       	  	<th>Department</th>
       	  	<th>Designation</th>
       	  	<th>Basic</th>
       	  	<th>Update Employ</th>
       	  	<th>Delete Employ</th>
       	  </tr>
       	  <c:forEach var="emp" items="${employList}">
       	  <tr>
       	  	<td>${emp.empno}</td>
       	  	<td>${emp.name}</td>
       	  	<td>${emp.gender}</td>
       	  	<td>${emp.dept}</td>
       	  	<td>${emp.desig}</td>
       	  	<td>${emp.basic}</td>
       	  	<td><a href="updateEmploy?empno=${emp.empno}">Update Employ</a> </td>
       	  	<td><a href="deleteEmploy?empno=${emp.empno}">Delete Employ</a> </td>
       	  </tr>
       	  </c:forEach>
       </table>
       <hr/>
       <a href="addEmploy">Add Employ</a>
    </body>
</html>
