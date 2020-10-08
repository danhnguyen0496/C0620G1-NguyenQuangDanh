drop database if exists product;

create database product;

use product;


create table category(
category_id int primary key auto_increment,
category_name varchar(40)
);

insert into category(category_name)
values
('Phone'),
('Television');

create table product (
product_id varchar(40) primary key,
product_name varchar(40),
product_price double,
product_quantity int,
product_color varchar(40),
product_description varchar(40),

category_id int,
foreign key (category_id) references category(category_id)
);

insert into product (product_id, product_name, product_price, product_quantity, product_color, product_description, category_id)
values
(1, 'SamsungA4', 300, 4, 'blue', 'normal', 1),
(2, 'SamsungJ8', 500, 6, 'green', 'vip', 2),
(3, 'SamsungS10', 100, 2, 'dark', 'normal', 2);


