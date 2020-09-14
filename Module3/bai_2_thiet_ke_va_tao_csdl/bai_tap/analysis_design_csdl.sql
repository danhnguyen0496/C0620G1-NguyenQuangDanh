drop database if exists analysis_design_csdl;

create database analysis_design_csdl;

use analysis_design_csdl;

create table customers (
customer_number int primary key,
customer_name varchar (50) not null,
contact_last_name varchar (50) not null,
contact_first_name varchar (50) not null,
customer_phone varchar (50) not null unique,
customer_address1 varchar (50) not null,
customer_address2 varchar (50),
customer_city varchar (50) not null,
customer_state varchar (50) not null,
customer_postal_code varchar (50) not null,
customer_country varchar (50) not null,
credit_limit double
);

create table productsline (
productline_code varchar (50) primary key,
productline_descript text not null,
productline_image varchar (255)
);

create table products (
product_code int primary key ,
product_name varchar (70) not null,
product_scale varchar (10) not null,
product_vendor varchar (50) not null,
product_descript text not null,
product_manufacturer varchar (50) not null,
product_quantity_stock int not null, 
product_price_import double not null,
product_price_MSRP double not null
);

create table orders(
order_number int primary key ,
order_date_buy date not null,
order_date_require_delivery date not null,
order_date_delivery_actual date not null,
order_quantity_order int not null, 
order_price_order double not null
);

create table payments (
payment_code int primary key ,
payment_date date not null,
payment_money double not null,
product_code int
);

create table employees (
employee_number int primary key ,
employee_last_name varchar (50) not null,
employee_first_name varchar (50) not null,
employee_email varchar (255) not null,
employee_title_job varchar (255) not null
);

create table offices (
office_code int primary key ,
office_city varchar (50) not null,
office_phone varchar (50) not null,
office_address1 varchar (50) not null,
office_address2 varchar (50) not null,
office_state varchar (50) not null,
office_country varchar (50) not null,
office_postal_code varchar (15) not null
);

create table orderdetails(
productCode int,
orderNumber int,
primary key (productCode,orderNumber),
foreign key (productCode) references products (product_code),
foreign key (orderNumber) references orders(order_number)
);

alter table employees
add reportTo int;
alter table employees
add foreign key (reportTo) references employees(employee_number);

alter table orders
add customer_number int;
alter table orders
add foreign key (customer_number) references customers(customer_number);

alter table payments
add customer_number int;
alter table payments
add foreign key (customer_number) references customers(customer_number);

alter table customers
add sales_rep_employee_number int;
alter table customers
add foreign key (sales_rep_employee_number) references employees (employee_number);
    
alter table products
add productline_code varchar(50);
alter table products
add foreign key (productline_code) references productsline (productline_code);

alter table employees
add office_code int;
alter table employees
add foreign key (office_code) references offices (office_code);

