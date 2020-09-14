create database accountbank;
-- drop database accountbank;
use accountbank;

create table Customers (
customer_number int (11) primary key auto_increment,
full_name varchar (50) not null,
address varchar (255) not null,
email varchar (50) not null unique,
phone varchar (50) not null unique
);

create table phone(
phone varchar (50) primary key
);

create table email (
email varchar (50) primary key
);

create table Accounts (
account_number int (11) primary key auto_increment,
account_type varchar (255) not null,
date_use_account date not null,
balance double not null
-- customer_number int (11) unique,
-- foreign key (customer_number) references Customers (customer_number)
);

alter table Accounts
add column customer_number int (11) unique;
alter table Accounts
add foreign key (customer_number) references Customers (customer_number);

create table Transactions (
tran_number int (11) primary key auto_increment,
account_number int (11) not null,
date_tran date not null,
amounts double not null
-- descriptions  varchar (255) not null,
-- foreign key (account_number) references Accounts (account_number)
);

alter table Transactions
add foreign key (account_number) references Accounts (account_number);

alter table email
add foreign key (email) references Customers (email);

alter table phone
add foreign key (phone) references Customers (phone);
