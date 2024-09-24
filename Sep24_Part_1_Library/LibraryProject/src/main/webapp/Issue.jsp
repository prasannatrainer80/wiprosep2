<%@page import="com.java.lib.Books"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="beanLibraryDao" class="com.java.lib.LibraryDaoImpl" />
<jsp:include page="Menu.jsp" />
<%
	String user = (String)session.getAttribute("user");
	String[] books = request.getParameterValues("bookid");
	for(String book : books) {
		out.println(beanLibraryDao.issueBook(book, user));
	}
%>
</body>
</html>