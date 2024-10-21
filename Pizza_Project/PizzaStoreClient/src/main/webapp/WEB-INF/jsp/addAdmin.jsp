<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="addAdminConfirm">
		<center>
			Admin Name : 
			<input type="text" name="adminName" /> <br/>
			Admin UserName : 
			<input type="text" name="adminUserName" /> <br/>
			Admin Password : 
			<input type="text" name="adminPassword" /> <br/>
			Admin Status : 
			<select name="adminStatus">
				<option value="ACTIVE">Active</option>
				<option value="INACTIVE">Inactive</option>
			</select> <br/>
			<input type="submit" value="Add Admin" />
		</center>
	</form>
</body>
</html>