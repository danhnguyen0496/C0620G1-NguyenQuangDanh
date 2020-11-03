package com.quan_ly_dien_thoai.service;

import com.quan_ly_dien_thoai.entity.Smartphone;
import org.springframework.stereotype.Service;


public interface SmartphoneService {
    Iterable<Smartphone> findAll();

    Smartphone findById(Integer id);

    Smartphone save(Smartphone phone);

    Smartphone remove(Integer id);
}
