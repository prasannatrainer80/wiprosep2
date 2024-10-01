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
	impl.deleteEmployDao(empno);
%>
<jsp:forward page="EmployShowTable.jsp" />
</body>
</html>