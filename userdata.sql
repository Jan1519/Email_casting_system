use emailcasting;
create table userdata(Id int(10),Name varchar(50),Email varchar(50),Password varchar(25),Country varchar(50));
insert into userdata(Id,Name,Email,Password,Country)values('01','Janki Singh','janki@gmail.com','1234','India');
insert into userdata(Id,Name,Email,Password,Country)values('02','Juhi Singh','juhi@gmail.com','123','India');
select * from userdata;
