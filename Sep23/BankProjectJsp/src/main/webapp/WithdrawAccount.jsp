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
<form method="get" action="WithdrawAccount.jsp">
		<center>
			Account No : 
			<input type="number" name="accountNo" /> <br/><br/>
			Withdraw Amount : 
			<input type="number" name="withdrawAmount" /> <br/><br/>
			<input type="submit" value="Withdraw Amount" />
		</center>
	</form>
	<%
		if (request.getParameter("accountNo")!=null && request.getParameter("withdrawAmount")!=null) {
			BankDaoImpl impl = new BankDaoImpl();
			int accountNo = Integer.parseInt(request.getParameter("accountNo"));
			double withdrawAmount = Double.parseDouble(request.getParameter("withdrawAmount"));
			out.println(impl.withdrawAccount(accountNo, withdrawAmount));
		}
	%>
</body>
</html>