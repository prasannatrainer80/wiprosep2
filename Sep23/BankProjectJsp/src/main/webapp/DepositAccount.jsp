<%@page import="com.wipro.jsp.BankDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="DepositAccount.jsp">
		<center>
			Account No : 
			<input type="number" name="accountNo" /> <br/><br/>
			Deposit Amount : 
			<input type="number" name="depositAmount" /> <br/><br/>
			<input type="submit" value="Deposit Amount" />
		</center>
	</form>
	<%
		if (request.getParameter("accountNo")!=null && request.getParameter("depositAmount")!=null) {
			BankDaoImpl impl = new BankDaoImpl();
			int accountNo = Integer.parseInt(request.getParameter("accountNo"));
			double depAmount = Double.parseDouble(request.getParameter("depositAmount"));
			out.println(impl.depositAccount(accountNo, depAmount));
		}
	%>
</body>
</html>