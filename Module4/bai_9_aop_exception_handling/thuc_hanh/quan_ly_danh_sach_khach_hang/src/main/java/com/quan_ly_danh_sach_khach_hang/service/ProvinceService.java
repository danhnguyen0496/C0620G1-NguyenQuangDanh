package com.quan_ly_danh_sach_khach_hang.service;

import com.quan_ly_danh_sach_khach_hang.entity.Province;

import java.util.List;

public interface ProvinceService {

    List<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
