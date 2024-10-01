<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="Login.jsp">
		<center>
			User Name : 
			<input type="text" name="userName" /> <br/><br/>
			Password : 
			<input type="password" name="passWord" /> <br/><Br/>
			<input type="submit" value="Login" />
		</center>
	</form>
	<%
		if (request.getParameter("userName")!=null && request.getParameter("passWord")!=null) {
			String user = request.getParameter("userName");
			String pwd = request.getParameter("passWord");
			if (user.equals("Wipro") && pwd.equals("Wipro")) {
	%>
		<jsp:forward page="Success.jsp" />
	<%
			} else {
				out.println("Invalid Credentials...");
			}
		}
	%>
</body>
</html>