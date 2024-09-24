<%@page import="com.java.lib.TransReturn"%>
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
<jsp:include page="Menu.jsp" /> <br/>
<%
	String user = (String)session.getAttribute("user");
%>
<jsp:useBean id="beanLibraryDao" class="com.java.lib.LibraryDaoImpl" />
<%
	List<TransReturn> transReturn = beanLibraryDao.showHistory(user);
%>
<table border="3" align="center">
	<tr>
		<th>User Name</th>
		<th>Book Id</th>
		<th>From Date</th>
		<th>To Date</th>
	</tr>
	<%
		for(TransReturn tr : transReturn) {
	%>
		<tr>
			<td><%=user %> </td>
			<td><%=tr.getBookId() %> </td>
			<td><%=tr.getFromDate() %> </td>
			<td><%=tr.getToDate() %> </td>
		</tr>
	<%
		}
	%>
</table>
</body>
</html>