<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="beanGreeting" class="com.wipro.jsp.Greeting" />
	Default Value is : 
	<b>
		<jsp:getProperty property="message" name="beanGreeting" />
	</b> <br/><br/>
	<jsp:setProperty property="message" name="beanGreeting" value="Good Afternoon...!"/>
	Updated Value is : 
	<b>
		<jsp:getProperty property="message" name="beanGreeting"/>
	</b>
</body>
</html>