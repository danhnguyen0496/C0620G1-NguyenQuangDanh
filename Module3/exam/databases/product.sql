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
('Television'),
('Tủ lạnh'),
('Máy giặc');

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
(1, 'iphone11', 799, 12, 'Black, Yeloow, Green', 'normal', 1),
(2, 'iphone 11 pro', 1100.0, 12, 'Black, Yeloow, Green', 'vip', 1),
(3, 'iphone x', 749.0, 12, 'Black, Yeloow, Green', 'normal', 1),
(4, 'smart tivi 55 inch', 799.0, 12, 'Black, Yeloow, Green', 'normal', 2),
(5, 'Tủ lạnh 2 cánh Tosiba', 799.0, 12, 'Black, Yeloow, Green', 'normal', 3),
(6, 'Máy giặc cửa ngang Samsung', 320.0, 12, 'Black, Yeloow, Green', 'normal', 3);


