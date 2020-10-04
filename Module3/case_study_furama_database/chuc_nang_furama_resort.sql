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
ldv.ten_loai_dich_vu, hd.ngay_lam_hop_dong, hd.ngay_ket_thuc, dv.chi_phi_thue + hdct.so_luong * dvdk.gia, sum(dv.chi_phi_thue + hdct.so_luong*dvdk.gia) as 'tong_tien'
from khach_hang k
left join loai_khach lk on k.id_loai_khach = lk.id_loai_khach
left join hop_dong hd on k.id_khach_hang = hd.id_khach_hang
left join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
left join loai_dich_vu ldv on dv.id_loai_dich_vu = ldv.id_loai_dich_vu
left join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
left join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem
group by k.id_khach_hang;

-- 6. Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ 
-- chưa từng được Khách hàng thực hiện đặt trong quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).

select dv.id_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.chi_phi_thue, ldv.ten_loai_dich_vu, hd.ngay_lam_hop_dong
from dich_vu dv
right join loai_dich_vu ldv on dv.id_loai_dich_vu = ldv.id_loai_dich_vu
right join hop_dong hd on dv.id_dich_vu = hd.id_dich_vu
where not exists (
select * 
from dich_vu
where year(hd.ngay_lam_hop_dong) = '2019' 
and (month(hd.ngay_lam_hop_dong) = '1' or month(hd.ngay_lam_hop_dong) = '2' or month(hd.ngay_lam_hop_dong) = '3'));

-- 7. Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng trong năm 2019.
-- update lai

select dv.id_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.so_nguoi_toi_da, dv.chi_phi_thue,
ldv.ten_loai_dich_vu, hd.ngay_lam_hop_dong
from dich_vu dv
join loai_dich_vu ldv on dv.id_loai_dich_vu = ldv.id_loai_dich_vu
join hop_dong hd on dv.id_dich_vu = hd.id_dich_vu
where year(hd.ngay_lam_hop_dong) = '2018' and dv.id_dich_vu not in (
select dv.id_dich_vu
from dich_vu dv
join hop_dong hd on dv.id_dich_vu = hd.id_dich_vu
where year(hd.ngay_lam_hop_dong) = '2019'
); 

-- 8. Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên

select kh.ho_ten
from khach_hang kh
group by kh.ho_ten;

select distinct kh.ho_ten
from khach_hang kh;

select kh.ho_ten
from khach_hang kh
union
select kh.ho_ten
from khach_hang kh;

-- 9. Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 
-- thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

select hd.ngay_lam_hop_dong, count(kh.id_khach_hang) as 'so_luong_khach_hang', sum(hd.tong_tien) as 'tong_tien_moi_thang'
from hop_dong hd
join khach_hang kh on hd.id_khach_hang = kh.id_khach_hang
where year(hd.ngay_lam_hop_dong) ='2019'
group by month(hd.ngay_lam_hop_dong);

-- 10. Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
-- (được tính dựa trên việc count các IDHopDongChiTiet).

select hd.id_hop_dong, hd.ngay_lam_hop_dong, hd.ngay_ket_thuc,hd.tien_dat_coc,count(hdct.id_hop_dong_chi_tiet)
from hop_dong hd
join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem
group by hdct.id_dich_vu_di_kem;

-- 11. Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có 
-- TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.

select dvdk.*, kh.ho_ten, lk.ten_loai_khach
from dich_vu_di_kem dvdk
join hop_dong_chi_tiet hdct on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
join hop_dong hd on hdct.id_hop_dong = hd.id_hop_dong
join khach_hang kh on hd.id_khach_hang = kh.id_khach_hang
join loai_khach lk on kh.id_loai_khach = lk.id_loai_khach
where lk.ten_loai_khach = 'Diamond' and kh.dia_chi in ('Vinh','Quảng Ngãi');

