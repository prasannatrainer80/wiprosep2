<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
		</tr>
		<c:forEach var="employ" items="${employs}">
			<tr>
				<td>${employ.empno} </td>
				<td>${employ.name} </td>
				<td>${employ.gender} </td>
				<td>${employ.dept} </td>
				<td>${employ.desig} </td>
				<td>${employ.basic} </td>
				
			</tr>
		</c:forEach>
	</table>
	<a href="searchEmploy">Search Employ</a>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="addEmploy">Add Employ</a>
</body>
</html>