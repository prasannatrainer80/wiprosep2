SELECT * FROM infinite_december.emp;

-- Write a query to display ManagerName as 
-- For CLERK 'Avesh'
-- For SALESMAN 'Chetan'
-- For MANAGER 'Sujay'
-- For ANALYST 'Subodh'
-- For President 'No Manager'

select Empno, Ename, job, sal, hiredate,
CASE JOB
    WHEN 'CLERK' THEN 'AVESH'
    WHEN 'SALESMAN' THEN 'Chetan'
    WHEN 'MANAGER' THEN 'Sujay'
    WHEN 'ANALYST' THEN 'Subodh'
    else 'No Manager'
END "Manager"
 from Emp;
 
 -- Write a Query, as For dname field as
 -- For 'ACCOUNTING' HEADoFFICE as 'Hyderabad'
--  For 'RESEARCH' HeadOffice as 'Delhi'
--  For 'SALES' headOffice as 'PUNE'
--  For 'OPERATIONS' headOffice as 'Mumbai'

select * from Dept;

select DeptNo, Dname, Loc,
CASE Dname
  WHEN 'ACCOUNTING' THEN 'Hyderabad'
  WHEN 'RESEARCH' THEN 'DELHI'
  WHEN 'SALES' THEN 'PUNE'
  WHEN 'OPERATIONS' THEN 'MUMBAI'
END "HeadOffice"
from dept;

select Empno, Ename, job, sal, comm from Emp;

-- Write a query ensure if comm is null replace with 0 else place commision 

select empno, ename, job, sal, comm, 
case when comm is null then 0 else comm end
"Updated"
from Emp ;

-- Write a Query ensure generate runtime column as "TakeHome" if comm is null then sal as takehome, if comm is not null then sal +comm as takehome

select empno, ename, job, sal, comm, 
case when comm is null then 0 else comm end
"Updated",
CASE WHEN COMM IS NULL THEN SAL ELSE SAL + COMM
END "TAKE HOME"
from Emp ;
