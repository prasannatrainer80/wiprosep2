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
		String[] books = request.getParameterValues("bookId");
	%>
	<jsp:useBean id="beanLibraryDao" class="com.java.lib.LibraryDaoImpl" />
	<%
		for(String str : books) {
			out.println(beanLibraryDao.returnBook(user, str));
		}
	%>
</body>
</html>