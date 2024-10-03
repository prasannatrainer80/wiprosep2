<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="customerLogin">
		User Name : 
		<input type="text" name="userName" /> <br/><br/>
		Password : 
		<input type="password" name="passWord" /> <br/><br/>
		<input type="submit" value="Login" />
	</form>
	<hr/>
	<span style="color:red;">${error}</span>
</body>
</html>