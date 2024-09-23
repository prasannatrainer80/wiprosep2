<%@page import="com.wipro.jsp.EmployDaoImpl"%>
<%@page import="com.wipro.jsp.Gender"%>
<%@page import="com.wipro.jsp.Employ"%>
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
	<form method="get" action="AddEmploy.jsp">
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
		if (request.getParameter("empno")!=null && request.getParameter("basic")!=null) {
			Employ employ = new Employ();
			employ.setEmpno(Integer.parseInt(request.getParameter("empno")));
			employ.setName(request.getParameter("name"));
			employ.setGender(Gender.valueOf(request.getParameter("gender")));
			employ.setDept(request.getParameter("dept"));
			employ.setDesig(request.getParameter("desig"));
			employ.setBasic(Integer.parseInt(request.getParameter("basic")));
			
			EmployDao dao = new EmployDaoImpl();
			String result = dao.addEmployDao(employ);
			String err ="";
			if (result.startsWith("Error")) {
				err = result;
			
		%>
			
		<%
		out.println("<p style='color:red'>" +err + "</p>");
			}
		else {
			
		
	%>
		<jsp:forward page="EmployShowTable.jsp" />
	<%
		}
		}
	%>
</body>
</html>