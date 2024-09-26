<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
       <form method="get" action="employshow">
       		Employ No :
       		<input type="number" name="empno" /> <br/><Br/>
       		Employ Name :
       		<input type="text" name="name" /> <br/><br/>
       		Gender : 
       		<input type="text" name="gender" /> <br/><br/>
       		Department : 
       		<input type="text" name="dept" /> <br/><br/>
       		Designation : 
       		<input type="text" name="desig" /><br/><br/>
       		Basic :
       		<input type="number" name="basic" /><br/><br/>
       		<input type="submit" value="Show" />
       </form> 
    </body>
</html>
