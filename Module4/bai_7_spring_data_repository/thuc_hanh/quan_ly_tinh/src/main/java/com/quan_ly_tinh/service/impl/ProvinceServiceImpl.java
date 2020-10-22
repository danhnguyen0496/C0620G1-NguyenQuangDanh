package com.quan_ly_tinh.service.impl;

import com.quan_ly_tinh.entity.Province;
import com.quan_ly_tinh.repository.ProvinceRepository;
import com.quan_ly_tinh.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public List<Province> findAll() {
        return this.provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return this.provinceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Province province) {
        this.provinceRepository.save(province);

    }

    @Override
    public void remove(Long id) {
        this.provinceRepository.deleteById(id);
    }
}
