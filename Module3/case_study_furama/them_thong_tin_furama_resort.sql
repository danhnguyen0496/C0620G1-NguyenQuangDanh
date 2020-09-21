use furama_resort;

insert into vi_tri 
values 
(1, 'Lễ tân'),
(2, 'Phục vụ'),
(3, 'Chuyên viên'),
(4, 'Giám sát'),
(5, 'Quản lý'),
(6, 'Giám đốc');

-- select *from vi_tri;
-- select *from trinh_do;
-- select *from bo_phan;
-- select *from nhan_vien;
-- delete from vi_tri;
-- delete from trinh_do;
-- delete from bo_phan;

insert into trinh_do 
values 
(1, 'Trung cấp'),
(2, 'Cao đẳng'),
(3, 'Đại học'),
(4, 'Sau đại học');

insert into bo_phan 
values 
(1, 'Sale – Marketing'),
(2, 'Hành Chính'),
(3, 'Phục vụ'),
(4, 'Quản lý');

insert into nhan_vien 
values 
(1,'Hồ Quang Hiếu',1,1,1,'2000-01-01','123456789','10000000','0905567678','hieu@gmail.com','Đà Nẵng'),
(2,'Hồ Quỳnh Anh',2,2,2,'2001-02-02','123456987','20000000','0988123234','anh@gmail.com','Huế'),
(3,'Mai Phương Thúy',3,3,3,'2002-03-03','987567123','30000000','0988545676','thuy@gmail.com','Quảng Trị'),
(4,'Sơn Tùng',4,4,4,'2003-04-04','999777888','90000000','0999978787','tung@gmail.com','Quảng Nam'),
(5,'Khánh',2,3,4,'2001-02-04','989477888','94000000','0799978787','khanh@gmail.com','Quảng Nam'),
(6,'Khánh Phương',2,3,1,'2008-08-08','333797999','50020000','0977155799','phuong@gmail.com','Sài Gòn'),
(7,'Bích Phương',1,3,4,'2010-05-05','333666999','90001000','0977255799','bichphuong@gmail.com','Vinh');

-- select *from nhan_vien;
-- delete from nhan_vien;

insert into loai_khach 
values 
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');

--  select *from loai_khach;

insert into khach_hang 
values 
(1,1,'Văn Đô','1999-01-02','000111222','0123999666','do@gmail.com','Đà Nẵng'),
(2,2,'Tiền Mỹ','1998-02-03','000333666','0988789789','my@gmail.com','Quảng Trị'),
(3,1,'Thị Nhật','1997-03-04','666888000','0777555666','nhat@gmail.com','Vinh'),
(4,3,'Phong Hàn','1996-04-05','444666888','233355666','han@gmail.com','Đà Nẵng'),
(5,5,'Ban Sin','1995-05-06','222444666','0966543678','sin@gmail.com','Quảng Ngãi'),
(6,1,'Đường Ấn','1995-05-06','222444666','0966543678','sin@gmail.com','Quảng Ngãi'),
(7,3,'Văn Đô','1995-05-06','283742398','0989777888','do@gmail.com','Quảng Nam'),
(8,2,'Mai Trường','1990-01-06','283712378','0989788888','truong@gmail.com','Quảng Ninh');
--  select *from khach_hang;

insert into kieu_thue 
values
(1,'Năm',1000000),
(2,'Tháng',200000),
(3,'Ngày',30000),
(4,'Giờ',4000);
--  select *from kieu_thue;

insert into loai_dich_vu 
values
(1,'Villa'),
(2,'House'),
(3,'Phòng'),
(4,'Dịch vụ đi kèm');
--  select *from loai_dich_vu;
 
insert into dich_vu 
values
(1,'Villa',20,5,50,5000000,1,1,'Còn dịch vụ'),
(2,'Room',60,2,80,4000000,3,3,'Còn dịch vụ'),
(3,'House',80,2,30,2000000,2,2,'Còn dịch vụ'),
(4,'House',30,5,80,7000000,1,1,'Hết dịch vụ'),
(5,'Villa',90,8,100,90000000,4,4,'Còn dịch vụ');
-- select *from dich_vu;

insert into hop_dong 
values
(1,1,1,1,'2018-10-12','2018-10-30',200000,15000000),
(2,3,2,4,'2019-10-10','2019-12-20',500000,900000),
(3,3,3,2,'2018-04-06','2018-06-15',800000,10000000),
(4,5,1,3,'2019-02-01','2019-04-15',6000000,20000000),
(5,4,5,5,'2018-07-05','2018-08-29',3000000,8000000),
(6,2,3,3,'2019-01-05','2019-03-20',1800000,5000000),
(7,3,2,1,'2019-03-10','2019-05-10',2200000,7000000),
(8,5,8,4,'2019-02-06','2019-03-15',1350000,120000000),
(9,3,6,1,'2019-10-12','2019-10-30',200000,600000),
(10,2,3,1,'2019-10-01','2019-12-30',230000,16000000),
(11,6,1,2,'2014-10-01','2014-12-30',233200,2660870),
(12,7,3,4,'2015-05-01','2015-06-10',133200,12560870);
-- delete from hop_dong;
-- select *from hop_dong;

insert into dich_vu_di_kem 
values
(1,'Massage',1000000,13,'Mở cửa'),
(2,'Karaoke',500000,10,'Mở cửa'),
(3,'Thức ăn',100000,15,'Còn dịch vụ'),
(4,'Nước uống',20000,7,'Còn dịch vụ'),
(5,'Thuê xe',90000,12,'Còn dịch vụ');
-- select *from dich_vu_di_kem;

insert into hop_dong_chi_tiet 
values
(1,2,3,10),
(2,1,4,20),
(3,3,1,15),
(4,4,2,30),
(5,5,5,8),
(6,4,2,5),
(7,9,1,20);
-- select *from hop_dong_chi_tiet;