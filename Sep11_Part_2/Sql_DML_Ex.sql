-- Update : Used to update all or particular fields

-- Update table_name 
-- set field1=newvale, field2=newvalue
-- WHERE Condition

Update Employ set Name = Upper(name);

select * from Employ;

update Employ set Basic=90000 WHERE Empno = 1;

update Employ set Name='Prabhu',Gender='MALE',
Dept='J2EE',Desig='Manager',Basic=88882
WHERE Empno = 1;

-- Delete : This command allows you to delete Records from Particular Table

-- Delete from table_name where condition

Delete from Employ where empno = 5;


