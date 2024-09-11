-- Sql String Functions 

-- length() : used to define the length of particular string value

select length('Aditya Guda');

select Ename, Length(Ename) from Emp;

-- Reverse() : Used to display name in reverse order 

select reverse('Archana');

select Ename, Reverse(Ename) from Emp;

-- Left() : Used to display no.of left-side chars

select left('Taraka Prabhu',4);

-- Right() : used to display no.of right-side chars

select right('Taraka Prabhu',4);

-- Substring() : used to display part of string from starting point to end point

select substring('Taraka Prabhu',2,5);

-- Lower() : Displays string in lower case
-- Upper() : Displays String in upper case

select lower('Shyam Sundar');

select upper('kshama');

-- concat() : used to concat multiple strings into single String

select concat('Rinka',' ','Kumari');

-- Replace() : used to replace old value with new value in all occurrences

select replace('Java Training','Java','Dotnet');