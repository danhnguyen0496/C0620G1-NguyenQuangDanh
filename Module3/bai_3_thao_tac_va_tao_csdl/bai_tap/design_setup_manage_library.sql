drop database if exists manage_library;

create database manage_library;

use manage_library;

create table books (
book_code varchar(50) primary key,
book_name varchar(50) not null,
book_publishing varchar(50) not null,
book_author varchar(50) not null,
book_year_publishing varchar (50) not null,
book_count_publishing varchar (50) not null,
book_price varchar (50) not null,
book_image text,
category_type_book varchar (50),
student_number varchar(15)
);

create table students (
student_number varchar(15) primary key,
student_name varchar(50) not null,
student_address varchar(500) not null,
student_email varchar(50) not null,
student_image text
);

create table categorys (
category_type_book varchar (50) primary key
);

create table borrow_order (
borrow_order_code varchar(50) primary key,
borrow_date date,
information_student varchar (100),
student_number varchar(15)
);

alter table books
add foreign key (category_type_book) references categorys (category_type_book);

alter table books
add foreign key (student_number) references students (student_number);

alter table borrow_order
add foreign key (student_number) references students (student_number);
