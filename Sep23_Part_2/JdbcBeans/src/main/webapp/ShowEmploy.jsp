<%@page import="com.wipro.jsp.Employ"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="beanEmployDao" class="com.wipro.jsp.EmployDaoImpl" />
	<%
		List<Employ> employList = beanEmployDao.showEmployDao();
	%>
	<table border='3' align="center">
		<tr>
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Gender</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Basic</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
	<%
		for(Employ employ : employList) {
	%>
		<tr>
			<td><%=employ.getEmpno() %> </td>
			<td><%=employ.getName() %> </td>
			<td><%=employ.getGender() %> </td>
			<td><%=employ.getDept() %> </td>
			<td><%=employ.getDesig() %> </td>
			<td><%=employ.getBasic() %> </td>
			<td>
				<a href="UpdateEmploy.jsp?empno=<%=employ.getEmpno() %>">Update</a>
			 </td>
			<td>
				<a href="DeleteEmploy.jsp?empno=<%=employ.getEmpno() %>">Delete</a>
			</td>
		</tr>
	<%
		}
	%>
	</table> <br/><br/>
</body>
</html>