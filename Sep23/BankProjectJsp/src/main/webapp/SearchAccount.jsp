<%@page import="com.wipro.jsp.Bank"%>
<%@page import="com.wipro.jsp.BankDaoImpl"%>
<%@page import="com.wipro.jsp.BankDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="SearchAccount.jsp">
		<center>
			Account No : 
			<input type="number" name="accountNo" /> <br/><br/>
			<input type="submit" value="Search Account" />
		</center>
	</form>
	<%
		if (request.getParameter("accountNo")!=null) {
			int accountNo = Integer.parseInt(request.getParameter("accountNo"));
			BankDao dao = new BankDaoImpl();
			Bank bank = dao.searchAccount(accountNo);
			if (bank!=null) {
				out.println("First Name  " +bank.getFirstName() + "<br/>");
				out.println("Last Name  " +bank.getLastName() + "<br/>");
				out.println("City  " +bank.getCity() + "<br/>");
				out.println("State  " +bank.getState() + "<br/>");
				out.println("Amount  " +bank.getAmount() + "<br/>");
				out.println("Cheq Facil  " +bank.getCheqFacil() + "<br/>");
				out.println("Account Type  " +bank.getAccountType() + "<br/>");
				
			} else {
				out.println("*** Account No Not Found ***");
			}
		}
	%>
</body>
</html>