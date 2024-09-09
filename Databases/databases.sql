use apartmentMS;
show databases;

create table login (username varchar(25) not null unique,
password varchar(25)not null);
select*from login;
insert into login value('admin1', '1234567');

create table manage(countNo INT AUTO_INCREMENT PRIMARY KEY,
perId varchar(25) not null,
owner varchar(100),
gender varchar(25),
birthYear varchar (25)not null,
phoneNo varchar(25) not null,
mail varchar(100) not null unique,
apartmentNo varchar(20) not null,
area varchar(20) not null);
select*from manage;
