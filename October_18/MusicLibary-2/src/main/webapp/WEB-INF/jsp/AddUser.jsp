<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="addUserFinal">
		<center>
			First Name : 
			<input type="text" name="firstName" /> <br/>
			Last Name : 
			<input type="text" name="lastName" /> <br/>
			User Name : 
			<input type="text" name="userName" /> <br/>
			Password : 
			<input type="password" name="password" /> <br/>
			Email : 
			<input type="email" name="email" /> <br/>
			Gender : 
			<select name="gender">
				<option value="MALE">MALE</option>
				<option value="FEMALE">FEMALE</option>
			</select> <br/>
			Date Of Birth : 
			<input type="date" name="dateOfBirth" /> <br/>
			Domain : 
			<input type="text" name="domain" /> <br/>
			Phone No : 
			<input type="text" name="phoneNo" /> <br/><br/>
			<input type="submit" value="Add User" />
		</center>
	</form>
</body>
</html>