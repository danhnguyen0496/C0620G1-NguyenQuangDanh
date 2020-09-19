drop database if exists ham_thong_dung_sql;
create database ham_thong_dung_sql;
use ham_thong_dung_sql;

create table ham_sql (
id int primary key auto_increment,
`name` varchar (45),
tuoi int,
khoa_hoc varchar (45),
so_tien varchar (45)
);

insert into ham_sql (`name`,tuoi,khoa_hoc,so_tien)
values 
('Hoang',21,'CNTT','400000'),
('Viet',19,'DTVT','320000'),
('Thanh',18,'KTDN','400000'),
('Nhan',19,'CK','450000'),
('Huong',20,'TCNH','500000'),
('Huong',20,'TCNH','200000');

select *
from ham_sql
where `name` = 'Huong'; 

select sum(so_tien) as totalMoney
from ham_sql;

select `name`
from ham_sql
group by `name`;
