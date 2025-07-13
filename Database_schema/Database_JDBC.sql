show databases;
use mydatabase;

show tables;

CREATE TABLE student(
id int auto_increment primary key,
name varchar(255) not null,
age int not null,
course varchar(255) not null);

describe student;