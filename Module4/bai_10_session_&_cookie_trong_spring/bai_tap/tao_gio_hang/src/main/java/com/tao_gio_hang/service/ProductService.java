package com.tao_gio_hang.service;

import com.tao_gio_hang.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(Integer id);

    void save(Product product);

    void remove(Integer id);

    void buyProduct(Integer id);

}
