<%@page import="com.wipro.jsp.EmployDaoImpl"%>
<%@page import="com.wipro.jsp.EmployDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="EmployLogin.jsp">
		<center>
			User Name : 
			<input type="text" name="userName" />
			<br/><br/>
			Password : 
			<input type="password" name="passWord" />
			<br/><br/>
			<input type="submit" value="Login" />
		</center>
	</form>
	<%
		if (request.getParameter("userName")!=null && request.getParameter("passWord")!=null) {
			EmployDao dao = new EmployDaoImpl();
			int count = dao.validateEmploy(request.getParameter("userName"), request.getParameter("passWord"));
			if (count==1) {
	%>
		<jsp:forward page="EmployShowTable.jsp" />
	<%
			} else {
				out.println("<p style='color:red'> Invalid Credentails</p>");
			}
		}
	%>
</body>
</html>