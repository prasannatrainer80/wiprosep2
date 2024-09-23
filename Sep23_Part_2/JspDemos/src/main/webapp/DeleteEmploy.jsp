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
	<%
		int empno = Integer.parseInt(request.getParameter("empno"));
		EmployDao dao = new EmployDaoImpl();
		dao.deleteEmployDao(empno);
	%>
		<jsp:forward page="EmployShowTable.jsp" />
	<%
	%>
</body>
</html>