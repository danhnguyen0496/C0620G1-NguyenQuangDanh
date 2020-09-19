use furama_resort;

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống 
--      có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.

select * from nhan_vien
where ho_ten regexp binary '[HTK]\\w+$' and char_length(ho_ten) <= 15;
-- where ho_ten regexp binary '\\s[HTK][:alpha:]+$';

-- 3.	Hiển thị thông tin của tất cả khách hàng 
--      có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.

select *from khach_hang
-- where (dia_chi = 'Đà Nẵng' or  dia_chi = 'Quảng Trị')
where dia_chi in ('Đà Nẵng','Quảng Trị')
and (year(now()) - year(ngay_sinh)) between 18 and 50;

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
--      Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
--      Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

select * from khach_hang;
select * from hop_dong;

select count(hop_dong.id_khach_hang) as 'so_lan', khach_hang.ho_ten, loai_khach.ten_loai_khach
from khach_hang
left join hop_dong on khach_hang.id_khach_hang =  hop_dong.id_khach_hang
left join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
where loai_khach.ten_loai_khach = 'Diamond'
group by khach_hang.id_khach_hang
order by so_lan;

-- 5. Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, 
-- TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong 
-- và Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phỏng. 
-- (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

select k.id_khach_hang, k.ho_ten, lk.ten_loai_khach, hd.id_hop_dong,
ldv.ten_loai_dich_vu, hd.ngay_lam_hop_dong, hd.ngay_ket_thuc, dv.chi_phi_thue + hdct.so_luong + dvdk.gia, sum(dv.chi_phi_thue + hdct.so_luong*dvdk.gia) as 'tong_tien'
from khach_hang k
left join loai_khach lk on k.id_loai_khach = lk.id_loai_khach
left join hop_dong hd on k.id_khach_hang = hd.id_khach_hang
left join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
left join loai_dich_vu ldv on dv.id_loai_dich_vu = ldv.id_loai_dich_vu
left join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
left join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem
group by k.id_khach_hang;







