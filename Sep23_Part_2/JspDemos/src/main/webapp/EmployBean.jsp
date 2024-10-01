<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="EmployBean.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/><br/>
			Employ Name : 
			<input type="text" name="name" /> <br/><br/>
			Gender : 
			<select name="gender">
				<option value="MALE">Male</option>
				<option value="FEMALE">Female</option>
			</select> <br/><br/>
			Department : 
			<select name="dept">
				<option value="Dotnet">Dotnet</option>
				<option value="Java">Java</option>
				<option value="Sql">Sql</option>
			</select> <br/><br/>
			Designation : 
			<select name="desig">
				<option value="Senior">Senior</option>
				<option value="Junior">Junior</option>
				<option value="Head">Head</option>
			</select> <br/><br/>
			Basic : 
			<input type="number" name="basic" /> <br/><br/>
			<input type="submit" value="Add Employ" />
		</center>  
	</form>
	<%
		if (request.getParameter("empno")!=null && request.getParameter("name")!=null) {
	%>
		<jsp:useBean id="beanEmploy" class="com.wipro.jsp.EmployBean" />
		<jsp:setProperty property="*" name="beanEmploy"/> <br/><hr/>
		Employ No :
		<jsp:getProperty property="empno" name="beanEmploy"/> <br/>
		Employ Name : 
		<jsp:getProperty property="name" name="beanEmploy"/> <br/>
		Gender :
		<jsp:getProperty property="gender" name="beanEmploy"/> <br/>
		Department : 
		<jsp:getProperty property="dept" name="beanEmploy"/> <br/>
		Designation : 
		<jsp:getProperty property="desig" name="beanEmploy"/> <br/>
		Basic : 
		<jsp:getProperty property="basic" name="beanEmploy"/>
	<%
		}
	%>
</body>
</html>