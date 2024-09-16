use wipro;

drop Table If exists Employ;

create table Employ
(
   Empno INT Primary Key,
   Name varchar(15) NOT NULL,
   Gender ENUM('MALE','FEMALE'),
   Dept varchar(20),
   Desig varchar(20),
   Basic Numeric(9,2)
);

Insert into Employ(Empno,Name, Gender,
Dept,Desig,Basic) 
values(1,'Tarak','MALE','Java','Programmer',88234),
(2,'Rinka','FEMALE','Dotnet','Expert',98822),
(3,'Lavanya','FEMALE','Java','Deveoper',99255),
(4,'Muhammed','MALE','Java','Expert',99224),
(5,'Srujan','MALE','Dotnet','Manager',87752),
(6,'Archana','FEMALE','Sql','Expert',88824),
(7,'Mounika','FEMALE','Sql','DBA',84522),
(8,'Ajinkya','MALE','Dotnet','Expert',88234);

select * From Employ;
