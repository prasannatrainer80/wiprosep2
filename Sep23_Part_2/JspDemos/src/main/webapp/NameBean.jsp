<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="NameBean.jsp">
		<center>
			First Name : 
			<input type="text" name="firstName" /> <br/> 
			Last Name : 
			<input type="text" name="lastName" /> <br/>
			<input type="submit" value="Show" />
		</center>
	</form>
	<%
		if (request.getParameter("firstName")!=null && request.getParameter("lastName")!=null) {
	%>
		<jsp:useBean id="beanName" class="com.wipro.jsp.NameBean" />
		<jsp:setProperty property="firstName" name="beanName"/>
		<jsp:setProperty property="lastName" name="beanName"/>
		First Name :  <b>
		<jsp:getProperty property="firstName" name="beanName"/></b> <br/>
		Last Name : <b>
			<jsp:getProperty property="lastName" name="beanName"/>
		</b> <br/>
		Full Name : <b>
			<%=beanName.fullName() %>
		</b>
	<%
		}
	%>
</body>
</html>