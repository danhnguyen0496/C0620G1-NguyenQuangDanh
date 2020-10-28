package com.tao_gio_hang.service.impl;

import com.tao_gio_hang.entity.Product;
import com.tao_gio_hang.repository.ProductRepository;
import com.tao_gio_hang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return this.productRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public void remove(Integer id) {
        this.productRepository.deleteById(id);
    }

    @Override
    public void buyProduct(Integer id) {

    }


}
