<%@page import="com.java.lib.TranBook"%>
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
	<jsp:include page="Menu.jsp" />
	<br/>
	<jsp:useBean id="libraryDao" class="com.java.lib.LibraryDaoImpl" />
	<%
		String user = (String)session.getAttribute("user");
		List<TranBook> tranBooks = libraryDao.accountDetails(user);
	%>
	<table border="3" align="center">
		<tr>
			<th>Book Id</th>
			<th>User Name</th>
			<th>Issued On</th>
		</tr>
	<%
		for(TranBook tb : tranBooks) {
	%>
		<tr>
			<td><%=tb.getBookId() %> </td>
			<td><%=tb.getUserName() %> </td>
			<td><%=tb.getFromDate() %> </td>
		</tr>
	<%
		}
	%>
	</table>
</body>
</html>