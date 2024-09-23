<%@page import="com.wipro.jdbc.Gender"%>
<%@page import="com.wipro.jdbc.Employ"%>
<%@page import="com.wipro.jdbc.EmployDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int empno = Integer.parseInt(request.getParameter("empno"));
		EmployDaoImpl impl = new EmployDaoImpl();
		Employ employ = impl.searchEmployDao(empno);
	%>
	
	<form method="get" action="UpdateEmploy.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" value=<%=employ.getEmpno() %> />
			<br/><br/>
			Employ Name : 
			<input type="text" name="name" value=<%=employ.getName() %> /> <br/><br/>
			Gender : 
			<input type="text" name="gender" value=<%=employ.getGender() %> /> <br/><br/>
			Department : 
			<input type="text" name="dept" value=<%=employ.getDept() %> /> <br/><br/>
			Designation : 
			<input type="text" name="desig" value=<%=employ.getDesig() %> /> <br/><br/>
			Basic : 
			<input type="number" name="basic" value=<%=employ.getBasic() %> /> <br/><br/>
			<input type="submit" value="Update Employ" />
		</center>
	</form>
	<%
		if (request.getParameter("empno")!=null && request.getParameter("basic")!=null) {
			Employ employUpdate = new Employ();
			employUpdate.setEmpno(Integer.parseInt(request.getParameter("empno")));
			employUpdate.setName(request.getParameter("name"));
			employUpdate.setGender(Gender.valueOf(request.getParameter("gender")));
			employUpdate.setDept(request.getParameter("dept"));
			employUpdate.setDesig(request.getParameter("desig"));
			employUpdate.setBasic(Double.parseDouble(request.getParameter("basic")));
			impl.updateEmployDao(employUpdate);
	%>
		<jsp:forward page="EmployShowTable.jsp" />
	<%
		}
	%>
</body>
</html>