--  12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
-- (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng 
-- đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.

select hd.id_hop_dong, nv.ho_ten,hd.ngay_lam_hop_dong, kh.ho_ten, kh.sdt, dv.ten_dich_vu, count(hdct.id_hop_dong_chi_tiet) as 'so_luong_dich_vu_di_kem', 
hd.tien_dat_coc
from hop_dong hd
join nhan_vien nv on hd.id_nhan_vien = hd.id_nhan_vien
join khach_hang kh on hd.id_khach_hang = kh.id_khach_hang
join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
where year(hd.ngay_lam_hop_dong) = '2019' and month(hd.ngay_lam_hop_dong) in('10','11','12') 
and dv.id_dich_vu not in (
select dv.id_dich_vu
from dich_vu dv
join hop_dong hd on dv.id_dich_vu = hd.id_dich_vu
where year(hd.ngay_lam_hop_dong) = '2019' and month(hd.ngay_lam_hop_dong) in('1','2','3','4','5','6') 
)
group by 'so_luong_dich_vu_di_kem';

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

create temporary table temp1
select dich_vu_di_kem.ten_dich_vu_di_kem as ten_dich_vu_di_kem, count(hop_dong_chi_tiet.id_dich_vu_di_kem) as so_lan_su_dung_dich_vu_di_kem
from dich_vu_di_kem
join hop_dong_chi_tiet on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
group by dich_vu_di_kem.ten_dich_vu_di_kem;

select * from temp1;
drop temporary table temp1;

create temporary table temp2
select max(temp1.so_lan_su_dung_dich_vu_di_kem) as max_so_lan_su_dung_dich_vu_di_kem
from temp1;

select * from temp2;
drop temporary table temp2;

select temp1.ten_dich_vu_di_kem , temp2.max_so_lan_su_dung_dich_vu_di_kem 
from temp2
join temp1 on temp2.max_so_lan_su_dung_dich_vu_di_kem = temp1.so_lan_su_dung_dich_vu_di_kem;

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.

select hd.id_hop_dong, ldv.ten_loai_dich_vu, dvdk.ten_dich_vu_di_kem, count(dvdk.id_dich_vu_di_kem) as so_lan_su_dung
from hop_dong hd
join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
join loai_dich_vu ldv on dv.id_loai_dich_vu = ldv.id_loai_dich_vu
join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem
group by dvdk.id_dich_vu_di_kem
having so_lan_su_dung = 1;

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.

select nv.id_nhan_vien, nv.ho_ten, td.trinh_do, bp.ten_bo_phan, nv.sdt, nv.dia_chi, hd.ngay_lam_hop_dong, count(nv.id_nhan_vien) as so_lan_lap_hop_dong
from nhan_vien nv
join trinh_do td on nv.id_trinh_do = td.id_trinh_do
join bo_phan bp on nv.id_bo_phan = bp.id_bo_phan
join hop_dong hd on nv.id_nhan_vien = hd.id_nhan_vien
where year(hd.ngay_lam_hop_dong) in ('2018','2019')
group by nv.id_nhan_vien
having so_lan_lap_hop_dong <= 3;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.

delete from nhan_vien nv
where nv.id_nhan_vien not in (
select bang_tam.id_nhan_vien
from (
select nv.id_nhan_vien 
from nhan_vien nv
join hop_dong hd on nv.id_nhan_vien = hd.id_nhan_vien
where year(hd.ngay_lam_hop_dong) between '2017' and '2019'
) as bang_tam
);
select * from nhan_vien;

-- 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond,
-- chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.

 select kh.*, lk.ten_loai_khach from khach_hang kh
 join loai_khach lk on kh.id_loai_khach = lk.id_loai_khach;
 
 update khach_hang
 set khach_hang.id_loai_khach =1
 where khach_hang.id_khach_hang in (
 select bang_tam.id_khach_hang
 from (
 select khach_hang.id_khach_hang
 from khach_hang
 join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
 where year(hop_dong.ngay_lam_hop_dong) = '2019' and hop_dong.tong_tien > 10000000
 ) as bang_tam
 );
 
 -- 18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràng buộc giữa các bảng).
 
delete from khach_hang kh
where kh.id_khach_hang in (
select bang_tam.id_khach_hang 
from (
select kh.id_khach_hang, kh.ho_ten
from khach_hang kh
join hop_dong hd on kh.id_khach_hang = hd.id_khach_hang
where year(hd.ngay_lam_hop_dong) < '2016' 
) as bang_tam
);

