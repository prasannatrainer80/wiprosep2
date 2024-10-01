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
<jsp:include page="DashBoard.jsp" />
	<table border="3" align="center">
		<tr>
			<th>Customer Id</th>
			<th>Customer Name</th>
			<th>Phone No</th>
			<th>User Name</th>
			<th>Password</th>
			<th>Email</th>
		</tr>
		<c:forEach var="customer" items="${customers}">
			<tr>
				<td>${customer.cusId}</td>
				<td>${customer.cusName}</td>
				<td>${customer.cusPhnNo}</td>
				<td>${customer.cusUsername}</td>
				<td>${customer.cusPassword}</td>
				<td>${customer.cusEmail}</td>
			</tr>
		</c:forEach>
	</table>
	<hr/>
	<a href="addEmploy">Add Employ</a>
</body>
</html> 