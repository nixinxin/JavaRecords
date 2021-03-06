drop database if exists sm;

create database sm;

use sm;


create table department(
	id int primary key auto_increment,
	name varchar(20) not null,
	address varchar(100)
);

create table staff(
	id int primary key auto_increment,
	account varchar(20) not null,
	password varchar(20) not null,
	status varchar(10) not null,
	did int,
	name varchar(20),
	sex char(2),
	id_number char(18),
	work_time datetime,
	leave_time datetime,
	born_date date,
	info varchar(200)
);

create table log(
	opr_time datetime not null,
	type varchar(10) not null,
	operator varchar(20) not null,
	moudle  varchar(20) not null,
	operation  varchar(20) not null,
	result  varchar(100) not null
);

alter table staff add constraint fk_staff_dep foreign key(did) references department(id);

