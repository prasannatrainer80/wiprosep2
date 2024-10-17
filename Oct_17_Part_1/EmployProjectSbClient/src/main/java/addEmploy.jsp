<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="employConfirm">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/>
			Employ Name :
			<input type="text" name="name" /> <Br/>
			Gender :
			<select name="gender">
				<option value="MALE">Male</option>
				<option value="FEMALE">Female</option>
			</select> <br/>
			Department : 
			<select name="dept">
				<option value="Dotnet">Dotnet</option>
				<option value="Java">Java</option>
				<option value="Sql">Sql</option>
				<option value="React">React</option>
			</select> <br/>
			Designation : 
			<select name="desig">
				<option value="Junior">Junior</option>
				<option value="Senior">Senior</option>
				<option value="Head">Head</option>
				<option value="TL">TL</option>
			</select>
			Basic : 
			<input type="number" name="basic" /> <br/><br/>
			<input type="submit" value="Add Employ" />
		</center>
	</form>
</body>
</html>