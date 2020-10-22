package com.quan_ly_tinh.service;

import com.quan_ly_tinh.entity.Province;

import java.util.List;

public interface ProvinceService {

    List<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
