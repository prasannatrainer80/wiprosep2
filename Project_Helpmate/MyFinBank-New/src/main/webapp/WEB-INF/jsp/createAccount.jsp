<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>
	Create Account Page under Construction...
</p>
<form action="createFinal">
	<center>
		FirstName : 
		<input type="text" name="firstName" /> <br/> <br/>
		Last Name :
		<input type="text" name="lastName" /> <br/><br/>
		City : 
		<select name="city">
			<option value="Hyderabad">Hyderabad</option>
			<option value="Chennai">Chennai</option>
			<option value="Bangalore">Bangalore</option>
			<option value="Delhi">Delhi</option>
		</select> <br/><br/>
		State : 
		<input type="text" name="state" /> <br/><br/>
		Gender : 
		<select name="gender">
			<option value="MALE">MALE</option>
			<option value="FEMALE">FEMALE</option>
		</select> <br/>
		Amount : 
		<input type="number" name="amount" /> <br/><br/>
		Email : 
		<input type="email" name="email" /> <br/><Br/>
		Mobile No : 
		<input type="text" name="mobileNo" /> <br/><br/>
		User Name : 
		<input type="text" name="userName" /> <br/><br/>
		Password : 
		<input type="password" name="passWord" /> <br/><br/>
		Cheq Facil : 
		<select name="cheqFacil">
			<option value="Yes">Yes</option>
			<option value="No">No</option>
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
</body>
</html>