create database khoachinh;
-- drop database khoachinh;
use khoachinh;

create table users (
user_id int auto_increment primary key,
username varchar (40),
password varchar (255),
email varchar (255)
);

CREATE TABLE roles(
   role_id INT AUTO_INCREMENT,
   role_name VARCHAR(50),
   PRIMARY KEY(role_id)
);

create table userroles (
user_id int,
role_id int,
primary key (user_id, role_id),
foreign key (user_id) references users (user_id),
foreign key (role_id) references roles (role_id)
);