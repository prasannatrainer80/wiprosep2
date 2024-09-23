<%@page import="com.wipro.jsp.BankDaoImpl"%>
<%@page import="com.wipro.jsp.Bank"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="CreateAccount.jsp">
	<center>
		First Name : 
		<input type="text" name="firstName" /> <br/><br/>
		Last Name : 
		<input type="text" name="lastName" /><br/><Br/>
		City : 
		<input type="text" name="city" /> <Br/><Br/>
		State : 
		<input type="text" name="state" /> <br/><Br/>
		Amount : 
		<input type="number" name="amount" /> <br/><br/>
		Cheq Facility : 
		<select name="cheqFacil">
			<option value="YES">Yes</option>
			<option value="NO">No</option>
		</select> <br/><br/>
		Account Type : 
		<select name="accountType">
			<option value="Savings">Savings</option>
			<option value="Current">Current</option>
			<option value="Recurring">Recurring</option>
		</select> <br/><br/>
		<input type="submit" value="Create Account" />
	</center>
</form>
<%
	if (request.getParameter("amount")!=null) {
		Bank bank = new Bank();
		bank.setFirstName(request.getParameter("firstName"));
		bank.setLastName(request.getParameter("lastName"));
		bank.setCity(request.getParameter("city"));
		bank.setState(request.getParameter("state"));
		bank.setAmount(Double.parseDouble(request.getParameter("amount")));
		bank.setCheqFacil(request.getParameter("cheqFacil"));
		bank.setAccountType(request.getParameter("accountType"));
		BankDaoImpl impl = new BankDaoImpl();
		out.println(impl.createAccount(bank));
	}
%>
</body>
</html>