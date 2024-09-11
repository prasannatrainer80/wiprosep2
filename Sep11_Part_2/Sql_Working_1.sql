-- How to change to particular database

use wipro;

-- Display information about emp table

desc Emp;

-- Display information about dept table 

desc dept;

-- Display all records from Emp table 

select * from Emp;

-- Display all records from Dept table 

select * from dept; 

-- projection : Used to display particular fields from the given table 

select Empno, Ename, Job, Sal, Hiredate
from Emp;

-- Display empno, ename, job, sal, mgr from Emp table 

select empno, ename, job, sal, mgr
from Emp;

-- WHERE Clause : used to display filtered records from the given table 

-- Display all records whose sal > 1500

select * from Emp where sal > 1500;

-- Display all records whose job is 'Manager' 

select * from Emp where job='MANAGER';

-- Display info whose ename is 'SCOTT'

select * from Emp where ename='SCOTT';

-- Display info where sal < 1000

select * from Emp where sal < 1000;

-- BETWEEN...AND : Used to display records from start to end range 

-- Dispaly records whose sal from 1000 to 2000

select * from Emp where SAL BETWEEN 1000 and 2000;

select * from Emp where SAL NOT BETWEEN 1000 and 2000;

-- IN Clause : Used to display records for multiple field values 

-- Display info whose Ename is 'SCOTT', 'FORD', 'BLAKE','KING' 

select * from Emp where ENAME IN('SCOTT','FORD','BLAKE','KING');

select * from Emp where ENAME NOT IN('SCOTT','FORD','BLAKE','KING');

-- LIKE Operator  : Used to display values w.r.t. wild cards 

-- Display all records whose name starts with 'A'

select * from Emp where ENAME LIKE 'A%';

-- Display all records whose name ends with 'S' 

select * from Emp where ENAME LIKE '%S';

select * from Emp WHERE ENAME LIKE 'J___S';

-- Order By : Used to display records base on specfic fields in ascending or descending order 

-- Display employ records based on sal wise asc order

select Empno, Ename, job, Sal, Mgr,Hiredate 
from Emp 
Order By Sal;

select Empno, Ename, job, Sal, Mgr,Hiredate 
from Emp 
Order By Sal DESC;

select Empno,Ename,job,sal,Mgr 
From Emp
Order By job,Ename;


select Empno,Ename,job,sal,Mgr 
From Emp
Order By job,Ename DESC;


