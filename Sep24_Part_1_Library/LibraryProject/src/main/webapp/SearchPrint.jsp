<%@page import="com.java.lib.Books"%>
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
	<jsp:useBean id="beanLibraryDao" class="com.java.lib.LibraryDaoImpl" />
	<%
		String searchType = request.getParameter("searchtype");
		String searchValue = request.getParameter("searchvalue");
		List<Books> booksList = beanLibraryDao.searchBooks(searchType, searchValue);
	%>
	<form method="get" action="Issue.jsp">
	<table border="3" align="center">
		<tr>
			<th>Book Id</th>
			<th>Book Name</th>
			<th>Author</th>
			<th>Edition</th>
			<th>Dept</th>
			<th>TotalBooks</th>
			<th>Select</th>
		</tr>
	<%
		for(Books book : booksList) {
	%>
		<tr>
			<td><%=book.getId() %> </td>
			<td><%=book.getName() %> </td>
			<td><%=book.getAuthor() %> </td>
			<td><%=book.getEdition() %> </td>
			<td><%=book.getDept() %> </td>
			<td><%=book.getNoOfBooks() %> </td>
			<td>
				<input type="checkbox" name="bookid" value=<%=book.getId() %> />
			</td>
		</tr>
	<%
		}
	%>
	</table>
	<input type="submit" value="Issue Book(s)" />
	</form>
</body>
</html>