drop database if exists furama_resort;
create database furama_resort;
use furama_resort;

create table vi_tri (
id_vi_tri int primary key auto_increment,
ten_vi_tri varchar (45)
);

create table trinh_do (
id_trinh_do int primary key auto_increment,
trinh_do varchar (45)
);

create table bo_phan (
id_bo_phan int primary key auto_increment,
ten_bo_phan varchar (45)
);

create table nhan_vien (
id_nhan_vien int primary key auto_increment,
ho_ten int,
id_vi_tri int,
id_trinh_do int,
id_bo_phan int,
ngay_sinh date,
so_cmnd varchar (45),
luong varchar (45),
sdt varchar (45),
email varchar (45),
dia_chi varchar (45),
foreign key (id_vi_tri) references vi_tri (id_vi_tri),
foreign key (id_trinh_do) references trinh_do (id_trinh_do),
foreign key (id_bo_phan) references bo_phan (id_bo_phan)
);





