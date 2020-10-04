drop database if exists furama_resort;
create database furama_resort;
use furama_resort;

create table vi_tri (
id_vi_tri int primary key,
ten_vi_tri varchar (45)
);

create table trinh_do (
id_trinh_do int primary key,
trinh_do varchar (45)
);

create table bo_phan (
id_bo_phan int primary key,
ten_bo_phan varchar (45)
);

create table nhan_vien (
id_nhan_vien int primary key,
ho_ten varchar (45),
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

create table loai_khach(
id_loai_khach int primary key,
ten_loai_khach varchar (45)
);

create table khach_hang (
id_khach_hang int primary key,
id_loai_khach int,
ho_ten varchar (45),
ngay_sinh date,
so_cmnd varchar (45),
sdt varchar (45),
email varchar (45),
dia_chi varchar (45),
foreign key (id_loai_khach) references loai_khach(id_loai_khach)
);

create table kieu_thue (
id_kieu_thue int primary key,
ten_kieu_thue varchar (45),
gia int
);

create table loai_dich_vu (
id_loai_dich_vu int primary key,
ten_loai_dich_vu varchar (45)
);

create table dich_vu (
id_dich_vu int primary key,
ten_dich_vu varchar (45),
dien_tich int,
so_tang int,
so_nguoi_toi_da int,
chi_phi_thue int,
id_kieu_thue int,
id_loai_dich_vu int,
trang_thai varchar (45),
foreign key (id_kieu_thue) references kieu_thue (id_kieu_thue),
foreign key (id_loai_dich_vu) references loai_dich_vu (id_loai_dich_vu)
);

create table hop_dong (
id_hop_dong int primary key,
id_nhan_vien int,
id_khach_hang int,
id_dich_vu int,
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_dat_coc int,
tong_tien int,
constraint fk_nhan_vien foreign key (id_nhan_vien) references nhan_vien (id_nhan_vien) on delete cascade on update cascade,
constraint fk_khach_hang foreign key (id_khach_hang) references khach_hang (id_khach_hang) on delete cascade on update cascade,
constraint fk_dich_vu foreign key (id_dich_vu) references dich_vu (id_dich_vu) on delete cascade on update cascade
);

create table dich_vu_di_kem (
id_dich_vu_di_kem int primary key,
ten_dich_vu_di_kem varchar (45),
gia int,
don_vi int,
trang_thai_kha_dung varchar (45)
);

create table hop_dong_chi_tiet (
id_hop_dong_chi_tiet int primary key,
id_hop_dong int,
id_dich_vu_di_kem int,
so_luong int,
constraint fk_hop_dong foreign key (id_hop_dong) references hop_dong (id_hop_dong) on delete cascade on update cascade,
constraint fk_dich_vu_di_kem foreign key (id_dich_vu_di_kem) references dich_vu_di_kem (id_dich_vu_di_kem) on delete cascade on update cascade
);
