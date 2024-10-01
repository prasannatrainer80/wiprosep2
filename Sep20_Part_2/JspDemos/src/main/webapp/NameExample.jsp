<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="NameExample.jsp">
		<center>
			First Name : 
			<input type="text" name="firstName" /> <br/><br/>
			Last Name : 
			<input type="text" name="lastName" /> <br/><br/>
			<input type="submit" value="Show" />
		</center>  
	</form>
	<%
		if (request.getParameter("firstName")!=null && request.getParameter("lastName")!=null) {
			String firstName, lastName, fullName;
			firstName = request.getParameter("firstName");
			lastName = request.getParameter("lastName");
			fullName = firstName + " " +lastName;
			out.println("Full Name is  " +fullName);
		}
	%>
</body>
</html>