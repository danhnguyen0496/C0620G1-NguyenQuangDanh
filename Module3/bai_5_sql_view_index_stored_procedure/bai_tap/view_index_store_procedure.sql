drop database if exists bai_5;

create database bai_5;

use bai_5;

create table products (
id int primary key,
product_code varchar (45),
product_name varchar (45),
product_price float,
product_amount int,
product_description varchar (45),
product_status varchar (45)
); 

insert into products
values 
(1,'A11','Iphone',2000000,5,'vip','Con hang'),
(2,'A12','Sam Sung',1000000,2,'normal','Con hang'),
(3,'A13','Oppo',500000,3,'normal','Con hang'),
(4,'A14','Nokia',800000,6,'normal','Con hang');

select *from products;

-- tạo unique index
create unique index idx_product_code on products (product_code);
-- alter table products add unique index idx_product_code (product_code);

-- xóa unique index
drop index idx_product_code on prouducts ;

-- tạo composite index
alter table products add index idx_composite(product_name,product_price);

-- xóa composite index
drop index idx_composite on products ;

-- hiện thị trước khi add unique index
-- select * from products where product_code = 'A13';

explain select * from products where product_code = 'A13';

-- hiện thị sau khi add unique index
-- select * from products where product_code = 'A13';

explain select * from products where product_code = 'A13';


-- hiện thị trước khi add composite index
-- select *from products where product_name = 'Iphone' or product_price = 2000000;

explain select *from products where product_name = 'Iphone' or product_price = 2000000;

-- hiện thị sau khi add composite index
-- select *from products where product_name = 'Iphone' or product_price = 2000000;

explain select *from products where product_name = 'Iphone' or product_price = 2000000;

-- tạo view
create view view_product
as
select id, product_code,product_name, product_price, product_status
from products;

select * from view_product;

-- chỉnh sửa view
insert into view_product
values
(6,'A16', 'Vertu', 90000000, 'Het hang'),
(7,'A15', 'Vinsmart', 800000, 'Con hang');

update view_product
set id = 5
where id  = 6;

-- xóa view
drop view view_product;

-- tạo store procedure
delimiter //
create procedure find_information_product()
begin
select *from products;
end //
delimiter ;

call find_information_product();

-- tạo store procedure add new product
delimiter //
create procedure add_new_product()
begin
insert into products
values
(8,'A118','Sam Sung',1000000,2,'normal','Con hang');
end //
delimiter ;

call add_new_product();
select *from products;

delimiter //
create procedure add_new_product( 
id int,
product_code varchar (45),
product_name varchar (45),
product_price float,
product_amount int,
product_description varchar (45),
product_status varchar (45))
begin
insert into products
values
(@id,@product_code,@product_name,@product_price,@product_amount,@product_description,@product_status);
end //
delimiter ;

set 
@id = 20,
@product_code = 'A101', 
@product_name = 'Sony', 
@product_price = 1800000, 
@product_amount = 12,
@product_description = 'vip',
@product_status  ='Het hang';
call add_new_product(@id,@product_code,@product_name,@product_price,@product_amount,@product_description,@product_status);
select * from products;

-- store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure edit_information_product(id_product int)
begin
update products 
set 
product_code =  @product_code, 
product_name = @product_name,
product_price = @product_price,
product_amount = @product_amount,
product_description = @product_description,
product_status  = @product_status
-- product_code = 'A10', 
-- product_name = 'Xiaomi',
-- product_price = 2500000,
-- product_amount = 19,
-- product_description = 'vip',
-- product_status  ='Con hang'
where id = id_product;
end //
delimiter ;

set 
@product_code = 'A50', 
@product_name = 'Xiaomi', 
@product_price = 2500000, 
@product_amount = 19,
@product_description = 'vip',
@product_status  ='Con hang';
set @id = 3;
call edit_information_product(@id);
select *from products
where id = 3;

-- tạo store procedure xoá sản phẩm theo id
delimiter //
create procedure delete_product (in id_product int)
begin
delete from products
where id = id_product;
end //
delimiter ;

set @id = 4;
call delete_product(@id);
select * from products;
