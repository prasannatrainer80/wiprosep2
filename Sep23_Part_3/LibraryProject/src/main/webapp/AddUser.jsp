<%@page import="com.java.lib.LibUsers"%>
<%@page import="com.java.lib.LibraryDaoImpl"%>
<%@page import="com.java.lib.LibraryDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="AddUser.jsp">
		User Name : 
		<input type="text" name="userName" /> <br/><br/>
		Password : 
		<input type="password" name="passCode" /> <br/><br/>
		Re-Type Password : 
		<input type="password" name="retypePassCode" /> <br/><br/> 
		<input type="submit" value="Create Account" />
	</form>
	<%
		if (request.getParameter("userName")!=null && 
			request.getParameter("passCode")!=null
				) {
			String pwd = request.getParameter("passCode");
			String retype = request.getParameter("retypePassCode");
			if (pwd.equals(retype)) {
				LibraryDao dao = new LibraryDaoImpl();
				LibUsers libUsers = new LibUsers();
				libUsers.setUserName(request.getParameter("userName"));
				libUsers.setPassWord(pwd);
				out.println(dao.createUser(libUsers));
			} else {
				out.println("Password Mismatch...");
			}
		}
	%>
</body>
</html>