select kh.*, hd.ngay_lam_hop_dong  
from khach_hang kh
join hop_dong hd on kh.id_khach_hang = hd.id_khach_hang;

-- 19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.

select hop_dong_chi_tiet.*, dich_vu_di_kem.gia from hop_dong_chi_tiet
join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
where hop_dong_chi_tiet.so_luong > 10;

update hop_dong_chi_tiet
join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
set dich_vu_di_kem.gia = (dich_vu_di_kem.gia)*2
where hop_dong_chi_tiet.so_luong in (
select hop_dong_chi_tiet.so_luong
from hop_dong_chi_tiet
where hop_dong_chi_tiet.so_luong > 10
);

--  20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, 
-- thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.

select nv.id_nhan_vien as id, nv.ho_ten,nv.email,nv.sdt,nv.ngay_sinh,nv.dia_chi, 'Nhân viên' as 'Khách hàng hoặc Nhân viên' 
from nhan_vien nv
union all
select kh.id_khach_hang as id, kh.ho_ten,kh.email,kh.sdt,kh.ngay_sinh,kh.dia_chi, 'Khách hàng' as 'Khách hàng hoặc Nhân viên' 
from khach_hang kh;


-- 21. Tạo khung nhìn có tên là V_NHANVIEN để lấy được thông tin của tất cả các nhân viên 
--    có địa chỉ là “Hải Châu” và đã từng lập hợp đồng cho 1 hoặc nhiều Khách hàng bất kỳ
--    với ngày lập hợp đồng là “12/12/2019”

create view V_NHANVIEN
as
select nv.ho_ten, hd.ngay_lam_hop_dong, nv.dia_chi
from nhan_vien nv
join hop_dong hd on nv.id_nhan_vien = hd.id_nhan_vien
where nv.dia_chi = 'Hải Châu' and hd.ngay_lam_hop_dong = '2019-12-12';

select * from V_NHANVIEN;
drop view V_NHANVIEN;

-- 22.	Thông qua khung nhìn V_NHANVIEN thực hiện cập nhật địa chỉ thành “Liên Chiểu” đối với tất cả các Nhân viên 
-- được nhìn thấy bởi khung nhìn này.

update V_NHANVIEN
set dia_chi = 'Liên Chiểu'
where dia_chi = 'Hải Châu';

select * from nhan_vien;

-- 23.	Tạo Store procedure Sp_1 Dùng để xóa thông tin của một Khách hàng nào đó 
--  với Id Khách hàng được truyền vào như là 1 tham số của Sp_1

delimiter //
create procedure delete_info_customer (id_khach_hang int)
begin
delete from khach_hang
where khach_hang.id_khach_hang = id_khach_hang;
end; //
delimiter ;

call delete_info_customer (1);

-- 24.	Tạo Store procedure Sp_2 Dùng để thêm mới vào bảng HopDong với yêu cầu Sp_2 
-- phải thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung, với nguyên tắc không được trùng khóa chính 
-- và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.

select * from hop_dong;

delimiter //
create procedure add_new_contact 
(
id_hop_dong int,
id_nhan_vien int,
id_khach_hang int,
id_dich_vu int,
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_dat_coc int,
tong_tien int
)
begin
insert into hop_dong
(
id_hop_dong,
id_nhan_vien,
id_khach_hang,
id_dich_vu,
ngay_lam_hop_dong,
ngay_ket_thuc,
tien_dat_coc,
tong_tien
)
select *from hop_dong
join nhan_vien on hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien
join khach_hang on hop_dong.id_khach_hang = khach_hang.id_khach_hang
join dich_vu on dich_vu.id_dich_vu = dich_vu.id_dich_vu
where (nhan_vien.id_nhan_vien between 1 and 7) and (khach_hang.id_khach_hang between 1 and 8) and (dich_vu.id_dich_vu between 1 and 5);
end; //
delimiter ;

call add_new_contact (13,7,6,3,'2019-10-10','2019-12-10',3000000,5000000);

call add_new_contact (
id_hop_dong,
id_nhan_vien,
id_khach_hang,
id_dich_vu,
ngay_lam_hop_dong,
ngay_ket_thuc,
tien_dat_coc,
tong_tien);









